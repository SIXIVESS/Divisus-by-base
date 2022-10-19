class MyCalendar extends React.Component {
    constructor() {
      super();
      this.state = {
        logs: [],
      };
    }
  
    addLog(message) {
      this.setState({ logs: this.state.logs.concat([message]) });
    }
  
    render() {
      return (
        <div>
          <div id="events-log">
            <h3>Events</h3>
            {this.state.logs.map(log => <div key={log}>{log}</div>)}
          </div>
          <Calendar
            enableRangeSelection={true}
            onDayClick={e => this.addLog(`Click on day: ${e.date.toLocaleDateString()} (${e.events.length} events)`)}
            onDayContextMenu={e => this.addLog(`Right-click on day: ${e.date.toLocaleDateString()} (${e.events.length} events)`)} 
            onRangeSelected={e => this.addLog(`Select a range: ${e.startDate.toLocaleDateString()}  - ${e.endDate.toLocaleDateString()}`)} 
            onYearChanged={e => this.addLog(`Year changed: ${e.currentYear}`)}
            onRenderEnd={e => this.addLog(`Render end: ${e.currentYear}`)}
            />
        </div>
      );
    }
  }
  
  ReactDOM.render(<MyCalendar />, document.getElementById('app'));