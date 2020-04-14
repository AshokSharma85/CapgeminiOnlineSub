import { Injectable } from '@angular/core';
import { Student } from './student';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  students:Student[]=[]
  constructor( private http:HttpClient) { }

   loaddata():Observable<any>
   {
     let url="http://localhost:1136/student";
     return this.http.get(url);
   }

   createNewStudent(student:Student):Observable<any>
   {
    let url="http://localhost:1136/student/new";
    return this.http.post(url,student,{responseType:'text'});

   }

}
