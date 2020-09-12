import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class LogoutService {
  myurl = "http://localhost:8080/logout";

  constructor(private http: HttpClient, private route: ActivatedRoute,
    private router: Router) { }
  logout() {
    this.http.post(this.myurl,{}).subscribe();
    this.router.navigate(['/login']);
  }
}
