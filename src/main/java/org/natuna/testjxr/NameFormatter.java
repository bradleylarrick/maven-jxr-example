/*
 * Copyright (c) 2023 Bradley Larrick. All rights reserved.
 *
 * Licensed under the Apache License v2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.natuna.testjxr;

import java.util.Locale;

/**
 * The surname formatter class for the surname loader program.
 */
@SuppressWarnings({
    "PMD.AvoidLiteralsInIfCondition", "PMD.OnlyOneReturn", "PMD.LiteralsFirstInComparisons"})
public final class NameFormatter {

  private static final char HYPHEN = '-';

  private static final char PERIOD = '.';

  private static final char SPACE = ' ';

  private static final char LOWER_V = 'v';

  private static final String COMMENT = "#";

  /**
   * Private constructor to prevent instantiation.
   */
  private NameFormatter() {
    // Intentionally left blank.
  }

  /**
   * Formats the given surname according to the formatting rules.
   *
   * @param name the surname to format
   *
   * @return the formatted surname
   */
  public static String formatName(final String name) {

    final StringBuilder newName = new StringBuilder(name.toLowerCase(Locale.getDefault()));

    final int hyphen    = newName.indexOf("-");
    final int space     = newName.lastIndexOf(" ");
    final int preformat = hyphen >= 0 ? hyphen : space;
    if (preformat >= 0) {
      setUppercase(newName, 0);
      setUppercase(newName, preformat + 1);
      return newName.toString();
    }
    // Capitalize the first character
    setUppercase(newName, 0);
    return newName.toString();
  }

  /**
   * Sets the character at the given position in the given {@code StringBuilder} to uppercase.
   *
   * @param buffer the {@code StringBuilder} to modify
   * @param pos    the position within {@code buffer} to modify
   */
  public static void setUppercase(final StringBuilder buffer, final int pos) {
    buffer.setCharAt(pos, Character.toUpperCase(buffer.charAt(pos)));
  }

  /**
   * Sets the character at the given position in the given {@code StringBuilder} to lowercase.
   *
   * @param buffer the {@code StringBuilder} to modify
   * @param pos    the position within {@code buffer} to modify
   */
  public static void setLowercase(final StringBuilder buffer, final int pos) {
    buffer.setCharAt(pos, Character.toLowerCase(buffer.charAt(pos)));
  }
}
