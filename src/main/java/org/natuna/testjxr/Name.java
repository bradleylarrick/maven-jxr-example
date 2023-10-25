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

/**
 * Record class for storing names and their corresponding distribution values.
 */
public class Name implements Comparable<Name> {

  private final String name;

  /**
   * Constructs a new instance with the given name. the count fields are set to zero and the
   * encoding field is set to {@code null}.
   *
   * @param name the name value for the instance
   */
  public Name(final String name) {
    this.name = name;
  }

  /**
   * Constructs a new instance based on the given values. The fields are expected to contain the
   * following values:
   * <pre>
   *   Field  0: The surname
   * </pre>
   *
   * @param values the values for the new instance
   */
  public Name(final String... values) {
    this(NameFormatter.formatName(values[0]));
  }

  /**
   * Returns the surname associates with this record.
   *
   * @return the surname value
   */
  public String name() {
    return this.name;
  }

  /**
   * Returns a string representation of this object. The string is in the form:
   * <pre>
   *   surname (&lt;total count&gt;)
   * </pre>
   *
   * @return a string representation of the object.
   */
  @Override
  public String toString() {
    return this.name;
  }

  /**
   * Returns {@code true} if the given object is "equal to" this object.
   *
   * @param obj the object o test
   *
   * @return {@code true} if this object is the "equal to" the {@code obj} argument
   */
  @Override
  public boolean equals(final Object obj) {
    boolean ret = false;
    if (obj instanceof Name) {
      final Name object = (Name) obj;
      ret = this.name.equals(object.name);
    }

    return ret;
  }

  /**
   * Returns a hash code value for this object. This method is supported for the benefit of hash
   * tables such as those provided by {@code HashMap}.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return this.name.hashCode();
  }

  /**
   * Compares this object with the specified object for order.
   *
   * @param obj the object to be compared
   *
   * @return a negative integer, zero, or a positive integer as this object is less than, equal to,
   *     or greater than the specified object
   */
  @Override
  public int compareTo(final Name obj) {
    return this.name().compareTo(obj.name());
  }
}
