import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cacheable } from 'ts-cacheable';

@Injectable({
  providedIn: 'root'
})
export class ApiProductService {

  // apiUrl = 'http://localhost:8080/products'

  //Serveur Perso
  apiUrl = 'http://82.64.113.224:8080/products'

  constructor(private http: HttpClient) { }

  @Cacheable()
  getAllProducts(){
    return this.http.get(this.apiUrl)
  }

  @Cacheable()
  getProducts(productId: any){
    return this.http.get(this.apiUrl+'/'+productId);
  }

}
