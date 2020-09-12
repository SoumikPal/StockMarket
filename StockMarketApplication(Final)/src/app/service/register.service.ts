import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  myurl = "http://localhost:8080/signup";

  constructor(private http: HttpClient) { }
  register(user) {
    return this.http.post(this.myurl, user);
  }
}
