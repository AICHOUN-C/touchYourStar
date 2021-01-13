import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ShopRoutingModule } from './shop-routing.module';
import { ShopComponent } from './shop.component';
import { ListProductsComponent } from './components/list-products/list-products.component';
import { ItemsProductsComponent } from './components/items-products/items-products.component';


@NgModule({
  declarations: [ShopComponent, ListProductsComponent, ItemsProductsComponent],
  imports: [
    CommonModule,
    ShopRoutingModule
  ]
})
export class ShopModule { }
