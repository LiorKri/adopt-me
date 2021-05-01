import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Volunteer } from '@modules/blog/models';
import { environment } from 'environments/environment';

@Injectable({providedIn: 'root'})
export class VolunteerService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getVolunteers(): Observable<Volunteer[]> {
    return this.http.get<Volunteer[]>(`${this.apiServerUrl}/volunteer/all`);
  }

  public addVolunteer(volunteer: Volunteer): Observable<Volunteer> {
    return this.http.post<Volunteer>(`${this.apiServerUrl}/volunteer/add`, volunteer);
  }
}
