import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from '../page-not-found/page-not-found.component';
import { AdminComponent } from './admin.component';

const routes: Routes = [
  { path: '', component: AdminComponent },
  { path: '', redirectTo: '', pathMatch: 'full' },  
  {path: '**', component:PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
