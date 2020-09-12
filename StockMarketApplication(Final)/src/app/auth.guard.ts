import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { UserService } from './service/user.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(
    private router: Router,
    private userService: UserService
  ) { }
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot) {
    const user = this.userService.userValue;
    if (user) {
      // check if route is restricted by role
      if (route.data.roles && !route.data.roles.includes(user.role)) {
        // role not authorized so redirect to home page
        this.router.navigate(['/profile']);
        return false;
      }

      // authorized so return true
      return true;
    }

    // not logged in so redirect to login page with the return url 
    this.router.navigate(['/login']);
    return false;
  }
  
}
