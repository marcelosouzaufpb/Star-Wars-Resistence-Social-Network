import { Component, OnInit } from '@angular/core';
import { NgOption } from '@ng-select/ng-select';
import { RebeldeService } from '../../shared/service/rebelde.service';
import { Rebelde } from 'src/app/shared/model/rebelde.model';

@Component({
  selector: 'app-negocio',
  templateUrl: './negocio.component.html',
  styleUrls: ['./negocio.component.css']
})
export class NegocioComponent implements OnInit {
  rebeldes: Rebelde;

  constructor(public rebeldeService: RebeldeService) { 
    this.rebeldeService.get().subscribe((result: Rebelde) => {
      this.rebeldes = result;
    });
  }

  ngOnInit(): void {
  }

  onChange = ($event: any): void => {
    console.log($event);
    console.log(`SELECTION CHANGED INTO ${$event.name || ''}`);
  }

}
