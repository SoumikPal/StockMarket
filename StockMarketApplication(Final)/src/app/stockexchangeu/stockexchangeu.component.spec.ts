import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockexchangeuComponent } from './stockexchangeu.component';

describe('StockexchangeuComponent', () => {
  let component: StockexchangeuComponent;
  let fixture: ComponentFixture<StockexchangeuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockexchangeuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockexchangeuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
