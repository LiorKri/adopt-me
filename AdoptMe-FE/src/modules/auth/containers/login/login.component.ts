import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, Validators } from '@angular/forms';
import { AuthService } from '@modules/auth/services';
import { Router } from '@angular/router';
import { AuthUtilsService } from '@modules/auth/services';

@Component({
    selector: 'sb-login',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './login.component.html',
    styleUrls: ['login.component.scss'],
})
export class LoginComponent implements OnInit {
    loginForm = this.fb.group({
        password: ['', [Validators.required, Validators.minLength(8)]],
        email: ['', [Validators.required]],
    });

    constructor(private fb: FormBuilder, private authService: AuthService, private router: Router, private authUtilsService: AuthUtilsService,) {}
    ngOnInit() {}

    onSubmit() {
        if (this.loginForm.status === 'VALID') {
            this.authService
                .login$({
                    password: this.loginForm.value.password, email: this.loginForm.value.email})
                .subscribe();
                this.authUtilsService.turnToLoggedIn();
                return this.router.navigate(['/']);
        }

        // tslint:disable-next-line: forin
        for (const key in this.loginForm.controls) {
            const control = this.loginForm.controls[key];
            control.markAllAsTouched();
        }
    }

    /* Accessor Methods */

    get passwordControl() {
        return this.loginForm.get('password') as FormControl;
    }

    get passwordControlValid() {
        return this.passwordControl.touched && !this.passwordControlInvalid;
    }

    get passwordControlInvalid() {
        return (
            this.passwordControl.touched &&
            (this.passwordControl.hasError('required') ||
                this.passwordControl.hasError('minlength'))
        );
    }

    get userControl() {
        return this.loginForm.get('user') as FormControl;
    }

    get userControlValid() {
        return this.passwordControl.touched && !this.passwordControlInvalid;
    }

    get userControlInvalid() {
        return (this.passwordControl.touched &&
                this.passwordControl.hasError('required'));
    }
}
