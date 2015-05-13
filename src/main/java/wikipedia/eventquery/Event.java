package wikipedia.eventquery;

/*
 * #%L
 * wikipedia-event-query
 * %%
 * Copyright (C) 2015 Zoli
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.joda.time.LocalDate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Class representing an event that occurred on a specific date.
 */
public class Event {

	/**
	 * Date of the event.
	 */
	private LocalDate	date;

	/**
	 * Description of the event.
	 */
	private String	description;

	/**
	 * Constructor for creating an {@code Event} object.
	 *
	 * @param date the date of the event
	 * @param description the description of the event
	 */
	public Event(LocalDate date, String description) {
		this.date = date;
		this.description = description;
	}

	/**
	 * Returns the date of this event.
	 *
	 * @return the date of this event
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Sets the date of this event.
	 *
	 * @param date the date of this event
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Returns the description of this event.
	 *
	 * @return the description of this event
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description of this event.
	 *
	 * @param description the description of this event
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Compares this event with the specified object for equality. Two {@code Event} objects
	 * are considered equal if and only if their dates and descriptions are equal.
	 *
	 * @param o the object to compare to
	 * @return <code>true</code> if the objects are equal, <code>false</code> otherwise
	 */
	public boolean equals(Object o) {
		if (o == null) return false;
		if (o == this) return true;
		if (! getClass().equals(o.getClass())) return false;
		Event	that = (Event) o;
		return new EqualsBuilder()
			.append(date, that.date)
			.append(description, that.description)
			.isEquals();
	}

	/**
	 * Returns a hash code value for this object.
	 *
	 * @return a hash code value for this object
	 */
	public int hashCode() {
		return new HashCodeBuilder(13, 7).append(date).append(description).toHashCode();
//		return HashCodeBuilder.reflectionHashCode(13, 7, this);
	}

	/**
	 * Returns the string representation of this event.
	 *
	 * @return the string representation of this event in the form
	 *         <span><em>date</em><code> - </code><em>description</em></span>
	 */
	public String toString() {
		return String.format("%s - %s", date.toString(), description);
	}

}
