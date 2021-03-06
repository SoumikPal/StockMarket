import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Company} from '../company';

@Injectable({
  providedIn: 'root'
})
export class CompanyServiceService {

  private url='http://localhost:8081/company';
  constructor(private http:HttpClient) { }

  getCompanies(){

    return this.http.get(this.url);

  }
  getCompanyById(id){
    return this.http.get(this.url+'/'+id);

  }
  
  createCompany(post:Company){

    return this.http.post(this.url,post);

  }

   deleteCompany(post){

    return this.http.delete(this.url+'/'+post.id);

   }


   updateCompany(post){

     return this.http.put(this.url+'/'+post.userId,JSON.stringify(post));

   }

   getCompanyInSector(name){
     return this.http.get(this.url+'/'+'sector/'+name);
   }



}
