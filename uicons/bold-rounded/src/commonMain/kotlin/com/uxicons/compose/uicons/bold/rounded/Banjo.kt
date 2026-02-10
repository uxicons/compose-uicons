package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banjo: ImageVector? = null

val Icons.Br.Banjo: ImageVector
    get() = _Banjo ?: UXIcon(name = "Banjo") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.37f, 1.15f)
            lineToRelative(-0.53f, -0.53f)
            curveToRelative(-0.84f, -0.84f, -2.19f, -0.84f, -3.03f, -0.0f)
            lineToRelative(-0.58f, 0.58f)
            curveToRelative(-0.71f, 0.71f, -1.12f, 1.65f, -1.2f, 2.64f)
            lineToRelative(-5.54f, 5.54f)
            curveToRelative(-1.28f, -0.87f, -2.83f, -1.39f, -4.49f, -1.39f)
            curveTo(3.59f, 8f, 0f, 11.59f, 0f, 16f)
            reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
            curveToRelative(0f, -1.67f, -0.51f, -3.21f, -1.39f, -4.49f)
            lineToRelative(5.54f, -5.54f)
            curveToRelative(0.99f, -0.08f, 1.94f, -0.5f, 2.64f, -1.21f)
            lineToRelative(0.57f, -0.57f)
            curveToRelative(0.84f, -0.84f, 0.84f, -2.2f, 0.0f, -3.04f)
            close()
            moveTo(8f, 21f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            close()
            moveTo(9.56f, 16.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(2f, 2f)
            close()
        }
    }.also { _Banjo = it }
