import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'donate-content',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './donate-content.component.html',
    styleUrls: ['donate-content.component.scss'],
})
export class DonateContentComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
