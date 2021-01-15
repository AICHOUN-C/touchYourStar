import { Component } from '@angular/core';
import { ApiProductService } from './shop/services/api-product.service';
import { SeoService } from './shop/services/seo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'touchedByStar';

  products:any =[];

  constructor(private meta: SeoService, private apiProduct: ApiProductService) {
    this.apiProduct.getAllProducts().subscribe((data)=> this.products = data);
    this.meta.updateTitle();
    this.meta.updateMetaInfo("brand", "description");
  }

}
