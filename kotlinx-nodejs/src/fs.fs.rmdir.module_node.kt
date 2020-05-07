@file:JsQualifier("fs.rmdir")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package fs.rmdir

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import Buffer

external fun __promisify__(path: String, options: fs.RmDirAsyncOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: Buffer, options: fs.RmDirAsyncOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: URL, options: fs.RmDirAsyncOptions = definedExternally): Promise<Unit>
