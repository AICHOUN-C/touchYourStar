import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { AdminComponent } from './admin.component';
import { PageNotFoundComponent } from '../page-not-found/page-not-found.component';


@NgModule({
  declarations: [AdminComponent, PageNotFoundComponent],
  imports: [
    CommonModule,
    AdminRoutingModule
  ]
})
export class AdminModule { }
