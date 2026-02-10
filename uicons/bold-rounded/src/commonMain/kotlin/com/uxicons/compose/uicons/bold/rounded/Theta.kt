package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Theta: ImageVector? = null

val Icons.Br.Theta: ImageVector
    get() = _Theta ?: UXIcon(name = "Theta") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(7.04f, 0f, 3f, 5.38f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 12f, 9f, 12f)
            reflectiveCurveToRelative(9f, -5.38f, 9f, -12f)
            reflectiveCurveTo(16.96f, 0f, 12f, 0f)
            close()
            moveTo(12f, 3f)
            curveToRelative(2.91f, 0f, 5.42f, 3.31f, 5.91f, 7.5f)
            lineTo(6.09f, 10.5f)
            curveToRelative(0.49f, -4.19f, 3f, -7.5f, 5.91f, -7.5f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-2.91f, 0f, -5.42f, -3.31f, -5.91f, -7.5f)
            horizontalLineToRelative(11.82f)
            curveToRelative(-0.49f, 4.19f, -3f, 7.5f, -5.91f, 7.5f)
            close()
        }
    }.also { _Theta = it }
