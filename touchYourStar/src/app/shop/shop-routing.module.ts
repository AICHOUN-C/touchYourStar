import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DetailProductsComponent } from './components/detail-products/detail-products.component';
import { ShopComponent } from './shop.component';

const routes: Routes = [
  { path: 'list', component: ShopComponent },
  { path: 'list/:detailId', component: DetailProductsComponent },
  { path: '', redirectTo: 'list', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ShopRoutingModule { }
