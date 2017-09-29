import React, { Component } from 'react';
import {Panel} from 'react-bootstrap';

class MyFooter extends Component {
	
  render() {
    return (
     <div>
     	  <Panel footer="Panel footer">
          footer
        </Panel>
     </div>
    );
  }
}

export default MyFooter;