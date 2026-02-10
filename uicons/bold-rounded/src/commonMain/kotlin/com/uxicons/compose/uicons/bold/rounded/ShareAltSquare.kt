package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareAltSquare: ImageVector? = null

val Icons.Br.ShareAltSquare: ImageVector
    get() = _ShareAltSquare ?: UXIcon(name = "ShareAltSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.98f, 10.21f)
            lineToRelative(-2.07f, 1.1f)
            curveToRelative(0.05f, 0.22f, 0.09f, 0.45f, 0.09f, 0.69f)
            reflectiveCurveToRelative(-0.03f, 0.47f, -0.09f, 0.69f)
            lineToRelative(2.07f, 1.1f)
            curveToRelative(0.53f, -0.49f, 1.24f, -0.79f, 2.02f, -0.79f)
            curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
            reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            curveToRelative(0f, -0.15f, 0.02f, -0.3f, 0.04f, -0.44f)
            lineToRelative(-2.23f, -1.19f)
            curveToRelative(-0.51f, 0.39f, -1.13f, 0.63f, -1.82f, 0.63f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            curveToRelative(0.69f, 0f, 1.31f, 0.24f, 1.82f, 0.63f)
            lineToRelative(2.23f, -1.19f)
            curveToRelative(-0.02f, -0.15f, -0.04f, -0.29f, -0.04f, -0.44f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
            curveToRelative(-0.78f, 0f, -1.48f, -0.3f, -2.02f, -0.79f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            close()
        }
    }.also { _ShareAltSquare = it }
