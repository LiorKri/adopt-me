import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'contact-request',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './contact-request.component.html',
    styleUrls: ['contact-request.component.scss'],
})
export class ContactRequestComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
