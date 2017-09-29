import React, { Component } from 'react';
import {Image,Col,Row,Grid} from 'react-bootstrap';

class ContentItem extends Component {
	
  render() {
    return (
      <div>
          <Row>
              <Col sm={10} md={10}>
                <div className='image_div'>
                 <Image src="http://owb93gw1l.bkt.clouddn.com/%E5%90%83%E7%B3%95%E7%82%B9.jpg" style={{width: 500, height: 400}} contain />
                </div>
              </Col>
              <Col sm={2} md={2}>
                desc
              </Col>
          </Row>   
          <Row>
            <div>
            </div>
          </Row>   
      </div>
    );
  }
}

export default ContentItem;