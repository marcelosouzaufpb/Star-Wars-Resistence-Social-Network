import { Component, OnInit } from '@angular/core';
import { NgOption } from '@ng-select/ng-select';
import { RebeldeService } from '../../shared/service/rebelde.service';
import { Rebelde } from 'src/app/shared/model/rebelde.model';
import { Inventario } from 'src/app/shared/model/inventario.model';
import { AotSummaryResolver } from '@angular/compiler';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-negocio',
  templateUrl: './negocio.component.html',
  styleUrls: ['./negocio.component.css']
})
export class NegocioComponent implements OnInit {
  rebeldes: Rebelde[];

  rebeldeOne: Rebelde;
  rebeldeTwo: Rebelde;

  inventarioOne: Inventario[];
  inventarioTwo: Inventario[];

  escolharOne: Inventario;
  escolharTwo: Inventario;

  carrinhoOne: Inventario[];
  carrinhoTWo: Inventario[];

  pontosOne: number;
  pontosTwo: number;

  constructor(public rebeldeService: RebeldeService) {
    this.rebeldeOne = new Rebelde();
    this.rebeldeTwo = new Rebelde();
    this.inventarioOne = [];
    this.inventarioTwo = [];
    this.escolharOne = new Inventario();
    this.escolharTwo = new Inventario();
    this.carrinhoOne = [];
    this.carrinhoTWo = [];
    this.pontosOne = 0;
    this.pontosTwo = 0;
  }

  ngOnInit(): void {
    this.getRebeldes();
  }

  getRebeldes(): void {
    this.rebeldeService.get().subscribe((result: any) => {
      this.rebeldes = result;
    });
  }

  onChangeRebeldeOne = ($event: any): void => {
    this.rebeldeOne = $event;
    this.inventarioOne = $event.inventario;
  }

  onChangeRebeldeTwo = ($event: any): void => {
    this.rebeldeTwo = $event;
    this.inventarioTwo = $event.inventario;
  }

  onChangeOne = ($event: any): void => {
    this.escolharOne = $event;
  }

  onChangetwo = ($event: any): void => {
    this.escolharTwo = $event;
  }

  addCarrinhoOne(): void {
    this.carrinhoOne.push(this.escolharOne);
    this.pontosOne += this.escolharOne.pontos;
    const atual: Inventario[] = [];
    for (let i of this.inventarioOne) {
      if (this.escolharOne !== i) {
        atual.push(i);
      }
      this.inventarioOne = atual;
    }
  }

  addCarrinhoTwo(): void {
    this.carrinhoTWo.push(this.escolharTwo);
    this.pontosTwo += this.escolharTwo.pontos;
    const atual: Inventario[] = [];
    for (let i of this.inventarioTwo) {
      if (this.escolharTwo !== i) {
        atual.push(i);
      }
      this.inventarioTwo = atual;
    }
  }

  removerCarrinhoOne(inventario: Inventario): void {
    this.inventarioOne.push(inventario);
    this.pontosOne -= inventario.pontos;
    const atual: Inventario[] = [];
    for (let i of this.carrinhoOne) {
      if (i !== inventario) {
        atual.push(i);
      }
    }
    this.carrinhoOne = atual;
  }

  removerCarrinhoTwo(inventario: Inventario): void {
    this.inventarioTwo.push(inventario);
    this.pontosTwo -= inventario.pontos;
    const atual: Inventario[] = [];
    for (let i of this.carrinhoTWo) {
      if (i !== inventario) {
        atual.push(i);
      }
    }
    this.carrinhoTWo = atual;
  }

  reaizarTroca() {
    for (let inventarioOne of this.carrinhoOne) {
      this.rebeldeOne.inventario.push(inventarioOne);
    }

    for (let inventarioTwo of this.carrinhoOne) {
      this.rebeldeTwo.inventario.push(inventarioTwo);
    }
  }

  trocar() {
    if (this.pontosOne === this.pontosTwo) {
      this.reaizarTroca();
      this.rebeldeService.put(this.rebeldeOne).subscribe(result => {
        console.log(result);
      });

      this.rebeldeService.put(this.rebeldeTwo).subscribe(result => {
        console.log(result);
      });
    }
  }

}
