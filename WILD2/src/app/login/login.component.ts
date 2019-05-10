import { Component, OnInit } from '@angular/core';
import {LOGIN1} from './log';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

 login = new LOGIN1(
 'jainutkarsh567','********');

  constructor() { }

  ngOnInit() {
  }

}
