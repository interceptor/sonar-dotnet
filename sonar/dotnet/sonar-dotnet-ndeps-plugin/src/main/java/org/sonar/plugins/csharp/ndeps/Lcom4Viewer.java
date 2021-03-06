/*
 * Sonar .NET Plugin :: NDeps
 * Copyright (C) 2010 Jose Chillan, Alexandre Victoor and SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.csharp.ndeps;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.resources.Qualifiers;
import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.DefaultTab;
import org.sonar.api.web.NavigationSection;
import org.sonar.api.web.RequiredMeasures;
import org.sonar.api.web.ResourceQualifier;
import org.sonar.api.web.RubyRailsPage;
import org.sonar.api.web.UserRole;

/**
 * Copy/Paste from the Lcom4Viewer from the design plugin which targets only classes and not files.
 *
 * @author Alexandre Victoor
 */
@NavigationSection(NavigationSection.RESOURCE_TAB)
@RequiredMeasures(allOf = {CoreMetrics.LCOM4_KEY})
@UserRole(UserRole.CODEVIEWER)
@ResourceQualifier({Qualifiers.FILE})
@DefaultTab(metrics = {"lcom4"})
public class Lcom4Viewer extends AbstractRubyTemplate implements RubyRailsPage {

  public String getId() {
    return "lcom4_viewer_file";
  }

  public String getTitle() {
    return "LCOM4";
  }

  @Override
  protected String getTemplatePath() {
    return "/lcom4_viewer.html.erb";
  }
}
