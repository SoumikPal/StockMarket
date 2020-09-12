import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

//import {FormsModule} from '@angular/forms'
import { CompaniesComponent } from './companies/companies.component';
import {CompanyServiceService} from './service/company-service.service';
import { AddCompanyComponent } from './add-company/add-company.component';
import { AddSectorComponent } from './add-sector/add-sector.component';
import { UpdateCompanyComponent } from './update-company/update-company.component';
import { ViewipoComponent } from './viewipo/viewipo.component';
import { AddipoComponent } from './addipo/addipo.component';
import { ViewSectorComponent } from './view-sector/view-sector.component';
import { ViewcompaniesuserComponent } from './viewcompaniesuser/viewcompaniesuser.component';
import { ViewipouserComponent } from './viewipouser/viewipouser.component';
import { UsersearchcompaniesinsectorComponent } from './usersearchcompaniesinsector/usersearchcompaniesinsector.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { LogoutComponent } from './logout/logout.component';
import { ProfileComponent } from './profile/profile.component';
import { StockComponent } from './stock/stock/stock.component';
import { StockexchangeComponent } from './stockexchange/stockexchange.component';
import { StockuComponent } from './stocku/stocku.component';
import { StockexchangeuComponent } from './stockexchangeu/stockexchangeu.component';


@NgModule({
  declarations: [
    AppComponent,
    CompaniesComponent,
    AddCompanyComponent,
    AddSectorComponent,
    UpdateCompanyComponent,
    ViewipoComponent,
    AddipoComponent,
    ViewSectorComponent,
    ViewcompaniesuserComponent,
    ViewipouserComponent,
    UsersearchcompaniesinsectorComponent,
    LoginComponent,
    RegisterComponent,
    LogoutComponent,
    ProfileComponent,
    StockComponent,
    StockexchangeComponent,
    StockuComponent,
    StockexchangeuComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule, 
    ReactiveFormsModule
  ],
  providers: [CompanyServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
