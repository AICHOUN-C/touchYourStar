import { Component, OnChanges, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiOrderService } from '../../services/api-order.service';

@Component({
  selector: 'app-order-shop',
  templateUrl: './order-shop.component.html',
  styleUrls: ['./order-shop.component.scss']
})
export class OrderShopComponent implements OnInit, OnChanges {

  orders: any = [];
  totalPrice = 0;

  constructor(private apiOrder: ApiOrderService, private router: Router) { }

  ngOnInit(): void {
    this.apiOrder.getOrderList().subscribe((data) => this.orders = data)
  }

  ngOnChanges(): void {

  }

  delete(element: number) {
    this.apiOrder.deleteBlocky(element)
      .subscribe(
        data => {
          console.log(data);
          this.reload()
        },
        error => console.log(error));

  }
  reload() {
    document.location.reload();
  }

}
