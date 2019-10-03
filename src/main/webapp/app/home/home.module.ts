import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SampleApplicationSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [SampleApplicationSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent]
})
export class SampleApplicationHomeModule {}
