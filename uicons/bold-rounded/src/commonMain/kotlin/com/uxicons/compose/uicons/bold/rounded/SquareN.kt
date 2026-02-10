package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareN: ImageVector? = null

val Icons.Br.SquareN: ImageVector
    get() = _SquareN ?: UXIcon(name = "SquareN") {
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
            moveTo(18f, 6.5f)
            verticalLineToRelative(10.16f)
            curveToRelative(0f, 1.04f, -0.67f, 1.94f, -1.68f, 2.24f)
            curveToRelative(-0.22f, 0.07f, -0.45f, 0.1f, -0.67f, 0.1f)
            curveToRelative(-0.78f, 0f, -1.51f, -0.39f, -1.95f, -1.07f)
            lineToRelative(-4.71f, -8.11f)
            verticalLineToRelative(7.68f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(6f, 7.33f)
            curveToRelative(0f, -1.04f, 0.67f, -1.94f, 1.68f, -2.24f)
            curveToRelative(1.0f, -0.29f, 2.06f, 0.1f, 2.62f, 0.98f)
            lineToRelative(4.71f, 8.11f)
            verticalLineToRelative(-7.68f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _SquareN = it }
