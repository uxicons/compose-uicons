package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square1: ImageVector? = null

val Icons.Br.Square1: ImageVector
    get() = _Square1 ?: UXIcon(name = "Square1") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            close()
            moveTo(14f, 17.5f)
            lineTo(14f, 6.5f)
            curveToRelative(0f, -0.61f, -0.36f, -1.15f, -0.93f, -1.39f)
            curveToRelative(-0.56f, -0.23f, -1.21f, -0.1f, -1.64f, 0.33f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
            lineToRelative(0.44f, -0.44f)
            verticalLineToRelative(7.38f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _Square1 = it }
