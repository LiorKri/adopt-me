import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'add-pet-content',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './add-pet-content.component.html',
    styleUrls: ['add-pet-content.component.scss'],
})
export class AddPetContentComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
