import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountAuthComponent } from './account-auth/account-auth.component';
import { AuthComponent } from './auth.component';

const routes: Routes = [
  { path: '', component: AuthComponent },
  { path: 'account', component: AccountAuthComponent },
  { path: '', redirectTo: '', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }
