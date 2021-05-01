import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'add-pet',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './add-pet.component.html',
    styleUrls: ['add-pet.component.scss'],
})
export class AddPetComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
