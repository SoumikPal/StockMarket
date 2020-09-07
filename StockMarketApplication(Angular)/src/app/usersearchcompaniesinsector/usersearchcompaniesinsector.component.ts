import { Component, OnInit } from '@angular/core';
import {CompanyServiceService} from '../service/company-service.service';
import {SectorserviceService}  from '../service/sectorservice.service';

@Component({
  selector: 'app-usersearchcompaniesinsector',
  templateUrl: './usersearchcompaniesinsector.component.html',
  styleUrls: ['./usersearchcompaniesinsector.component.css']
})
export class UsersearchcompaniesinsectorComponent implements OnInit {

  sectors;
  sectorname;
  companies;
  constructor(private companyservice:CompanyServiceService,private sectorservice:SectorserviceService) {
    this.sectorservice.getSectors().subscribe(response=>{
      this.sectors=response;
   });
  }

  ngOnInit(): void {
  }
  onSubmit(){
    this.companyservice.getCompanyInSector(this.sectorname).subscribe(response=>{
      this.companies=response;

    })
  }

}
