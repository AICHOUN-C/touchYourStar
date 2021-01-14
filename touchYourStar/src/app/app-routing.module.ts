import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  {
    path: '', children: [
      { path: 'shop', loadChildren: () => import('./shop/shop.module').then(m => m.ShopModule) },
      { path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule) },
      { path: 'admin', loadChildren: () => import('./admin/admin.module').then(m => m.AdminModule) },
      { path: '', redirectTo: 'shop', pathMatch: 'full' },
      {path: '**', component:PageNotFoundComponent},
    ]
  },
  { path: '', redirectTo: 'shop', pathMatch: 'full' },
  {path: '**', component:PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
