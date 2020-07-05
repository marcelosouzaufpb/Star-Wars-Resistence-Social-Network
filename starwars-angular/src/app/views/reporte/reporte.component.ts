import { Component, OnInit } from '@angular/core';
import { NgOption } from '@ng-select/ng-select';
import { Rebelde } from 'src/app/shared/model/rebelde.model';
import { RebeldeService } from 'src/app/shared/service/rebelde.service';
import { ReporteTraicaoService } from 'src/app/shared/service/reporte-traicao.service';
import { FormGroup } from '@angular/forms';
import { ReporteTraicao } from 'src/app/shared/model/reporteTraicao.model';
import { from } from 'rxjs';

@Component({
  selector: 'app-reporte',
  templateUrl: './reporte.component.html',
  styleUrls: ['./reporte.component.css']
})
export class ReporteComponent implements OnInit {

  rebeldes: Rebelde;
  traidores: ReporteTraicao[];

  reporte: ReporteTraicao;
  rebelde: Rebelde;
  traidor: Rebelde;

  constructor(public rebeldeService: RebeldeService, public reporteTraicaoService: ReporteTraicaoService) {
    this.rebelde = new Rebelde();
    this.traidor = new Rebelde();
    this.reporte = new ReporteTraicao();
  }

  ngOnInit(): void {
    this.getAllRebeldes();
  }

  getAllRebeldes(): void {
    this.rebeldeService.get().subscribe((result: Rebelde) => {
      this.rebeldes = result;
    });
  }


  onChangeTraidor = ($event: any): void => {
    if (this.traidor !== this.rebelde) {
      this.traidor = $event;
    }
  }
  onChangeRebelde = ($event: any): void => {
    if (this.rebelde !== this.traidor) {
      this.rebelde = $event;
    }
  }

  reporteTraidor(traidor: FormGroup): void {
    this.reporte.traidor = this.traidor;
    this.reporte.autor = this.rebelde;
    this.reporteTraicaoService.post(this.reporte).subscribe(result => {
      traidor.reset();
    });
    this.getTraidores();
  }

  getTraidores(): void {
    this.reporteTraicaoService.get().subscribe((result: any) => {
      this.traidores = result;
    });
    this.isTraidor();
  }

  isTraidor(): void {
    var qtd = 0;
    for (let tra of this.traidores) {
      if (tra.traidor.nome === this.traidor.nome) {
        qtd++;
      }
    }
    console.log(qtd)
    if (qtd >= 3) {
      this.traicaoConfirmada();
    }
  }

  traicaoConfirmada(): void {
    this.traidor.eTraidor = true;
    this.rebeldeService.put(this.traidor).subscribe(result => {
    });
  }

}
