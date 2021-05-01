import { Component, OnInit } from '@angular/core';
import { Volunteer } from '@modules/blog/models';
import { VolunteerService } from '@modules/blog/services';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
    selector: 'volunteer-form',
    templateUrl: './volunteer-form.component.html',
    styleUrls: ['volunteer-form.component.scss'],
})
export class VolunteerFormComponent implements OnInit {
    public volunteers: Volunteer[];

    constructor(private volunteerService: VolunteerService){}

    ngOnInit() {
    }

    public getVolunteers(): void {
       this.volunteerService.getVolunteers().subscribe(
        (response: Volunteer[]) => {
            this.volunteers = response;
            console.log(this.volunteers);
        },
        (error: HttpErrorResponse) => {
             alert(error.message);
        }
       );
    }

    onAddVolunteer(addForm: NgForm): void {
        this.volunteerService.addVolunteer(addForm.value).subscribe(
        (response: Volunteer) => {
            console.log(response);
            this.getVolunteers();
            addForm.reset();
        },
        (error: HttpErrorResponse) => {
            alert(error.message);
            addForm.reset();
        }
        );
    }
}
