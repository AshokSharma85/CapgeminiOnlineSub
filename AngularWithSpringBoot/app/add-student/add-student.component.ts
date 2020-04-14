import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {

  stud:Student=new Student();

  constructor(private stuservice:StudentService) { }

  ngOnInit(): void {
  }

  createStudent():void
  {
    this.stuservice.createNewStudent(this.stud).subscribe(data=>
      {
        alert("student added");
      },
      error=>
      {
        console.log("erroor occured",error);
      }
    );
    

  }

}
