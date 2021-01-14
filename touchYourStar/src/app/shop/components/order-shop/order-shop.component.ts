import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-shop',
  templateUrl: './order-shop.component.html',
  styleUrls: ['./order-shop.component.scss']
})
export class OrderShopComponent implements OnInit {

  orders=[{"id":1, "brand":"TEST"},{"id":2, "brand":"TEST"}]

  constructor() { }

  ngOnInit(): void {
  }

}
