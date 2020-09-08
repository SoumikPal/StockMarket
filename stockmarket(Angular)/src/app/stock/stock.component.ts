import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { stock } from './stock.model';

@Component({
  selector: 'app-stock',
  templateUrl: './stock.component.html',
  styleUrls: ['./stock.component.css']
})
export class StockComponent implements OnInit {

  res: any;
  res2:any;
  mainbutton: Boolean;
  searchid: String;
  button1: Boolean; button2:Boolean; button3: Boolean;
  s_id: number; s_cp: number; s_op: number; s_to: number; s_cid: number; s_ex: String;
  json;
  newstock: stock={
    id : undefined,
    close_price: undefined,
  	company_turnover : undefined,
    date: undefined,
    date_time: undefined,
    open_price : undefined,
    company_id: undefined,
    stock_exchange: undefined
  };
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
    this.http.get('http://localhost:8080/stock/'+this.searchid).subscribe(response =>this.res=response);
  }
  getbycompanyid(){
    this.http.get('http://localhost:8080/stock/stockbycompanyid/'+this.searchid).subscribe(response =>this.res2=response);
  }
  additem(){
    this.newstock.id=this.s_id;
    this.newstock.close_price=this.s_cp;
    this.newstock.open_price=this.s_op;
    this.newstock.company_turnover=this.s_to;
    this.newstock.stock_exchange=this.s_ex.split(",").map(x=>+x);
    this.newstock.company_id=this.s_cid;
    this.newstock.date=new Date();
    this.newstock.date_time=new Date();
    this.http.post('http://localhost:8080/stock/',this.newstock).toPromise().then((d:any)=>{
      console.log(d);
      this.json=JSON.stringify(d.json);
    });
  }
}
