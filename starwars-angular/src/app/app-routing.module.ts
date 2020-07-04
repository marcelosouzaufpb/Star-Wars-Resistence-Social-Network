import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './views/home/home.component';
import { GameComponent } from './views/game/game.component';
import { LocalizacaoComponent } from './views/localizacao/localizacao.component';
import { ReporteComponent } from './views/reporte/reporte.component';
import { RegistroComponent } from './views/registro/registro.component';
import { NegocioComponent } from './views/negocio/negocio.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'game', component: GameComponent },
  { path: 'game/negocio', component: NegocioComponent },
  { path: 'game/registro', component: RegistroComponent },
  { path: 'game/reporte', component: ReporteComponent },
  { path: 'game/localizacao', component: LocalizacaoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
