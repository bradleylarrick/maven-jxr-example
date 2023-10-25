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

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Main executable for the surname loader program.
 */
@SuppressWarnings("ThrowablePrintedToSystemOut")
public class NameLoader {

  private final int thisYear;

  NameLoader() {
    thisYear = new GregorianCalendar().get(Calendar.YEAR);
  }

  private int run() {
    printHeader(new PrintWriter(System.out));
    return 0;
  }

  private void printHeader(final PrintWriter output) {
    output.println("#");
    output.printf("# Copyright (c) 2018-%d Bradley Larrick. All rights reserved.%n", thisYear);
    output.println("#");
    output.println("# Licensed under the Apache License v2.0");
    output.println("# http://www.apache.org/licenses/LICENSE-2.0");
    output.println("#");
    output.println("# Unless required by applicable law or agreed to in writing, software");
    output.println("# distributed under the License is distributed on an \"AS IS\" BASIS,");
    output.println("# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
    output.println("# See the License for the specific language governing permissions and");
    output.println("# limitations under the License.");
    output.println("#");
  }

  /**
   * The main method for the loader program.
   *
   * @param args the command line arguments
   */
  public static void main(final String... args) {
    System.exit(new NameLoader().run());
  }
}
