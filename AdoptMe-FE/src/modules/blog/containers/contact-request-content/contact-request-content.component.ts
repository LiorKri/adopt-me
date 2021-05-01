import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'contact-request-content',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './contact-request-content.component.html',
    styleUrls: ['contact-request-content.component.scss'],
})
export class ContactRequestContentComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
