import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CompanyServiceService } from '../service/company-service.service';

@Component({
  selector: 'app-viewcompaniesuser',
  templateUrl: './viewcompaniesuser.component.html',
  styleUrls: ['./viewcompaniesuser.component.css']
})
export class ViewcompaniesuserComponent implements OnInit {

  company;
  
  constructor(private service: CompanyServiceService) { 
    
  }

  ngOnInit(): void {
  
    this.service.getCompanies().subscribe(response => {
     this.company=response;
      console.log(response);
    });
  }
}
