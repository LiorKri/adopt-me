import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ContactRequest } from '@modules/blog/models';
import { environment } from 'environments/environment';

@Injectable({providedIn: 'root'})
export class ContactRequestService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getContactRequests(): Observable<ContactRequest[]> {
    return this.http.get<ContactRequest[]>(`${this.apiServerUrl}/contact-request/all`);
  }

  public addContactRequest(contactRequest: ContactRequest): Observable<ContactRequest> {
    return this.http.post<ContactRequest>(`${this.apiServerUrl}/contact-request/add`, contactRequest);
  }
}
