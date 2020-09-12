import { Component, OnInit } from '@angular/core';
import {Company} from '../company'
import { CompanyServiceService } from '../service/company-service.service';
import { SectorserviceService } from '../service/sectorservice.service';

@Component({
  selector: 'addCompany',
  templateUrl: './add-company.component.html',
  styleUrls: ['./add-company.component.css']
})
export class AddCompanyComponent implements OnInit {

  sectors;
  public companyModel=new Company('TestCompany','Tech Based','Ritesh Kumar','C001','','');
  constructor(private companyService:CompanyServiceService,private sectorservice:SectorserviceService) { 
       this.sectorservice.getSectors().subscribe(response=>{
         this.sectors=response;
       })
  }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.companyModel);
    this.companyService.createCompany(this.companyModel).subscribe();
  }
}
