import {ANIMAL} from './animals/animal';
import {MANIMAL} from './animals/mock-animal';
import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';

import { map } from 'rxjs/operators';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class Animal1Service {

  constructor(public http : HttpClient) {
   }
  getAnimals() :Observable <ANIMAL[]>
  {
  return of(MANIMAL);
  }
  getAnimal(id: number): Observable<ANIMAL>{
  return of(MANIMAL.find(i => i.id === id));
  }
  getDetails():Observable <any>
  {
  return this.http.get('http://localhost:8080/WILD/Details?').pipe(map(res => res));

  }
  addUser(user): Observable <any>{
  return this.http.post('http://localhost:8080/WILD/Details?',user).pipe(map(res => res));

  }
}
