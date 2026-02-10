package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThan: ImageVector? = null

val Icons.Sr.GreaterThan: ImageVector
    get() = _GreaterThan ?: UXIcon(name = "GreaterThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.02f, 24f)
                curveToRelative(-0.39f, 0f, -0.76f, -0.23f, -0.92f, -0.61f)
                curveToRelative(-0.21f, -0.51f, 0.02f, -1.1f, 0.53f, -1.31f)
                lineToRelative(20.46f, -8.66f)
                curveToRelative(0.66f, -0.28f, 0.9f, -0.92f, 0.9f, -1.42f)
                reflectiveCurveToRelative(-0.24f, -1.14f, -0.9f, -1.42f)
                lineTo(0.63f, 1.92f)
                curveTo(0.12f, 1.71f, -0.12f, 1.12f, 0.1f, 0.61f)
                reflectiveCurveTo(0.9f, -0.14f, 1.41f, 0.08f)
                lineToRelative(20.46f, 8.66f)
                curveToRelative(1.31f, 0.55f, 2.12f, 1.8f, 2.12f, 3.27f)
                reflectiveCurveToRelative(-0.81f, 2.71f, -2.12f, 3.27f)
                lineTo(1.41f, 23.92f)
                curveToRelative(-0.13f, 0.05f, -0.26f, 0.08f, -0.39f, 0.08f)
                close()
            }
        }.also { _GreaterThan = it}
