package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailStar: ImageVector? = null

val Icons.Br.EmailStar: ImageVector
    get() = _EmailStar ?: UXIcon(name = "EmailStar") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 15.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.96f, 0f, -1.78f, 0.55f, -2.2f, 1.34f)
            lineToRelative(6.93f, 6.93f)
            curveToRelative(0.94f, 0.94f, 2.59f, 0.94f, 3.54f, 0f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.58f, 2.12f, 0f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
            reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
            lineToRelative(-5.11f, -5.11f)
            verticalLineToRelative(7.22f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(14.73f, 7.33f)
            lineTo(13.79f, 10.34f)
            curveToRelative(-0.13f, 0.41f, 0.01f, 0.85f, 0.35f, 1.1f)
            curveToRelative(0.34f, 0.26f, 0.8f, 0.27f, 1.16f, 0.03f)
            lineToRelative(2.71f, -1.81f)
            lineToRelative(2.75f, 1.79f)
            curveToRelative(0.35f, 0.23f, 0.82f, 0.21f, 1.16f, -0.05f)
            reflectiveCurveToRelative(0.47f, -0.7f, 0.34f, -1.11f)
            lineToRelative(-0.98f, -2.98f)
            lineToRelative(2.37f, -1.93f)
            curveToRelative(0.32f, -0.27f, 0.44f, -0.71f, 0.29f, -1.11f)
            reflectiveCurveToRelative(-0.52f, -0.66f, -0.94f, -0.66f)
            horizontalLineToRelative(-3.0f)
            lineToRelative(-1.06f, -2.98f)
            curveToRelative(-0.15f, -0.39f, -0.52f, -0.65f, -0.94f, -0.65f)
            reflectiveCurveToRelative(-0.79f, 0.26f, -0.94f, 0.65f)
            lineToRelative(-1.06f, 2.98f)
            horizontalLineToRelative(-3.0f)
            curveToRelative(-0.42f, 0f, -0.79f, 0.26f, -0.94f, 0.66f)
            curveToRelative(-0.14f, 0.39f, -0.03f, 0.83f, 0.29f, 1.11f)
            lineToRelative(2.38f, 1.93f)
            close()
        }
    }.also { _EmailStar = it }
