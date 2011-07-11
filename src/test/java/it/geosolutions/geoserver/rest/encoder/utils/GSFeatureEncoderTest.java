/*
 *  Copyright (C) 2007 - 2011 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 * 
 *  GPLv3 + Classpath exception
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.geoserver.rest.encoder.utils;

import it.geosolutions.geoserver.rest.encoder.feature.GSFeatureDimensionInfoEncoder;
import it.geosolutions.geoserver.rest.encoder.feature.GSFeatureTypeEncoder;
import it.geosolutions.geoserver.rest.encoder.metadata.GSDimensionInfoEncoder.DiscretePresentation;

import java.math.BigDecimal;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * 
 * @author ETj (etj at geo-solutions.it)
 * @author Carlo Cancellieri - carlo.cancellieri@geo-solutions.it
 */
public class GSFeatureEncoderTest extends TestCase {

	public GSFeatureEncoderTest() {
	}

	@Test
	public void testAll() {
		GSFeatureTypeEncoder feature = new GSFeatureTypeEncoder();
		feature.addKeyword("KEYWORD_1");
		feature.addKeyword("KEYWORD_2");
		feature.addKeyword("...");
		feature.addKeyword("KEYWORD_N");
		GSFeatureDimensionInfoEncoder dim2 = new GSFeatureDimensionInfoEncoder(
				"ELE");
		dim2.setPresentation(DiscretePresentation.DISCRETE_INTERVAL,
				BigDecimal.valueOf(10));
		feature.addMetadata("elevation", dim2);

		// TODO TESTS

	}
}
