import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Inventario } from '../model/inventario.model';

@Injectable({
  providedIn: 'root'
})
export class InventarioService {

  apiUrl = 'http://localhost:8080/starwars/inventario';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(
    private httpClient: HttpClient
  ) { }

  public getAll(): Observable<Inventario> {
    return this.httpClient.get<Inventario>(this.apiUrl);
  }

  public getById(id: string): Observable<Inventario> {
    return this.httpClient.get<Inventario>(this.apiUrl + '/' + id);
  }

  public post(inventario: any): Observable<Inventario> {
    return this.httpClient.post<any>(this.apiUrl, inventario, this.httpOptions);
  }

  public put(inventario: any): Observable<Inventario> {
    return this.httpClient.put<any>(this.apiUrl, inventario, this.httpOptions);
  }

  public delete(inventario: any): Observable<Inventario> {
    return this.httpClient.delete<Inventario>(this.apiUrl + '/' + inventario, this.httpOptions);
  }
}
