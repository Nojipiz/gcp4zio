package gcp4zio

import org.slf4j.{Logger, LoggerFactory}

package object dp {
  private[dp] lazy val logger: Logger = LoggerFactory.getLogger(getClass.getName)
}
