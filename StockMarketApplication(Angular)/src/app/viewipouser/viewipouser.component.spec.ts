import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewipouserComponent } from './viewipouser.component';

describe('ViewipouserComponent', () => {
  let component: ViewipouserComponent;
  let fixture: ComponentFixture<ViewipouserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewipouserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewipouserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
