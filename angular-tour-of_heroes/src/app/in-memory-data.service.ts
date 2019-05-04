import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Hero } from './hero';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const heroes = [
      { id: 11, name: 'A' },
      { id: 12, name: 'B' },
      { id: 13, name: 'C' },
      { id: 14, name: 'D' },
      { id: 15, name: 'E' },
      { id: 16, name: 'F' },
      { id: 17, name: 'G' },
      { id: 18, name: 'H' },
      { id: 19, name: 'I' },
      { id: 20, name: 'J' }
    ];
    return {heroes};
  }

  // Overrides the genId method to ensure that a hero always has an id.
  // If the heroes array is empty,
  // the method below returns the initial number (11).
  // if the heroes array is not empty, the method below returns the highest
  // hero id + 1.
  genId(heroes: Hero[]): number {
    return heroes.length > 0 ? Math.max(...heroes.map(hero => hero.id)) + 1 : 11;
  }
}