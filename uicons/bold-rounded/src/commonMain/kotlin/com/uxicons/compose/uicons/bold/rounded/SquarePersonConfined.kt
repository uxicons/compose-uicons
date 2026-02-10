package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePersonConfined: ImageVector? = null

val Icons.Br.SquarePersonConfined: ImageVector
    get() = _SquarePersonConfined ?: UXIcon(name = "SquarePersonConfined") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
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
            moveTo(10f, 6.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18.86f, 12.31f)
            lineToRelative(-1.43f, 4.64f)
            curveToRelative(-0.41f, 1.24f, -1.56f, 2.05f, -2.82f, 2.05f)
            curveToRelative(-0.59f, 0f, -1.17f, -0.18f, -1.68f, -0.53f)
            lineToRelative(-3.55f, -2.77f)
            lineToRelative(-1.62f, 2.59f)
            curveToRelative(-0.44f, 0.7f, -1.36f, 0.92f, -2.07f, 0.48f)
            curveToRelative(-0.7f, -0.44f, -0.92f, -1.36f, -0.48f, -2.07f)
            lineToRelative(2.5f, -4f)
            curveToRelative(0.44f, -0.74f, 1.53f, -0.94f, 2.19f, -0.39f)
            lineToRelative(2.88f, 2.25f)
            lineToRelative(1.33f, -3.88f)
            curveToRelative(0.45f, -1.3f, 1.87f, -2.0f, 3.18f, -1.55f)
            curveToRelative(1.3f, 0.45f, 2.0f, 1.87f, 1.55f, 3.18f)
            close()
        }
    }.also { _SquarePersonConfined = it }
