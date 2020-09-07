import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CompanyServiceService } from '../service/company-service.service';

@Component({
  selector: 'app-companies',
  templateUrl: './companies.component.html',
  styleUrls: ['./companies.component.css']
})
export class CompaniesComponent implements OnInit {


  baseurl='admin/updatecompany/';
  baseipo='admin/addipo/'

  
  company;
  
  constructor(private service: CompanyServiceService) { 
    
  }

  createPost(post){
    
    this.service.createCompany(post).subscribe(
      response=>{
        post['userId']=response['id'];
        this.company.splice(0,0,post)
        console.log(response);
      }
    );
  }
  
  updateCompany(post){
    this.service.updateCompany(post).subscribe(
      response=>{
        console.log(response);
      }
    )
  }



  deleteCompany(post){
    this.service.deleteCompany(post).subscribe(
      response=>{
        let index=this.company.indexOf(post);
        this.company.splice(index,1);
      }
    )
  }

  ngOnInit(): void {
  
    this.service.getCompanies().subscribe(response => {
     this.company=response;
      console.log(response);
    });
  }

}
