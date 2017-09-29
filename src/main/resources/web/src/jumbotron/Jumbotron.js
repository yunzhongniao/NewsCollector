import React, { Component } from 'react';
import {Jumbotron, Button} from 'react-bootstrap';

class MyJumbotron extends Component {
	
  render() {
    return (
     <div>
     	  <Jumbotron>
		    <h1>Hello, Chihuo!</h1>
		    <p>zhe shi yi ge shen mi de wang zhan,zhuang zai zhe yi ge chi huo de meng xiang.Huan ying jia ru chi huo lian meng. Wo shi chi huo yunzhong.</p>
		    <p><Button bsStyle="primary">Learn more</Button></p>
		  </Jumbotron>
     </div>
    );
  }
}

export default MyJumbotron;