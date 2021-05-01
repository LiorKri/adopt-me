import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { ConfigService } from '@common/services';
import { LoginUser } from '@modules/auth/models';
import { LoginPayload } from '@modules/auth/models';
import { from, Observable, throwError } from 'rxjs';
import { catchError, switchMap } from 'rxjs/operators';
import { environment } from 'environments/environment';

import { AuthUtilsService } from './auth-utils.service';

@Injectable()
export class AuthService {
  private apiServerUrl = environment.apiBaseUrl;

    constructor(
        private http: HttpClient,
        private configService: ConfigService,
        private authUtilsService: AuthUtilsService,
        private router: Router
    ) {}

    login$(user: LoginPayload): Observable<LoginUser> {
        return this.http
            .post<LoginUser>(`${this.apiServerUrl}/user/login`, user);
    }
}
