import { Component, OnChanges, OnInit } from '@angular/core';
import { ApiOrderService } from '../../services/api-order.service';

@Component({
  selector: 'app-order-shop',
  templateUrl: './order-shop.component.html',
  styleUrls: ['./order-shop.component.scss']
})
export class OrderShopComponent implements OnInit, OnChanges {

  orders: any=[];
  totalPrice = 0;

  constructor(private apiOrder: ApiOrderService) { }

  ngOnInit(): void {
    this.apiOrder.getOrderList().subscribe((data) => this.orders = data)
  }

  ngOnChanges(): void {

  }

}
