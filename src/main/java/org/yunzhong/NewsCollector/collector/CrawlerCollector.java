package org.yunzhong.NewsCollector.collector;

import org.yunzhong.NewsCollector.controller.vo.CrawlerVO;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

public class CrawlerCollector {
    private CrawlController controller = null;

    public void start(CrawlerVO crawlerVO) throws Exception {

        String crawlStorageFolder = "D:\\tmp\\crawler\\storage";
        int numberOfCrawlers = 3;

        CrawlConfig config = new CrawlConfig();
        config.setCrawlStorageFolder(crawlStorageFolder);
        config.setPolitenessDelay(1000);
        config.setMaxDepthOfCrawling(1);
        config.setIncludeBinaryContentInCrawling(false);
        config.setResumableCrawling(false);
        
        PageFetcher pageFetcher = new PageFetcher(config);
        RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
        robotstxtConfig.setEnabled(false);
        RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
        controller = new CrawlController(config, pageFetcher, robotstxtServer);
        controller.addSeed(crawlerVO.getSeed());

        controller.start(NewsCrawler.class, numberOfCrawlers);
    }

    public boolean running() {
        return !controller.isFinished();
    }
}