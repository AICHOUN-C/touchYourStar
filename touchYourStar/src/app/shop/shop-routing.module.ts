import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OrderShopComponent } from './components/order-shop/order-shop.component';
import { DetailProductsComponent } from './components/detail-products/detail-products.component';
import { ShopComponent } from './shop.component';


const routes: Routes = [
  { path: 'list', component: ShopComponent, data:{ title: "Touched By Star", description: "page d'acceuil" } },
  { path: 'list/:detailId', component: DetailProductsComponent, data:{ title: "Votre objet Touched By Star", description: 'détail sur votre objet sélectionné' } },
  { path: 'order', component: OrderShopComponent, data:{ title: "Votre commande de Star", description: 'détail de votre commande sur Touched By Star' }},
  { path: '', redirectTo: 'list', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ShopRoutingModule { }
