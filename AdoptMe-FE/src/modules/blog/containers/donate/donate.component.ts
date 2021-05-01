import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'donate',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './donate.component.html',
    styleUrls: ['donate.component.scss'],
})
export class DonateComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
