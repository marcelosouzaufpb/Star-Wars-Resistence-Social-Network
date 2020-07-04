import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './views/home/home.component';
import { GameComponent } from './views/game/game.component';
import { HttpClientModule } from '@angular/common/http';
import { RegistroComponent } from './views/registro/registro.component';
import { NegocioComponent } from './views/negocio/negocio.component';
import { ReporteComponent } from './views/reporte/reporte.component';
import { LocalizacaoComponent } from './views/localizacao/localizacao.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    GameComponent,
    RegistroComponent,
    NegocioComponent,
    ReporteComponent,
    LocalizacaoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
