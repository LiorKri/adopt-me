import { Component, OnInit } from '@angular/core';
import { Donation } from '@modules/blog/models';
import { DonationService } from '@modules/blog/services';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
    selector: 'donation-form',
    templateUrl: './donation-form.component.html',
    styleUrls: ['donation-form.component.scss'],
})
export class DonationFormComponent implements OnInit {
    public donations: Donation[];

    constructor(private donationService: DonationService){}

    ngOnInit() {
    }

    public getDonations(): void {
       this.donationService.getDonations().subscribe(
        (response: Donation[]) => {
            this.donations = response;
            console.log(this.donations);
        },
        (error: HttpErrorResponse) => {
             alert(error.message);
        }
       );
    }

    onAddDonation(addForm: NgForm): void {
        this.donationService.addDonation(addForm.value).subscribe(
        (response: Donation) => {
            console.log(response);
            this.getDonations();
            addForm.reset();
        },
        (error: HttpErrorResponse) => {
            alert(error.message);
            addForm.reset();
        }
        );
    }
}
