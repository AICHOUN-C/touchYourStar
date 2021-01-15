import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountAuthComponent } from './account-auth/account-auth.component';
import { AuthComponent } from './auth.component';

const routes: Routes = [
  { path: '', component: AuthComponent, data:{ title: "Connectez-vous au Star", description: "page de connexion de votre compte " } },
  { path: 'account', component: AccountAuthComponent, data:{ title: "Votre profile Star", description: "page de votre compte " } },
  { path: '', redirectTo: '', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }
