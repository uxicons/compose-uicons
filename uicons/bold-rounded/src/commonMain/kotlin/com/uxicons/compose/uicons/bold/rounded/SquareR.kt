package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareR: ImageVector? = null

val Icons.Br.SquareR: ImageVector
    get() = _SquareR ?: UXIcon(name = "SquareR") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 10f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(3.67f)
            lineToRelative(2.06f, 3.29f)
            curveToRelative(0.28f, 0.46f, 0.77f, 0.7f, 1.27f, 0.7f)
            curveToRelative(0.27f, 0f, 0.55f, -0.07f, 0.79f, -0.23f)
            curveToRelative(0.7f, -0.44f, 0.92f, -1.36f, 0.48f, -2.07f)
            lineToRelative(-1.56f, -2.5f)
            curveToRelative(1.38f, -0.89f, 2.29f, -2.44f, 2.29f, -4.2f)
            close()
            moveTo(9f, 8.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-3.5f)
            close()
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
        }
    }.also { _SquareR = it }
