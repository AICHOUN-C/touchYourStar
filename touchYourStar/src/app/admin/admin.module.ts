import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { AdminComponent } from './admin.component';
import { PageNotFoundComponent } from '../page-not-found/page-not-found.component';
import {MatCardModule} from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';


@NgModule({
  declarations: [AdminComponent, PageNotFoundComponent],
  imports: [
    CommonModule,
    AdminRoutingModule,
    MatCardModule,
    MatIconModule
  ]
})
export class AdminModule { }
