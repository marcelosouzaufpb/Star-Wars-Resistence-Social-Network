import { Component, OnInit } from '@angular/core';
import { RebeldeService } from 'src/app/shared/service/rebelde.service';
import { Rebelde } from 'src/app/shared/model/rebelde.model';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {

  rebeldes: Rebelde[];
  rebeldesNTraidores: Rebelde[];
  
  constructor(public rebeldeService: RebeldeService) { 
    this.rebeldes = [];
    this.rebeldesNTraidores = [];
  }

  ngOnInit(): void {
    this.getRebeldes();
 }

  getRebeldes(): void {
    this.rebeldeService.get().subscribe((result: any) => {
      this.rebeldes = result;
      this. getNTraidores();
    });
  }

  getNTraidores(): void {
    for (let rebelde of this.rebeldes) {
      if (rebelde.eTraidor !== true) {
        this.rebeldesNTraidores.push(rebelde);
      }
    }
  }

}
