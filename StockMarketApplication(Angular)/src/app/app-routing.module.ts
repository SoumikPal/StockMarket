import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompaniesComponent } from './companies/companies.component';
import { AddCompanyComponent } from './add-company/add-company.component';
import { AppComponent } from './app.component';
import { UpdateCompanyComponent } from './update-company/update-company.component';
import { ViewipoComponent } from './viewipo/viewipo.component';
import { AddipoComponent } from './addipo/addipo.component';
import { AddSectorComponent } from './add-sector/add-sector.component';
import { ViewSectorComponent } from './view-sector/view-sector.component';
import { ViewcompaniesuserComponent } from './viewcompaniesuser/viewcompaniesuser.component';
import { ViewipouserComponent } from './viewipouser/viewipouser.component';
import { UsersearchcompaniesinsectorComponent } from './usersearchcompaniesinsector/usersearchcompaniesinsector.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { LogoutComponent } from './logout/logout.component';

const routes: Routes = [
  {
    path:'admin/addcompany',
    component:AddCompanyComponent
  },
  {
    path:'admin/viewcompany',
    component:CompaniesComponent
  }
  ,
  {
    path:'admin/updatecompany/:id',
    component:UpdateCompanyComponent
  },
  {
    path:'admin/viewipo',
    component:ViewipoComponent
  }
  ,
  {
    path:'admin/addipo',
    component:AddipoComponent
  },
  {
    path:'admin/addsector',
    component:AddSectorComponent
  }
  ,
  {
    path:'admin/viewsector',
    component:ViewSectorComponent
  },
  {
    path:'user/viewcompany',
    component:ViewcompaniesuserComponent
  },
  {
    path:'user/viewipo',
    component:ViewipouserComponent
  },
  {
    path:'user/searchcompany',
    component:UsersearchcompaniesinsectorComponent
  },
  {
    path: 'login',
    component: LoginComponent
   },
   {
    path: 'logout',
     component: LogoutComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  }
  
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
