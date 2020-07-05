import { Component, OnInit } from '@angular/core';
import { NgOption } from '@ng-select/ng-select';
import { Rebelde } from 'src/app/shared/model/rebelde.model';
import { RebeldeService } from 'src/app/shared/service/rebelde.service';
import { Localizacao } from 'src/app/shared/model/localizacao.model';
import { FormGroup } from '@angular/forms';


@Component({
  selector: 'app-localizacao',
  templateUrl: './localizacao.component.html',
  styleUrls: ['./localizacao.component.css']
})
export class LocalizacaoComponent implements OnInit {

  rebeldes: Rebelde;
  rebelde: Rebelde;
  localizacao: Localizacao;

  constructor(public rebeldeService: RebeldeService) {
    this.localizacao = new Localizacao();
    this.rebelde = new Rebelde();
  }

  ngOnInit(): void {
    this.getAllRebeldes();
  }

  getAllRebeldes(): void {
    this.rebeldeService.get().subscribe((result: Rebelde) => {
      this.rebeldes = result;
    });
  }

  onChange = ($event: any): void => {
    this.rebelde = $event;
  }

  validaLocalizacao(localizacao: Localizacao): boolean {
    if ((localizacao.latitude && localizacao.longitude && localizacao.nome) === null) {
      return false;
    } else {
      return true;
    }
  }

  atualizar(frm: FormGroup): void {
    if (this.validaLocalizacao(this.localizacao)) {
      this.rebelde.localizacao = this.localizacao;
      this.rebeldeService.put(this.rebelde).subscribe(result => {
        frm.reset();
      });
    }
  }
}
