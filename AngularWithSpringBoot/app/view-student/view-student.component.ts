import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { Student } from '../student';

@Component({
  selector: 'app-view-student',
  templateUrl: './view-student.component.html',
  styleUrls: ['./view-student.component.css']
})
export class ViewStudentComponent implements OnInit {

  constructor(private stuservice:StudentService) { }
   students:Student[]=[];
   
  ngOnInit(): void {
    this.stuservice.loaddata().subscribe(data=>
      {
        this.students=data;
      },
      error=>
      {
        console.log("erroor occured",error);
      }
      );

  }

}
