import { Component, OnInit } from '@angular/core';
import {IposerviceService} from '../service/iposervice.service'

@Component({
  selector: 'app-viewipouser',
  templateUrl: './viewipouser.component.html',
  styleUrls: ['./viewipouser.component.css']
})
export class ViewipouserComponent implements OnInit {

  ipos;
  constructor(private iposervice:IposerviceService) { }

  ngOnInit(): void {
    this.iposervice.getIpos().subscribe(response=>{
      this.ipos=response;
      console.log(response);
    })
  }

}
