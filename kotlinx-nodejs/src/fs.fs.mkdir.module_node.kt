@file:JsQualifier("fs.mkdir")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package fs.mkdir

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

external fun __promisify__(path: String, options: fs.MakeDirectoryOptions): Promise<String>

external fun __promisify__(path: Buffer, options: fs.MakeDirectoryOptions): Promise<String>

external fun __promisify__(path: URL, options: fs.MakeDirectoryOptions): Promise<String>

external fun __promisify__(path: String, options: Number? = definedExternally): Promise<String?>

external fun __promisify__(path: String, options: String? = definedExternally): Promise<String?>

external fun __promisify__(path: String, options: fs.MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun __promisify__(path: Buffer, options: Number? = definedExternally): Promise<String?>

external fun __promisify__(path: Buffer, options: String? = definedExternally): Promise<String?>

external fun __promisify__(path: Buffer, options: fs.MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun __promisify__(path: URL, options: Number? = definedExternally): Promise<String?>

external fun __promisify__(path: URL, options: String? = definedExternally): Promise<String?>

external fun __promisify__(path: URL, options: fs.MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun __promisify__(path: String): Promise<Unit>

external fun __promisify__(path: Buffer): Promise<Unit>

external fun __promisify__(path: URL): Promise<Unit>
