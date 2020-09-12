import { Component, OnInit } from '@angular/core';
import { stockclass } from './stockclass';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-stockexchangeu',
  templateUrl: './stockexchangeu.component.html',
  styleUrls: ['./stockexchangeu.component.css']
})
export class StockexchangeuComponent implements OnInit {

  res: any; res2: any;
  mainbutton: Boolean;
  searchid: String;
  button1: Boolean; button2: Boolean; button3: Boolean;
  ex_id: number; ex_bf: String; ex_ct: number; ex_re: String;
  json;
  newx: stockclass = {
    id: undefined,
    brief: undefined,
    remarks: undefined,
    contact_id: undefined
  };
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  initpage() {
    this.mainbutton = !this.mainbutton;
  }
  setfalse() {
    this.button1 = false;
    this.button2 = false;
    this.button3 = false;
  }
  fun1() {
    this.setfalse();
    this.button1 = true;
  }
  fun2() {
    this.setfalse();
    this.button2 = true;
  }
  fun3() {
    this.setfalse();
    this.button3 = true;
  }
  getbyid() {
    this.http.get('http://localhost:8082/stock_exchange/' + this.searchid).subscribe(response => this.res = response);
  }
  getall() {
    this.http.get('http://localhost:8082/stock_exchange').subscribe(response => this.res2 = response);
  }
  additem() {
    this.newx.id = this.ex_id;
    this.newx.brief = this.ex_bf;
    this.newx.contact_id = this.ex_ct;
    this.newx.remarks = this.ex_re;
    this.http.post('http://localhost:8082/stock_exchange/', this.newx).toPromise().then((d: any) => {
      console.log(d);
      this.json = JSON.stringify(d.json);
    });
  }

}
