import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OrderShopComponent } from './components/order-shop/order-shop.component';
import { DetailProductsComponent } from './components/detail-products/detail-products.component';
import { ShopComponent } from './shop.component';
import { PageNotFoundComponent } from '../page-not-found/page-not-found.component';


const routes: Routes = [
  { path: 'list', component: ShopComponent },
  { path: 'list/:detailId', component: DetailProductsComponent },
  { path: 'order', component: OrderShopComponent },
  { path: '', redirectTo: 'list', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ShopRoutingModule { }
