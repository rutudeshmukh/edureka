import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BigBillionDayComponent } from './big-billion-day.component';

describe('BigBillionDayComponent', () => {
  let component: BigBillionDayComponent;
  let fixture: ComponentFixture<BigBillionDayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BigBillionDayComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BigBillionDayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
