import React, { Component } from 'react';
import '../App.css';
import Content from '../content/Content.js'
import MyNav from '../nav/Nav.js'
import MyJumbotron from '../jumbotron/Jumbotron.js'
import {Grid, Button, Row , Col} from 'react-bootstrap';

class Framework extends Component {
	
  render() {
    return (
      <Grid>
	      <Row className="show-grid">
	      	<MyNav/>
	      </Row>
	      <Row>
	      	<MyJumbotron/>
	      </Row>
	      <Row className="show-grid">
	      	<Col sm={10} md={10}>
	      		<Content></Content>
	      	</Col>
	      	<Col sm={2} md={2}> This is right.</Col>
	      </Row>
      </Grid>
    );
  }
}

export default Framework;