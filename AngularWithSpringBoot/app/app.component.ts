import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Onlineangular';
  myresponse:any;
  appUrl='http://localhost:1136';

constructor(private _http:HttpClient){}

getAllStudents() {
    
  this._http.get(this.appUrl + '/student').subscribe(
    data => {
      this.myresponse = data;
    },
    error => {
      console.log('Error occured', error);
    }
  );
}

}
