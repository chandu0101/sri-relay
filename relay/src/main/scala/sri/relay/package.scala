package sri

import sri.core.ReactTypedConstructor

import scala.scalajs.js

package object relay {

  /**
    * typed version of js.constructorOf[ C <: ReactJSComponent]
    * @tparam P
    * @tparam S
    */
  @js.native
  trait RelayTypedConstructor[P <: RelayComponentProps, S] extends ReactTypedConstructor[P, S]
}
