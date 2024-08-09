import { TestBed } from '@angular/core/testing';

import { CallServiceApiService } from './call-service-api.service';

describe('CallServiceApiService', () => {
  let service: CallServiceApiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CallServiceApiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
