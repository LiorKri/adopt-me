import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';

@Component({
    selector: 'about-content',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './about-content.component.html',
    styleUrls: ['about-content.component.scss'],
})
export class AboutContentComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
