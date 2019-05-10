import { Component, OnInit } from '@angular/core';
import {User} from '../User';
@Component({
  selector: 'app-signup-form',
  templateUrl: './signup-form.component.html',
  styleUrls: ['./signup-form.component.css']
})
export class SignupFormComponent implements OnInit {
gender= ['MALE','FEMALE','OTHERS'];
user1 = new User(72, 'Utkarsh Jain', this.gender[0], 22,'jainutkarsh567', '********','********');
submitted=false;
onSubmit(){
	this.submitted=true;
}
  constructor() { }

  ngOnInit() {
  }
  // TODO: Remove this when we're done
  get diagnostic() { return JSON.stringify(this.user1);

}
newUser(){
	this.user1 = new User(0, '',this.gender[0], 0, '','','');
}
}