import { Component, Input, OnInit } from '@angular/core';
import { ApiOrderService } from '../../services/api-order.service';

@Component({
  selector: 'app-items-products',
  templateUrl: './items-products.component.html',
  styleUrls: ['./items-products.component.scss']
})
export class ItemsProductsComponent implements OnInit {

  @Input()
  idProduct = 0
  @Input()
  brandProduct= "0"
  @Input()
  descriptionProduct= "0"
  @Input()
  imgProduct= "0"
  @Input()
  priceProduct=0


  constructor(private apiOrder:ApiOrderService) { }

  ngOnInit(): void {
  }

  addToOrder(){
    const product = {id:this.idProduct, brand:this.brandProduct, price:this.priceProduct}
    this.apiOrder.order.push(product)
  }

}
