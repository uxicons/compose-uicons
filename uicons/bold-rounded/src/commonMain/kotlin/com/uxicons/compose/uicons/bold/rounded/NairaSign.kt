package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NairaSign: ImageVector? = null

val Icons.Br.NairaSign: ImageVector
    get() = _NairaSign ?: UXIcon(name = "NairaSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 10.5f)
            horizontalLineToRelative(-0.5f)
            lineTo(22f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(19f, 10.5f)
            horizontalLineToRelative(-6.18f)
            lineTo(6.95f, 1.24f)
            curveTo(6.3f, 0.23f, 5.09f, -0.23f, 3.93f, 0.11f)
            curveToRelative(-1.16f, 0.34f, -1.93f, 1.38f, -1.93f, 2.58f)
            verticalLineToRelative(7.81f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(5f, 13.5f)
            horizontalLineToRelative(6.18f)
            lineToRelative(5.87f, 9.26f)
            curveToRelative(0.65f, 1.01f, 1.86f, 1.47f, 3.02f, 1.13f)
            curveToRelative(1.16f, -0.34f, 1.93f, -1.38f, 1.93f, -2.58f)
            verticalLineToRelative(-7.81f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(5f, 10.5f)
            lineTo(5f, 3.76f)
            lineToRelative(4.27f, 6.74f)
            lineTo(5f, 10.5f)
            close()
            moveTo(19f, 20.24f)
            lineToRelative(-4.27f, -6.74f)
            horizontalLineToRelative(4.27f)
            verticalLineToRelative(6.74f)
            close()
        }
    }.also { _NairaSign = it }
