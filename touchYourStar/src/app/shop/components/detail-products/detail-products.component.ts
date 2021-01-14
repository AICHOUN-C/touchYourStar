import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { ApiProductService } from '../../services/api-product.service';

@Component({
  selector: 'app-detail-products',
  templateUrl: './detail-products.component.html',
  styleUrls: ['./detail-products.component.scss']
})
export class DetailProductsComponent implements OnInit {

  product: any;
  constructor(private route: ActivatedRoute, private apiProduct: ApiProductService) {
  }
  ngOnInit(): void {
    const productId = this.route.snapshot.paramMap.get('detailId');
    console.log(productId)
    this.apiProduct.getProducts(productId).subscribe((data) => this.product = data)
  }
}
