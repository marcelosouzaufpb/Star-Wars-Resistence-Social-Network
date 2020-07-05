import { Component, OnInit } from '@angular/core';
import { NgOption } from '@ng-select/ng-select';

@Component({
  selector: 'app-negocio',
  templateUrl: './negocio.component.html',
  styleUrls: ['./negocio.component.css']
})
export class NegocioComponent implements OnInit {

  countries: NgOption[] = [
    {id: 10, name: 'POLAND'},
    {id: 20, name: 'UK'},
    {id: 30, name: 'GERMANY'},
    {id: 40, name: 'NORWAY'},
    {id: 50, name: 'FINLAND'}
  ];

  constructor() { }

  ngOnInit(): void {
  }

  onChange = ($event: any): void => {
    console.log($event);
    console.log(`SELECTION CHANGED INTO ${$event.name || ''}`);
  }

}
