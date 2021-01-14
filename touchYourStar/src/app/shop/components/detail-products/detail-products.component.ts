import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-detail-products',
  templateUrl: './detail-products.component.html',
  styleUrls: ['./detail-products.component.scss']
})
export class DetailProductsComponent implements OnInit {

  post: any;
  constructor(private route: ActivatedRoute) {
   }

  ngOnInit(): void {
    const postId = this.route.snapshot.paramMap.get('detailId');
    console.log(postId)
  }
}
