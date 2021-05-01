import { Component, OnInit } from '@angular/core';
import { Animal } from '@modules/blog/models';
import { AnimalService } from '@modules/blog/services';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
    selector: 'add-pet-form',
    templateUrl: './add-pet-form.component.html',
    styleUrls: ['add-pet-form.component.scss'],
})
export class AddPetFormComponent implements OnInit {
    public animals: Animal[];

    constructor(private animalService: AnimalService){}

    ngOnInit() {
    }

    public getAnimals(): void {
       this.animalService.getAnimals().subscribe(
        (response: Animal[]) => {
            this.animals = response;
            console.log(this.animals);
        },
        (error: HttpErrorResponse) => {
             alert(error.message);
        }
       );
    }

    onAddAnimal(addForm: NgForm): void {
        this.animalService.addAnimal(addForm.value).subscribe(
        (response: Animal) => {
            console.log(response);
            this.getAnimals();
            addForm.reset();
        },
        (error: HttpErrorResponse) => {
            alert(error.message);
            addForm.reset();
        }
        );
    }
}
