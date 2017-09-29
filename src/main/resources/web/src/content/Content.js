import React, { Component } from 'react';
import ContentItem from './ContentItem.js';
import {ListGroup, ListGroupItem} from 'react-bootstrap';

class Content extends Component {
	
  render() {
    return (
      <div>
      		<ListGroup>
			    <ListGroupItem><ContentItem/></ListGroupItem>
			    <ListGroupItem><ContentItem/></ListGroupItem>
			    <ListGroupItem>...</ListGroupItem>
			</ListGroup>
      </div>
    );
  }
}

export default Content;