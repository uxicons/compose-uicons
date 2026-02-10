package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Sr.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 24f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.03f, -0.39f, -0.08f)
                lineTo(2.15f, 15.27f)
                curveTo(0.84f, 14.71f, 0.03f, 13.46f, 0.03f, 12f)
                reflectiveCurveToRelative(0.81f, -2.71f, 2.12f, -3.27f)
                lineTo(22.61f, 0.08f)
                curveToRelative(0.51f, -0.22f, 1.1f, 0.02f, 1.31f, 0.53f)
                reflectiveCurveToRelative(-0.02f, 1.1f, -0.53f, 1.31f)
                lineTo(2.93f, 10.58f)
                curveToRelative(-0.66f, 0.28f, -0.9f, 0.92f, -0.9f, 1.42f)
                reflectiveCurveToRelative(0.24f, 1.14f, 0.9f, 1.42f)
                lineToRelative(20.46f, 8.66f)
                curveToRelative(0.51f, 0.21f, 0.75f, 0.8f, 0.53f, 1.31f)
                curveToRelative(-0.16f, 0.38f, -0.53f, 0.61f, -0.92f, 0.61f)
                close()
            }
        }.also { _LessThan = it}
