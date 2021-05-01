import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'volunteer',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './volunteer.component.html',
    styleUrls: ['volunteer.component.scss'],
})
export class VolunteerComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
