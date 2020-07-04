import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Rebelde } from '../model/rebelde.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RebeldeService {

  apiUrl = 'http://localhost:8080/starwars/rebelde';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(
    private httpClient: HttpClient
  ) { }

  public get(): Observable<Rebelde> {
    return this.httpClient.get<Rebelde>(this.apiUrl);
  }

  public getById(id: string): Observable<Rebelde> {
    return this.httpClient.get<Rebelde>(this.apiUrl + '/' + id);
  }

  public post(rebelde: any): Observable<Rebelde> {
    return this.httpClient.post<any>(this.apiUrl, rebelde, this.httpOptions);
  }

  public put(rebelde: any): Observable<Rebelde> {
    return this.httpClient.put<any>(this.apiUrl, rebelde, this.httpOptions);
  }

  public delete(rebelde: any): Observable<Rebelde> {
    return this.httpClient.delete<Rebelde>(this.apiUrl + '/' + rebelde, this.httpOptions);
  }
}
