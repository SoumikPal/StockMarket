import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map, finalize } from 'rxjs/operators';
import { User } from '../class/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private userSubject: BehaviorSubject<User>;
  public user: Observable<User>;
  myurl = "http://localhost:8080";

  constructor(private router: Router,
    private http: HttpClient) { 
    this.userSubject = new BehaviorSubject<User>(null);
    this.user = this.userSubject.asObservable();
    }
  public get userValue(): User {
    return this.userSubject.value;
  }
  login(user1) {
    return this.http.post<any>(this.myurl + '/signin', user1)
    .pipe(map(user => {
      if(user.userName=='som')
      user.role = 'ADMIN';
      else
      user.role='USER';
      this.userSubject.next(user);
      console.log(user);
      //this.startRefreshTokenTimer();
      //user.role='ADMIN';
      return user;
    }));;
  }

  register(user) {
    var a = this.http.post(this.myurl+'/signup', user);
    console.log(a);
    return a;
  }
  logout()
  {
    this.http.post<any>(this.myurl + '/logout', {}).subscribe();
    this.userSubject.next(null);
    this.router.navigate(['/login']);
    
  }




}
