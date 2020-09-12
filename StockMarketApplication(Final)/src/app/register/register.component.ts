import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {RegisterService} from '../service/register.service';
import { UserService } from '../service/user.service';
import {User} from '../class/user';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  form: FormGroup;
  loading = false;
  submitted = false;
  //registerservice:RegisterService;
  user:User;

  constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private registerservice: RegisterService,
    private userservice: UserService,
  ) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', Validators.required],
      acceptTerms: [false, Validators.requiredTrue],
      userName: ['', Validators.required]
    });
  }
  get f() { return this.form.controls; }
  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.form.invalid) {
      return;
    }

    this.loading = true;
    console.log(1);
    console.log(this.f.userName.value);
    this.user = new User(this.f.userName.value, this.f.password.value);
    //this.user.userName = this.f.userName.value;
    //this.user.password = this.f.password.value;
    console.log(this.user);
    this.userservice.register(this.user).subscribe(response=>{
      console.log(response);
    })

    this.router.navigate(['/login']);

}
}
