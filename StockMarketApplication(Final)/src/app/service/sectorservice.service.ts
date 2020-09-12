import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SectorserviceService {
  

  myurl="http://localhost:8081/company/sector";
  constructor(private http:HttpClient) { }
  getSectors(){
    return this.http.get(this.myurl);
  }

  addSector(sector){
    return this.http.post(this.myurl,sector);
  }
  deletesector(id){
    return this.http.delete(this.myurl+'/'+id);
  }

}
