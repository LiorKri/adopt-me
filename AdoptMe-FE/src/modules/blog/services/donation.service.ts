import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Donation } from '@modules/blog/models';
import { environment } from 'environments/environment';

@Injectable({providedIn: 'root'})
export class DonationService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getDonations(): Observable<Donation[]> {
    return this.http.get<Donation[]>(`${this.apiServerUrl}/donation/all`);
  }

  public addDonation(donation: Donation): Observable<Donation> {
    return this.http.post<Donation>(`${this.apiServerUrl}/donation/add`, donation);
  }
}
