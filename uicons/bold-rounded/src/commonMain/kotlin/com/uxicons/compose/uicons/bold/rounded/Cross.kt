package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cross: ImageVector? = null

val Icons.Br.Cross: ImageVector
    get() = _Cross ?: UXIcon(name = "Cross") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(301.26f, 256.01f)
            lineTo(502.64f, 54.65f)
            curveToRelative(12.5f, -12.5f, 12.5f, -32.77f, 0f, -45.27f)
            curveToRelative(-12.5f, -12.5f, -32.77f, -12.5f, -45.27f, 0f)
            lineToRelative(0f, 0f)
            lineTo(256.01f, 210.76f)
            lineTo(54.65f, 9.38f)
            curveToRelative(-12.5f, -12.5f, -32.77f, -12.5f, -45.27f, 0f)
            reflectiveCurveToRelative(-12.5f, 32.77f, 0f, 45.27f)
            lineTo(210.76f, 256.01f)
            lineTo(9.38f, 457.38f)
            curveToRelative(-12.5f, 12.5f, -12.5f, 32.77f, 0f, 45.27f)
            reflectiveCurveToRelative(32.77f, 12.5f, 45.27f, 0f)
            lineTo(256.01f, 301.26f)
            lineToRelative(201.37f, 201.39f)
            curveToRelative(12.5f, 12.5f, 32.77f, 12.5f, 45.27f, 0f)
            curveToRelative(12.5f, -12.5f, 12.5f, -32.77f, 0f, -45.27f)
            lineTo(301.26f, 256.01f)
            close()
        }
    }.also { _Cross = it }
