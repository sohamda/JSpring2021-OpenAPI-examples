import {Component} from '@angular/core';
import {Provider, ProviderAPIService} from 'openApiClient';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'open-api-frontend';
  result: Provider | undefined;

  constructor(private openapiClient: ProviderAPIService) {
  }

  public findProviderData(providerId: string): void {

    this.openapiClient.getProviderByID(Number(providerId)).toPromise().then(value => {
      this.result = value;
    });
  }
}
