package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailPending: ImageVector? = null

val Icons.Br.EmailPending: ImageVector
    get() = _EmailPending ?: UXIcon(name = "EmailPending") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 12.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-10f)
            curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.92f, 0f, -1.72f, 0.51f, -2.15f, 1.25f)
            lineToRelative(7.03f, 7.08f)
            curveToRelative(0.86f, 0.86f, 2.39f, 0.87f, 3.26f, -0.01f)
            lineToRelative(2.23f, -2.23f)
            curveToRelative(0.34f, -0.34f, 0.82f, -0.49f, 1.29f, -0.41f)
            curveToRelative(0.01f, 0.0f, 0.03f, 0.01f, 0.04f, 0.01f)
            curveToRelative(1.19f, 0.19f, 1.66f, 1.66f, 0.81f, 2.51f)
            lineToRelative(-2.1f, 2.1f)
            curveToRelative(-0.87f, 0.87f, -1.99f, 1.5f, -3.21f, 1.66f)
            curveToRelative(-1.67f, 0.21f, -3.28f, -0.35f, -4.45f, -1.51f)
            lineToRelative(-5.25f, -5.3f)
            verticalLineToRelative(7.35f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(14f, 5f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
            close()
            moveTo(18f, 5f)
            curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.29f, 0.71f)
            lineToRelative(1.29f, 1.29f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
            lineToRelative(-1f, -1f)
            verticalLineToRelative(-1.59f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _EmailPending = it }
