import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-items-products',
  templateUrl: './items-products.component.html',
  styleUrls: ['./items-products.component.scss']
})
export class ItemsProductsComponent implements OnInit {

  @Input()
  idProduct: number
  @Input()
  nameProduct: string

  constructor() { }

  ngOnInit(): void {
  }

}
