import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-items-products',
  templateUrl: './items-products.component.html',
  styleUrls: ['./items-products.component.scss']
})
export class ItemsProductsComponent implements OnInit {

  @Input()
  idProduct = 0
  @Input()
  nameProduct= "0"
  @Input()
  descriptionProduct= "0"
  @Input()
  imgProduct= "0"
  @Input()
  priceProduct=0
  constructor() { }

  ngOnInit(): void {
  }

}
