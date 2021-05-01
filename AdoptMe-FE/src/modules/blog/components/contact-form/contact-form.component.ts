import { Component, OnInit } from '@angular/core';
import { ContactRequest } from '@modules/blog/models';
import { ContactRequestService } from '@modules/blog/services';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
    selector: 'contact-form',
    templateUrl: './contact-form.component.html',
    styleUrls: ['contact-form.component.scss'],
})
export class ContactFormComponent implements OnInit {
    public requests: ContactRequest[];

    constructor(private contactRequestService: ContactRequestService){}

    ngOnInit() {
    }

    public getRequests(): void {
       this.contactRequestService.getContactRequests().subscribe(
        (response: ContactRequest[]) => {
            this.requests = response;
            console.log(this.requests);
        },
        (error: HttpErrorResponse) => {
             alert(error.message);
        }
       );
    }

    onAddRequests(addForm: NgForm): void {
        this.contactRequestService.addContactRequest(addForm.value).subscribe(
        (response: ContactRequest) => {
            console.log(response);
            this.getRequests();
            addForm.reset();
        },
        (error: HttpErrorResponse) => {
            alert(error.message);
            addForm.reset();
        }
        );
    }
}
