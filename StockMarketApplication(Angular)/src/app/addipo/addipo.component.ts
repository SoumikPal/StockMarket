import { Component, OnInit } from '@angular/core';
import {Ipo} from '../class/ipo';
import {IposerviceService } from '../service/iposervice.service';
import {CompanyServiceService} from '../service/company-service.service';

@Component({
  selector: 'app-addipo',
  templateUrl: './addipo.component.html',
  styleUrls: ['./addipo.component.css']
})
export class AddipoComponent implements OnInit {

  companies;
  companyid;
  ipoModel =new Ipo('','','','');
  constructor(private iposervice:IposerviceService,private companyservice:CompanyServiceService) {
    this.companyservice.getCompanies().subscribe(response=>{
      this.companies=response;
      console.log(this.companies);
    })

  }

  ngOnInit(): void {
  }
  onSubmit(){
    this.ipoModel.companyid=this.companyid;
    this.iposervice.addIpo(this.ipoModel).subscribe();
  }

}
