import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-products',
  templateUrl: './list-products.component.html',
  styleUrls: ['./list-products.component.scss']
})
export class ListProductsComponent implements OnInit {

  products = [{"idProduct":1,"nameProduct":"Air Guitare"},{"idProduct":2,"nameProduct":"Capote à la mayonnaise"}]

  constructor() { }

  ngOnInit(): void {
    console.log(this.products)
  }

}
