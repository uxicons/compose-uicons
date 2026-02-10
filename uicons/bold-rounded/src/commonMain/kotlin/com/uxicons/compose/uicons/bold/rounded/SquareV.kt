package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareV: ImageVector? = null

val Icons.Br.SquareV: ImageVector
    get() = _SquareV ?: UXIcon(name = "SquareV") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(18.91f, 7.0f)
            lineToRelative(-3.33f, 9.39f)
            curveToRelative(-0.55f, 1.54f, -1.95f, 2.53f, -3.58f, 2.53f)
            reflectiveCurveToRelative(-3.04f, -0.99f, -3.58f, -2.53f)
            lineToRelative(-3.33f, -9.39f)
            curveToRelative(-0.28f, -0.78f, 0.13f, -1.64f, 0.91f, -1.92f)
            curveToRelative(0.78f, -0.28f, 1.64f, 0.13f, 1.92f, 0.91f)
            lineToRelative(3.33f, 9.39f)
            curveToRelative(0.17f, 0.48f, 0.59f, 0.53f, 0.76f, 0.53f)
            reflectiveCurveToRelative(0.58f, -0.05f, 0.76f, -0.53f)
            lineToRelative(3.33f, -9.39f)
            curveToRelative(0.28f, -0.78f, 1.13f, -1.19f, 1.92f, -0.91f)
            curveToRelative(0.78f, 0.28f, 1.19f, 1.14f, 0.91f, 1.92f)
            close()
        }
    }.also { _SquareV = it }
