package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H1: ImageVector? = null

val Icons.Br.H1: ImageVector
    get() = _H1 ?: UXIcon(name = "H1") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(2f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(21.07f, 4.11f)
            curveToRelative(-0.56f, -0.23f, -1.21f, -0.1f, -1.64f, 0.33f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0f)
            lineToRelative(0.44f, -0.44f)
            verticalLineToRelative(9.38f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(22.0f, 5.5f)
            curveToRelative(0f, -0.61f, -0.36f, -1.15f, -0.93f, -1.39f)
            close()
        }
    }.also { _H1 = it }
