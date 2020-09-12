import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  myurl = "http://localhost:8080/signin";

  constructor(private http: HttpClient) { }

  login(user){
    return this.http.post(this.myurl, user);
  }
}
