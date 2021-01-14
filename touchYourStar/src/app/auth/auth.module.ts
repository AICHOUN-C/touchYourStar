import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuthRoutingModule } from './auth-routing.module';
import { AuthComponent } from './auth.component';
import { FormsModule } from '@angular/forms';

import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatCardModule} from '@angular/material/card';
import { AccountAuthComponent } from './account-auth/account-auth.component';
import { PageNotFoundComponent } from '../page-not-found/page-not-found.component';


@NgModule({
  declarations: [AuthComponent, AccountAuthComponent, PageNotFoundComponent],
  imports: [
    CommonModule,
    FormsModule,
    MatIconModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatCardModule,
    AuthRoutingModule
  ]
})
export class AuthModule { }
