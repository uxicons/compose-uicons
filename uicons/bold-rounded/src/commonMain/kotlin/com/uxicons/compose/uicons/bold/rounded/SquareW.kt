package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareW: ImageVector? = null

val Icons.Br.SquareW: ImageVector
    get() = _SquareW ?: UXIcon(name = "SquareW") {
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
            moveTo(18.98f, 6.73f)
            lineToRelative(-1.6f, 10.42f)
            curveToRelative(-0.15f, 1.0f, -0.93f, 1.74f, -1.93f, 1.85f)
            curveToRelative(-1.01f, 0.11f, -1.92f, -0.45f, -2.29f, -1.39f)
            lineToRelative(-1.16f, -2.97f)
            lineToRelative(-1.16f, 2.98f)
            curveToRelative(-0.34f, 0.86f, -1.14f, 1.4f, -2.04f, 1.4f)
            curveToRelative(-1.14f, 0f, -2.03f, -0.87f, -2.18f, -1.87f)
            lineToRelative(-1.6f, -10.42f)
            curveToRelative(-0.13f, -0.82f, 0.44f, -1.58f, 1.25f, -1.71f)
            curveToRelative(0.82f, -0.12f, 1.58f, 0.43f, 1.71f, 1.25f)
            lineToRelative(1.15f, 7.47f)
            lineToRelative(1.47f, -3.78f)
            curveToRelative(0.23f, -0.58f, 0.78f, -0.96f, 1.4f, -0.96f)
            reflectiveCurveToRelative(1.17f, 0.38f, 1.4f, 0.96f)
            lineToRelative(1.47f, 3.78f)
            lineToRelative(1.15f, -7.47f)
            curveToRelative(0.13f, -0.82f, 0.89f, -1.38f, 1.71f, -1.25f)
            curveToRelative(0.82f, 0.13f, 1.38f, 0.89f, 1.25f, 1.71f)
            close()
        }
    }.also { _SquareW = it }
