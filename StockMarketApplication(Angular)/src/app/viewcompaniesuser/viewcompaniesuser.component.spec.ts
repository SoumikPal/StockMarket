import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewcompaniesuserComponent } from './viewcompaniesuser.component';

describe('ViewcompaniesuserComponent', () => {
  let component: ViewcompaniesuserComponent;
  let fixture: ComponentFixture<ViewcompaniesuserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewcompaniesuserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewcompaniesuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
