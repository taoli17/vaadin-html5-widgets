/*
 * Copyright 2014 akquinet engineering GmbH
 *  
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.akquinet.engineering.vaadin.html5;

import com.vaadin.annotations.Title;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;

import de.akquinet.engineering.vaadin.html5.widgetset.ColorField;
import de.akquinet.engineering.vaadin.html5.widgetset.DateField;
import de.akquinet.engineering.vaadin.html5.widgetset.DateTimeField;
import de.akquinet.engineering.vaadin.html5.widgetset.DateTimeLocalField;
import de.akquinet.engineering.vaadin.html5.widgetset.EmailField;
import de.akquinet.engineering.vaadin.html5.widgetset.MonthField;
import de.akquinet.engineering.vaadin.html5.widgetset.NumberField;
import de.akquinet.engineering.vaadin.html5.widgetset.RangeField;
import de.akquinet.engineering.vaadin.html5.widgetset.SearchField;
import de.akquinet.engineering.vaadin.html5.widgetset.TelField;
import de.akquinet.engineering.vaadin.html5.widgetset.TimeField;
import de.akquinet.engineering.vaadin.html5.widgetset.UrlField;
import de.akquinet.engineering.vaadin.html5.widgetset.WeekField;

@Title("VaadinHtml5Test")
@Widgetset("de.akquinet.engineering.vaadin.html5.Html5TestWidgetset")
public class Html5TestUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Html5TestUI() {
		super();
	}

	protected ColorField colorField = new ColorField();
	protected DateField dateField = new DateField();
	protected DateTimeField dateTimeField = new DateTimeField();
	protected DateTimeLocalField dateTimeLocalField = new DateTimeLocalField();
	protected EmailField emailField = new EmailField();
	protected MonthField monthField = new MonthField();
	protected NumberField numberField = new NumberField();
	protected NumberField numberFieldMin = new NumberField();
	protected NumberField numberFieldMinMax = new NumberField();
	protected NumberField numberFieldMinMaxStep = new NumberField();
	protected RangeField rangeField = new RangeField();
	protected SearchField searchField = new SearchField();
	protected TelField telField = new TelField();
	protected TimeField timeField = new TimeField();
	protected UrlField urlField = new UrlField();
	protected WeekField weekField = new WeekField();

	protected TextArea summary = new TextArea();
	protected Button buildSummary = new Button("Generate Summary");

	@Override
	protected void init(VaadinRequest request) {
		FormLayout layout = new FormLayout();
		colorField.setCaption("Color");
		layout.addComponent(colorField);
		dateField.setCaption("Date");
		layout.addComponent(dateField);
		dateTimeField.setCaption("DateTime");
		layout.addComponent(dateTimeField);
		dateTimeLocalField.setCaption("DateTime-local");
		layout.addComponent(dateTimeLocalField);
		emailField.setCaption("Email");
		layout.addComponent(emailField);
		monthField.setCaption("Month");
		layout.addComponent(monthField);
		numberField.setCaption("Number");
		layout.addComponent(numberField);
		numberFieldMin.setMin(2);
		numberFieldMin.setCaption("Number >=2");
		layout.addComponent(numberFieldMin);
		numberFieldMinMax.setMin(2);
		numberFieldMinMax.setMax(10);
		numberFieldMinMax.setCaption("Number >=2 && <=10");
		layout.addComponent(numberFieldMinMax);
		numberFieldMinMaxStep.setMin(2);
		numberFieldMinMaxStep.setMax(10);
		numberFieldMinMaxStep.setStep(2);
		numberFieldMinMaxStep.setCaption("Number >=2 && <=10 && even");
		layout.addComponent(numberFieldMinMaxStep);
		rangeField.setMin(2);
		rangeField.setMax(10);
		rangeField.setCaption("Range between 2 and 10");
		layout.addComponent(rangeField);
		searchField.setCaption("Search");
		layout.addComponent(searchField);
		telField.setCaption("Tel");
		layout.addComponent(telField);
		timeField.setCaption("Time");
		layout.addComponent(timeField);
		urlField.setCaption("Url");
		layout.addComponent(urlField);
		weekField.setCaption("Week");
		layout.addComponent(weekField);
		summary.setCaption("Summary");
		summary.setRows(20);
		summary.setColumns(80);
		layout.addComponent(summary);
		buildSummary.addClickListener(new ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				StringBuilder str = new StringBuilder();
				str.append(colorField.getCaption() + ": ");
				str.append(colorField.getValue());
				str.append("\n");
				str.append(dateField.getCaption() + ": ");
				str.append(dateField.getValue());
				str.append("\n");
				str.append(dateTimeField.getCaption() + ": ");
				str.append(dateTimeField.getValue());
				str.append("\n");
				str.append(dateTimeLocalField.getCaption() + ": ");
				str.append(dateTimeLocalField.getValue());
				str.append("\n");
				str.append(emailField.getCaption() + ": ");
				str.append(emailField.getValue());
				str.append("\n");
				str.append(monthField.getCaption() + ": ");
				str.append(monthField.getValue());
				str.append("\n");
				str.append(numberField.getCaption() + ": ");
				str.append(numberField.getValue());
				str.append("\n");
				str.append(numberFieldMin.getCaption() + ": ");
				str.append(numberFieldMin.getValue());
				str.append("\n");
				str.append(numberFieldMinMax.getCaption() + ": ");
				str.append(numberFieldMinMax.getValue());
				str.append("\n");
				str.append(numberFieldMinMaxStep.getCaption() + ": ");
				str.append(numberFieldMinMaxStep.getValue());
				str.append("\n");
				str.append(rangeField.getCaption() + ": ");
				str.append(rangeField.getValue());
				str.append("\n");
				str.append(searchField.getCaption() + ": ");
				str.append(searchField.getValue());
				str.append("\n");
				str.append(telField.getCaption() + ": ");
				str.append(telField.getValue());
				str.append("\n");
				str.append(timeField.getCaption() + ": ");
				str.append(timeField.getValue());
				str.append("\n");
				str.append(urlField.getCaption() + ": ");
				str.append(urlField.getValue());
				str.append("\n");
				str.append(weekField.getCaption() + ": ");
				str.append(weekField.getValue());
				str.append("\n");
				summary.setValue(str.toString());
			}
		});
		layout.addComponent(buildSummary);
		setContent(layout);
	}

}
