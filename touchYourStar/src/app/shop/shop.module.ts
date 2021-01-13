import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ShopRoutingModule } from './shop-routing.module';
import { ShopComponent } from './shop.component';
import { ListProductsComponent } from './components/list-products/list-products.component';
import { ItemsProductsComponent } from './components/items-products/items-products.component';
import {MatCardModule} from '@angular/material/card';
import { DetailProductsComponent } from './components/detail-products/detail-products.component';


@NgModule({
  declarations: [ShopComponent, ListProductsComponent, ItemsProductsComponent, DetailProductsComponent],
  imports: [
    CommonModule,
    ShopRoutingModule,
    MatCardModule
  ]
})
export class ShopModule { }