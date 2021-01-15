import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Products } from '../models/Products';

@Injectable({
  providedIn: 'root'
})
export class ApiOrderService {

  apiUrl = 'http://localhost:8080/orderlist'

  //Serveur Perso
  // apiUrl = 'http://82.64.113.224:8080/orderlist'

  constructor(private http: HttpClient) { }

  getOrderList(){
    return this.http.get(this.apiUrl)
  }

  postOrderList(product:Products):Observable<Object>{
    return this.http.post(this.apiUrl+"/create", product);
  }

}
