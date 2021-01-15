import { Component, Input, OnInit } from '@angular/core';
import { Products } from '../../models/Products';
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
  brandProduct = "0"
  @Input()
  descriptionProduct = "0"
  @Input()
  imgProduct = "0"
  @Input()
  priceProduct = 0

  productShop!: Products;

  constructor(private apiOrder: ApiOrderService) { }

  ngOnInit(): void {
    this.productShop = new Products(this.idProduct,
      "",
      this.descriptionProduct,
      this.imgProduct, this.brandProduct,
      this.priceProduct,
      1,
      "");
  }

  addToOrder() {
    this.apiOrder.postOrderList(this.productShop).subscribe(data => {
      console.log(data);
      this.productShop = new Products(this.idProduct,
        "",
        this.descriptionProduct,
        this.imgProduct, this.brandProduct,
        this.priceProduct,
        1,
        "");
    }, error => console.log(error));
  }
}