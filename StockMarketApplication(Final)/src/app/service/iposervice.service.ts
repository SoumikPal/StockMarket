import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class IposerviceService {


  private ipourl='http://localhost:8081/ipo';

  constructor(private http:HttpClient) { }
  getIpos(){
    return this.http.get(this.ipourl);
  }
  
  addIpo(ipo){
    return this.http.post(this.ipourl,ipo);
  }
  deleteIpo(id){
    return this.http.delete(this.ipourl+'/'+id);

  }
}
