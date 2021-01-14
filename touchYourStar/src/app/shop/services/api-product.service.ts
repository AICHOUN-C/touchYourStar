import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiProductService {

  apiUrl = 'http://localhost:8080'

  constructor(private http: HttpClient) { }

  getAllProducts(){
    return this.http.get(this.apiUrl+'/products')
  }

}
