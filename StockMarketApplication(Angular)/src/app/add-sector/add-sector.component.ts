import { Component, OnInit } from '@angular/core';
import {Sector} from '../class/sector'
import {SectorserviceService} from '../service/sectorservice.service';

@Component({
  selector: 'app-add-sector',
  templateUrl: './add-sector.component.html',
  styleUrls: ['./add-sector.component.css']
})
export class AddSectorComponent implements OnInit {


  sectorModel=new Sector('Sector Name','Brief');
  constructor(private sectorservice:SectorserviceService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.sectorservice.addSector(this.sectorModel).subscribe();
    console.log(this.sectorModel);
  }

}
