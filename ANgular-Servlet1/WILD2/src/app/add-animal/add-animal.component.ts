import { Component, OnInit } from '@angular/core';
import{Animal1Service} from '../animal1.service';


@Component({
  selector: 'app-add-animal',
  templateUrl: './add-animal.component.html',
  styleUrls: ['./add-animal.component.css']
})
export class AddAnimalComponent implements OnInit {
users: any[];
user= {
name: '',
id: ''

}
	


  constructor(private animalService: Animal1Service) { }

  ngOnInit() {
  }
onAdd(){
	console.log(this.user.id);
	console.log(this.user.name);
	this.animalService.addUser(this.user).subscribe(user => (this.users.unshift(user)));
}
}
