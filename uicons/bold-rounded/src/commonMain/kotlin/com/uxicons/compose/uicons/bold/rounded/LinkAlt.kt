package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkAlt: ImageVector? = null

val Icons.Br.LinkAlt: ImageVector
    get() = _LinkAlt ?: UXIcon(name = "LinkAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.9f, 16.1f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(1.33f, 1.33f, 3.64f, 1.33f, 4.97f, 0f)
            lineToRelative(4.99f, -4.99f)
            curveToRelative(1.37f, -1.37f, 1.37f, -3.6f, 0f, -4.97f)
            reflectiveCurveToRelative(-3.6f, -1.37f, -4.97f, 0f)
            curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(2.54f, -2.54f, 6.67f, -2.54f, 9.21f, 0f)
            curveToRelative(2.54f, 2.54f, 2.54f, 6.67f, 0f, 9.21f)
            lineToRelative(-4.99f, 4.99f)
            curveToRelative(-1.27f, 1.27f, -2.94f, 1.9f, -4.6f, 1.9f)
            reflectiveCurveToRelative(-3.33f, -0.64f, -4.6f, -1.9f)
            close()
            moveTo(6.51f, 24.0f)
            curveToRelative(1.67f, 0f, 3.33f, -0.64f, 4.6f, -1.9f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            curveToRelative(-1.37f, 1.37f, -3.6f, 1.37f, -4.97f, 0f)
            curveToRelative(-1.37f, -1.37f, -1.37f, -3.6f, 0f, -4.97f)
            lineToRelative(4.96f, -4.96f)
            curveToRelative(1.37f, -1.37f, 3.6f, -1.37f, 4.97f, 0f)
            curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-2.54f, -2.54f, -6.67f, -2.54f, -9.21f, 0f)
            lineTo(1.91f, 12.88f)
            curveToRelative(-2.54f, 2.54f, -2.54f, 6.67f, 0f, 9.21f)
            curveToRelative(1.27f, 1.27f, 2.94f, 1.9f, 4.6f, 1.9f)
            close()
        }
    }.also { _LinkAlt = it }
