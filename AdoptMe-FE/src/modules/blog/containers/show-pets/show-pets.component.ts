import {Component, OnInit,} from '@angular/core';
import { Animal } from '@modules/blog/models';
import { AnimalService } from '@modules/blog/services';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
    selector: 'show-pets',
    templateUrl: './show-pets.component.html',
    styleUrls: ['show-pets.component.scss'],
})
export class ShowPetsComponent implements OnInit {
    public animals: Animal[];

    constructor(private animalService: AnimalService){}

    ngOnInit() {
      this.getAnimals();
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

    public searchAnimals(key: string): void {
        console.log(key);
        const results: Animal[] = [];
        for (const animal of this.animals) {
          if (animal.name.toLowerCase().indexOf(key.toLowerCase()) !== -1
          || animal.description.toLowerCase().indexOf(key.toLowerCase()) !== -1
          || animal.animalKind.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
            results.push(animal);
          }
        }
        this.animals = results;
        if (results.length === 0 || !key) {
          this.getAnimals();
        }
    }
}
