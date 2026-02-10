package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareA: ImageVector? = null

val Icons.Br.SquareA: ImageVector
    get() = _SquareA ?: UXIcon(name = "SquareA") {
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
            moveTo(15.58f, 7.61f)
            curveToRelative(-0.55f, -1.54f, -1.95f, -2.53f, -3.58f, -2.53f)
            reflectiveCurveToRelative(-3.04f, 0.99f, -3.58f, 2.53f)
            lineToRelative(-3.33f, 9.38f)
            curveToRelative(-0.28f, 0.78f, 0.13f, 1.64f, 0.91f, 1.92f)
            curveToRelative(0.78f, 0.28f, 1.64f, -0.13f, 1.92f, -0.91f)
            lineToRelative(0.71f, -2.0f)
            horizontalLineToRelative(6.75f)
            lineToRelative(0.71f, 2.0f)
            curveToRelative(0.22f, 0.61f, 0.8f, 1.0f, 1.41f, 1.0f)
            curveToRelative(0.17f, 0f, 0.34f, -0.03f, 0.5f, -0.09f)
            curveToRelative(0.78f, -0.28f, 1.19f, -1.13f, 0.91f, -1.92f)
            lineToRelative(-3.33f, -9.39f)
            close()
            moveTo(9.69f, 13f)
            lineToRelative(1.55f, -4.38f)
            curveToRelative(0.17f, -0.48f, 0.59f, -0.53f, 0.76f, -0.53f)
            reflectiveCurveToRelative(0.58f, 0.05f, 0.76f, 0.53f)
            lineToRelative(1.55f, 4.38f)
            horizontalLineToRelative(-4.62f)
            close()
        }
    }.also { _SquareA = it }
