import { Component, OnInit } from '@angular/core';
import { ApiProductService } from '../../services/api-product.service';

@Component({
  selector: 'app-list-products',
  templateUrl: './list-products.component.html',
  styleUrls: ['./list-products.component.scss']
})
export class ListProductsComponent implements OnInit {
  
  products:any =[]

  constructor(private apiProduct: ApiProductService) { }

  ngOnInit(): void {
    this.apiProduct.getAllProducts().subscribe((data)=> this.products = data)
  }

}
