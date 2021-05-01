import { ChangeDetectionStrategy, Component, Input, OnInit, TemplateRef } from '@angular/core';
import { FormBuilder, FormControl, Validators } from '@angular/forms';

@Component({
    selector: 'about-us-form',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './about-us-form.component.html',
    styleUrls: ['about-us-form.component.scss'],
})
export class AboutUsFormComponent implements OnInit {
    constructor() {}
    ngOnInit() {}
}
