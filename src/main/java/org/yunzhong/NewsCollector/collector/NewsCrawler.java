package org.yunzhong.NewsCollector.collector;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewsCrawler extends WebCrawler {
    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg" + "|png|mp3|mp3|zip|gz))$");

    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        String href = url.getURL().toLowerCase();
        return !FILTERS.matcher(href).matches() && href.startsWith("http://www.xwlb.tv");
    }

    @Override
    public void visit(Page page) {
        Date today = new Date();
        String url = page.getWebURL().getURL();
        try {
            if (url.startsWith("http://www.xwlb.tv/xinwenlianbo")) {
                log.info("list page {}.", url);
                return;
            }
            if (page.getParseData() instanceof HtmlParseData) {
                HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
                String html = htmlParseData.getHtml();
                final Document htmlDoc = Jsoup.parse(html);
                final Elements timeEs = htmlDoc.select("div.post_time");
                final Elements bodyEs = htmlDoc.select("div.post_body");

                if (timeEs.isEmpty() || bodyEs.isEmpty()) {
                    log.info("Failed to get body list of url {}", url);
                    return;
                }
                final Element timeE = timeEs.get(0);
                final Element bodyE = bodyEs.get(0);
                final String time = timeE.text();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd yyyy mm");
                final String todayStr = dateFormat.format(today);
                if (todayStr.equals(time)) {
                    final Elements bodyPs = bodyE.select("p");
                    StringBuilder bodyBuilder = new StringBuilder();
                    final Iterator<Element> bodyPIterator = bodyPs.iterator();
                    while (bodyPIterator.hasNext()) {
                        final Element next = bodyPIterator.next();
                        bodyBuilder.append(next.text());
                    }
                    log.info("{} time content: {}", time, bodyBuilder.toString());
                } else {
                    log.info("old date {}", time);
                }
            }
        } catch (Exception e) {
            log.error("Failed to parse url {}", url);
        }
    }
}
