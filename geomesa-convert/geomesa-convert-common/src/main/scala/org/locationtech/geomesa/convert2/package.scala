/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa

import com.codahale.metrics.Histogram
import com.typesafe.config.Config
import com.typesafe.scalalogging.LazyLogging
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.locationtech.geomesa.convert.EvaluationContext
import org.locationtech.geomesa.convert.EvaluationContext.EvaluationError
=======
<<<<<<< HEAD
>>>>>>> 9ef414565f3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> e82f13f69b9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e05e1390095 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 2766783f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fc4e1287f7b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 31e57b8ac92 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a34438bf2f4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58ccfe6c18d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e58aa99f3b2 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 3e69abb0ab0 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 498f4afb467 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> de9aa124d51 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 2f91e2f6294 (GEOMESA-3071 Move all converter state into evaluation context)
import org.locationtech.geomesa.convert.Modes.{ErrorMode, ParseMode}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5af7c15be6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1cbf436890 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9677081a1a (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> afff6fd74b (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 2ae5d0a688 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
import org.locationtech.geomesa.convert.EvaluationContext
import org.locationtech.geomesa.convert.Modes.{ErrorMode, ParseMode}
import org.locationtech.geomesa.convert2.AbstractConverter.FieldApiError
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6519fcd623 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 2ae5d0a688 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
import org.locationtech.geomesa.convert.Modes.{ErrorMode, ParseMode}
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
=======
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> afff6fd74b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6519fcd623 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 2ae5d0a688 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 9231cf5fb4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 5af7c15be6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1cbf436890 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9677081a1a (GEOMESA-3071 Move all converter state into evaluation context)
import org.locationtech.geomesa.convert.EvaluationContext
import org.locationtech.geomesa.convert.Modes.{ErrorMode, ParseMode}
import org.locationtech.geomesa.convert2.AbstractConverter.FieldApiError
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5148ecd4cb (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 81529b2a85 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.locationtech.geomesa.convert.Modes.{ErrorMode, ParseMode}
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 9231cf5fb4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5af7c15be6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 1cbf436890 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> afff6fd74b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 9677081a1a (GEOMESA-3071 Move all converter state into evaluation context)
import org.locationtech.geomesa.convert2.transforms.Expression
import org.locationtech.geomesa.utils.collection.CloseableIterator

import java.io.IOException
import java.nio.charset.Charset
import scala.util.control.NonFatal
import scala.util.{Failure, Try}

package object convert2 {

  /**
   * Try a sequence of attempts. Return the first success. If there are no successes,
   * Failures will be added as suppressed exceptions.
   *
   * @param attempts attempts
   * @param failure umbrella exception in case of failure
   * @tparam T attempt type
   * @return
   */
  def multiTry[T](attempts: Iterator[Try[T]], failure: Throwable): Try[T] = {
    var res: Try[T] = Failure(failure)
    while (res.isFailure && attempts.hasNext) {
      val attempt = attempts.next
      if (attempt.isSuccess) {
        res = attempt
      } else {
        val e = attempt.failed.get
        // filter out NotImplementedErrors, so we don't clutter up the logs with failed conversion attempts from
        // converter factories that haven't implemented schema inference
        if (!e.isInstanceOf[NotImplementedError] && !Option(e.getCause).exists(_.isInstanceOf[NotImplementedError])) {
          failure.addSuppressed(e)
        }
      }
    }
    res
  }

  trait ConverterConfig {
    def `type`: String
    def idField: Option[Expression]
    def caches: Map[String, Config]
    def userData: Map[String, Expression]
  }

  trait Field {

    def name: String
    def transforms: Option[Expression]

    /**
     * Provides a chance for the field to select and filter the raw input values,
     * e.g. by applying an x-path expression or taking a sub-section of the input
     *
     * @return an optional function to use instead of the args
     */
<<<<<<< HEAD
    def fieldArg: Option[Array[AnyRef] => AnyRef]
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 9231cf5fb4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5af7c15be6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1cbf436890 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9677081a1a (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> afff6fd74b (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 2ae5d0a688 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 5148ecd4cb (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 5af7c15be6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1cbf436890 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9677081a1a (GEOMESA-3071 Move all converter state into evaluation context)
    // TODO remove default impl in next major release
    // this will be caught and handled by the evaluation context
    def fieldArg: Option[Array[AnyRef] => AnyRef] = throw FieldApiError

    // noinspection ScalaDeprecation
    @deprecated("Replaced with `fieldArg` for updating the raw input")
    def eval(args: Array[Any])(implicit ec: EvaluationContext): Any = transforms.map(_.eval(args)).getOrElse(args(0))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6519fcd623 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 2ae5d0a688 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 81529b2a85 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9231cf5fb4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 5af7c15be6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1cbf436890 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9677081a1a (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6e6d5a01cd (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> afff6fd74b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6519fcd623 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 2ae5d0a688 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b117271d95 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 706bcb3d36 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 5148ecd4cb (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 81529b2a85 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 9231cf5fb4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 397a13ab3c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 5af7c15be6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1cbf436890 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> afff6fd74b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 9677081a1a (GEOMESA-3071 Move all converter state into evaluation context)
  }

  trait ConverterOptions {
    def validators: Seq[String]
    def reporters: Seq[Config]
    def parseMode: ParseMode
    def errorMode: ErrorMode
    def encoding: Charset
  }

  /**
    * Handles errors from the underlying parsing of data, before converting to simple features
    *
    * @param underlying wrapped iterator
    * @param mode error mode
    * @param ec EvaluationContext for tracking errors
    * @param times histogram for tracking convert times
    */
  class ErrorHandlingIterator[T](
      underlying: CloseableIterator[T],
      mode: ErrorMode,
      ec: EvaluationContext,
      times: Histogram
    ) extends CloseableIterator[T] with LazyLogging {

    private var staged: T = _
    private var error = false

    override final def hasNext: Boolean = staged != null || {
      if (error) { false } else {
        // make sure that we successfully read an underlying record, so that we can always return
        // a valid record in `next`, otherwise failures will get double counted
        val start = System.nanoTime()
        try {
          if (underlying.hasNext) {
            staged = underlying.next
            true
          } else {
            false
          }
        } catch {
          case NonFatal(e) =>
            ec.failure.inc()
            mode match {
              case ErrorMode.LogErrors => logger.warn("Failed parsing input: ", e)
              case ErrorMode.ReturnErrors => ec.errors.add(EvaluationError(null, ec.line, new IOException("Failed parsing input: ", e)))
              case ErrorMode.RaiseErrors => throw new IOException("Failed parsing input: ", e)
            }
            error = true
            false // usually parsing can't continue if there is an exception in the underlying read
        } finally {
          times.update(System.nanoTime() - start)
        }
      }
    }

    override def next(): T = {
      if (!hasNext) { Iterator.empty.next() } else {
        val res = staged
        staged = null.asInstanceOf[T]
        res
      }
    }

    override def close(): Unit = underlying.close()
  }
}
