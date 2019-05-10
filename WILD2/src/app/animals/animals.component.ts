import { Component, OnInit } from '@angular/core';

import {ANIMAL} from './animal';
import{Animal1Service} from '../animal1.service';
@Component({
  selector: 'app-animals',
  templateUrl: './animals.component.html',
  styleUrls: ['./animals.component.css']
})
export class AnimalsComponent implements OnInit {
	anima :ANIMAL[];
  constructor(private animalService: Animal1Service) { }
  
  getAnimals(): void{
  this.animalService.getAnimals().subscribe(anima => this.anima = anima);
  }

  ngOnInit() {
 this.getAnimals();  }

}
