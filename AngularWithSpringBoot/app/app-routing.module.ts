import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewStudentComponent } from './view-student/view-student.component';
import { AddStudentComponent } from './add-student/add-student.component';


const routes: Routes = [

  {path:'view',component:ViewStudentComponent},
  {path:'add',component:AddStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
