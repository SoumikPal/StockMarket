import { Component, OnInit } from '@angular/core';
import {SectorserviceService} from '../service/sectorservice.service';

@Component({
  selector: 'app-view-sector',
  templateUrl: './view-sector.component.html',
  styleUrls: ['./view-sector.component.css']
})
export class ViewSectorComponent implements OnInit {

  sectors:any;
  constructor(private sectorservice:SectorserviceService) { }

  ngOnInit(): void {
    this.sectorservice.getSectors().subscribe(response=>{
      this.sectors=response;
      console.log(response);
    })
  }
  
   deleteSector(sector){
     this.sectorservice.deletesector(sector.id).subscribe(response=>{
      let index=this.sectors.indexOf(sector);
      this.sectors.splice(index,1);

     })
   }


}
