import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ReporteTraicao } from '../model/reporteTraicao.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReporteTraicaoService {

  apiUrl = 'http://localhost:8080/starwars/reporteTraicao';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(
    private httpClient: HttpClient
  ) { }

  public get(): Observable<ReporteTraicao> {
    return this.httpClient.get<ReporteTraicao>(this.apiUrl);
  }

  public getById(id: string): Observable<ReporteTraicao> {
    return this.httpClient.get<ReporteTraicao>(this.apiUrl + '/' + id);
  }

  public post(reporteTraicao: any): Observable<ReporteTraicao> {
    return this.httpClient.post<any>(this.apiUrl, reporteTraicao, this.httpOptions);
  }

  public put(reporteTraicao: any): Observable<ReporteTraicao> {
    return this.httpClient.put<any>(this.apiUrl, reporteTraicao, this.httpOptions);
  }

  public delete(reporteTraicao: any): Observable<ReporteTraicao> {
    return this.httpClient.delete<ReporteTraicao>(this.apiUrl + '/' + reporteTraicao, this.httpOptions);
  }
}