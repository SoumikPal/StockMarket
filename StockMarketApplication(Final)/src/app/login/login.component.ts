import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from '../service/login.service';
import { UserService } from '../service/user.service';
import {User} from '../class/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: FormGroup;
  loading = false;
  submitted = false;
  user:User;

  constructor(private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private loginservice: LoginService,
    private userservice: UserService) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }
  get f() { return this.form.controls; }
  onSubmit() {
    this.submitted = true;



    // stop here if form is invalid
    if (this.form.invalid) {
      return;
    }
    //console.log(this.f.username.value);
    this.loading = true;
    this.user = new User(this.f.username.value, this.f.password.value);
    //this.user.userName = this.f.username.value;
    //this.user.password = this.f.password.value;
    this.userservice.login(this.user).subscribe(response=>{
      console.log(response);
    })
    
    this.router.navigate(['/profile']);
  }

}
