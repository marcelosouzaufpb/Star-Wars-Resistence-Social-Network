import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Rebelde } from 'src/app/shared/model/rebelde.model';
import { RebeldeService } from 'src/app/shared/service/rebelde.service';
import { Inventario } from 'src/app/shared/model/inventario.model';
import { Localizacao } from 'src/app/shared/model/localizacao.model';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  rebelde: Rebelde;
  localizacao: Localizacao;
  inventario: Inventario;
  inventarios: Inventario[];

  constructor(public rebeldeService: RebeldeService) { 
    this.rebelde = new Rebelde();
    this.inventario = new Inventario();
    this.localizacao = new Localizacao();
    this.inventarios = [];
  }

  ngOnInit(): void {
  }

  addItemIventario(): void {
    if ((this.inventario.item && this.inventario.pontos) != null) {
      this.inventarios.push(this.inventario);
      this.inventario = new Inventario();
    }
  }

  salvar(frm: FormGroup): void {
    this.rebelde.inventario = this.inventarios;
    this.rebelde.localizacao = this.localizacao;
    this.rebeldeService.post(this.rebelde).subscribe(result => {
      frm.reset();
    });
  }

}
