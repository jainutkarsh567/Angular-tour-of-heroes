import {ANIMAL} from './animals/animal';
import {MANIMAL} from './animals/mock-animal';
import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Animal1Service {

  constructor() { }
  getAnimals() :Observable <ANIMAL[]>
  {
  return of(MANIMAL);
  }
  getAnimal(id: number): Observable<ANIMAL>{
  return of(MANIMAL.find(i => i.id === id));
  }
}
