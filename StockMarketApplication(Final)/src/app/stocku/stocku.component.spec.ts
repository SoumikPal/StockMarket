import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockuComponent } from './stocku.component';

describe('StockuComponent', () => {
  let component: StockuComponent;
  let fixture: ComponentFixture<StockuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
