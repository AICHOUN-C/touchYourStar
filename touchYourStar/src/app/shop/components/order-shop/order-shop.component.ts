import { Component, OnInit } from '@angular/core';
import { ApiOrderService } from '../../services/api-order.service';

@Component({
  selector: 'app-order-shop',
  templateUrl: './order-shop.component.html',
  styleUrls: ['./order-shop.component.scss']
})
export class OrderShopComponent implements OnInit {

  orders=[]

  constructor(private apiOrder: ApiOrderService) { }

  ngOnInit(): void {
    this.orders = this.apiOrder.order
  }

}
