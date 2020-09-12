import { Component, OnInit } from '@angular/core';
import {Company} from '../company'
import { CompanyServiceService } from '../service/company-service.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-update-company',
  templateUrl: './update-company.component.html',
  styleUrls: ['./update-company.component.css']
})
export class UpdateCompanyComponent implements OnInit {


  companyModel;
  
  constructor(private companyService:CompanyServiceService,private route:ActivatedRoute) {
    let id=this.route.snapshot.paramMap.get('id');
    this.companyService.getCompanyById(id).subscribe(
      response=>{
        this.companyModel=response;
      }
    )
   }

  ngOnInit(): void {
  }
  onSubmit(){
    this.companyService.createCompany(this.companyModel).subscribe();

  }

}
