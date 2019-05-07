

// inventions.service.ts 

// import the requied dependencies 
import { Injectable } from '@angular/core';

// import Invention class so we can use it here 
import { Invention } from './inventions.class'; 


// injectable is decorator used with angular services 
@Injectable()
export class InventionsService {

 // declare rawInventions array of type Invention to instantiate our mock inventions    
 rawInventions : Invention[] = [
  {
    name : 'Java',
    inventor : 'James Ghosling',
    year : '1995'
  } , 
  {
    name : 'Python', 
    inventor : 'Guido van Rosum',
    year: '1991'
  } , 
  {
    name : 'C++',
    inventor : 'Bjarne Stroustrup',
    year : '1983'
  }
]

  constructor() {

   }

// define a getInventions() method to get the default inventions  
   getInventions() : Invention[] {
     return this.rawInventions; 
   }

}