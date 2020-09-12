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
import {AuthGuard} from './auth.guard'
import {ProfileComponent} from './profile/profile.component'
import {StockexchangeComponent} from "./stockexchange/stockexchange.component"
import {StockComponent} from "./stock/stock/stock.component"
import { StockexchangeuComponent } from "./stockexchangeu/stockexchangeu.component"
import { StockuComponent } from "./stocku/stocku.component"

const routes: Routes = [
  {
    path:'admin/addcompany',
    component:AddCompanyComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  },
  {
    path:'admin/viewcompany',
    component:CompaniesComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  }
  ,
  {
    path:'admin/updatecompany/:id',
    component:UpdateCompanyComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  },
  {
    path:'admin/viewipo',
    component:ViewipoComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  }
  ,
  {
    path:'admin/addipo',
    component:AddipoComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  },
  {
    path:'admin/addsector',
    component:AddSectorComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  }
  ,
  {
    path:'admin/viewsector',
    component:ViewSectorComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  },
  {
    path: 'admin/stockexchange',
    component: StockexchangeComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  },
  {
    path: 'admin/stock',
    component: StockComponent,
    canActivate: [AuthGuard], data: { roles: ['ADMIN'] }
  },
  {
    path: 'user/stockexchange',
    component: StockexchangeuComponent,
    canActivate: [AuthGuard],
  },
  {
    path: 'user/stock',
    component: StockuComponent,
    canActivate: [AuthGuard],
  },
  {
    path:'user/viewcompany',
    component:ViewcompaniesuserComponent,
    canActivate: [AuthGuard]
  },
  {
    path:'user/viewipo',
    component:ViewipouserComponent,
    canActivate: [AuthGuard]
  },
  {
    path:'user/searchcompany',
    component:UsersearchcompaniesinsectorComponent,
    canActivate: [AuthGuard]
  },
  {
    path: 'profile',
    component: ProfileComponent,
    canActivate: [AuthGuard]
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
