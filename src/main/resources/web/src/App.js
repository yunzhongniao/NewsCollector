import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Framework from './framework/Framework.js';
import MyFooter from './foot/footer.js';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Framework/>
        <MyFooter/>
      </div>
    );
  }
}

export default App;
