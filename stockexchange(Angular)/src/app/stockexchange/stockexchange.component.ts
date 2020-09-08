import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { stockclass } from './stockclass.model';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-stockexchange',
  templateUrl: './stockexchange.component.html',
  styleUrls: ['./stockexchange.component.css']
})
export class StockexchangeComponent implements OnInit {
  res: any;
  res2:any;
  mainbutton: Boolean;
  searchid: String;
  button1: Boolean; button2:Boolean; button3: Boolean;
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  initpage(){
    this.mainbutton=!this.mainbutton;
  }
  setfalse(){
    this.button1=false;
    this.button2=false;
    this.button3=false;
  }
  fun1(){
    this.setfalse();
    this.button1=true;
  }
  fun2(){
    this.setfalse();
    this.button2=true;
  }
  fun3(){
    this.setfalse();
    this.button3=true;
  }
  getbyid(){
    this.http.get('http://localhost:8080/stock_exchange/'+this.searchid).subscribe(response =>this.res=response);
  }
  getall(){
    this.http.get('http://localhost:8080/stock_exchange').subscribe(response =>this.res2=response);
  }
}
