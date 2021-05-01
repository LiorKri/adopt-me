import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'volunteer-content',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './volunteer-content.component.html',
    styleUrls: ['volunteer-content.component.scss'],
})
export class VolunteerContentComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
