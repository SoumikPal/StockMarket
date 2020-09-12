import { Component } from '@angular/core';
import { User } from './class/user';
import { UserService } from './service/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  Role = 'ADMIN';
  user: User;
  title = 'StockMarketApplication';
  constructor(private userService: UserService) {
    this.userService.user.subscribe(x => this.user = x);
  }

  logout() {
    this.userService.logout();
  }
}
