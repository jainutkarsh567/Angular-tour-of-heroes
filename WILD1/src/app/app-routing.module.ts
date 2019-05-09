import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AnimalsComponent} from './animals/animals.component';
import { GalleryComponent } from './gallery/gallery.component';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
const routes: Routes = [
{path: '', redirectTo: '/home', pathMatch: 'full'}, 
{path : 'animals', component: AnimalsComponent},
{ path: 'home', component: HomeComponent},
{ path: 'gallery', component: GalleryComponent},
{ path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
