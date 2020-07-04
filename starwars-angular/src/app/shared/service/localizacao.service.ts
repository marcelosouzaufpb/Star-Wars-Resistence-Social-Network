import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Localizacao } from '../model/localizacao.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LocalizacaoService {

  apiUrl = 'http://localhost:8080/starwars/localizacao';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(
    private httpClient: HttpClient
  ) { }

  public get(): Observable<Localizacao> {
    return this.httpClient.get<Localizacao>(this.apiUrl);
  }

  public getById(id: string): Observable<Localizacao> {
    return this.httpClient.get<Localizacao>(this.apiUrl + '/' + id);
  }

  public post(localizacao: any): Observable<Localizacao> {
    return this.httpClient.post<any>(this.apiUrl, localizacao, this.httpOptions);
  }

  public put(localizacao: any): Observable<Localizacao> {
    return this.httpClient.put<any>(this.apiUrl, localizacao, this.httpOptions);
  }

  public delete(localizacao: any): Observable<Localizacao> {
    return this.httpClient.delete<Localizacao>(this.apiUrl + '/' + localizacao, this.httpOptions);
  }
}