import { Component, OnInit } from '@angular/core';
import {IposerviceService} from '../service/iposervice.service'

@Component({
  selector: 'app-viewipo',
  templateUrl: './viewipo.component.html',
  styleUrls: ['./viewipo.component.css']
})
export class ViewipoComponent implements OnInit {

  ipos;
  constructor(private iposervice:IposerviceService) { }

  ngOnInit(): void {
    this.iposervice.getIpos().subscribe(response=>{
      this.ipos=response;
      console.log(response);
    })
  }

  deleteIpo(ipo){
  this.iposervice.deleteIpo(ipo.id).subscribe(
    response=>{
      let index=this.ipos.indexOf(ipo);
      this.ipos.splice(index,1);
    }
  )

  }

}
