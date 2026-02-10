package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareQ: ImageVector? = null

val Icons.Br.SquareQ: ImageVector
    get() = _SquareQ ?: UXIcon(name = "SquareQ") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.15f, 16.03f)
            curveToRelative(0.53f, -0.9f, 0.84f, -1.96f, 0.84f, -3.08f)
            verticalLineToRelative(-1.9f)
            curveToRelative(0f, -3.33f, -2.69f, -6.05f, -5.99f, -6.05f)
            reflectiveCurveToRelative(-6.01f, 2.71f, -6.01f, 6.05f)
            verticalLineToRelative(1.9f)
            curveToRelative(0f, 3.33f, 2.7f, 6.05f, 6.01f, 6.05f)
            curveToRelative(1.11f, 0f, 2.15f, -0.31f, 3.04f, -0.84f)
            lineToRelative(0.4f, 0.4f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-0.41f, -0.41f)
            close()
            moveTo(12f, 16f)
            curveToRelative(-1.66f, 0f, -3.01f, -1.37f, -3.01f, -3.05f)
            verticalLineToRelative(-1.9f)
            curveToRelative(0f, -1.68f, 1.35f, -3.05f, 3.01f, -3.05f)
            curveToRelative(1.68f, 0f, 2.99f, 1.34f, 2.99f, 3.05f)
            verticalLineToRelative(1.9f)
            curveToRelative(0f, 0.28f, -0.04f, 0.56f, -0.1f, 0.81f)
            lineToRelative(-0.33f, -0.33f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            reflectiveCurveToRelative(-0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(0.34f, 0.34f)
            curveToRelative(-0.25f, 0.07f, -0.51f, 0.1f, -0.78f, 0.1f)
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
    }.also { _SquareQ = it }
