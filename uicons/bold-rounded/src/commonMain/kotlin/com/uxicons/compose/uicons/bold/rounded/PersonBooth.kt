package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBooth: ImageVector? = null

val Icons.Br.PersonBooth: ImageVector
    get() = _PersonBooth ?: UXIcon(name = "PersonBooth") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(11.5f, 15f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 5f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(-2.14f)
            curveToRelative(-0.85f, 0f, -1.66f, -0.38f, -2.2f, -1.04f)
            curveToRelative(-0.55f, -0.67f, -0.77f, -1.54f, -0.6f, -2.39f)
            curveToRelative(0.41f, -2.07f, 1.46f, -3.69f, 2.42f, -4.78f)
            curveToRelative(-3.0f, -2.0f, -4.62f, -4.77f, -5.48f, -7.17f)
            verticalLineToRelative(4.89f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4.0f)
            curveToRelative(-0.52f, 0f, -1.0f, -0.27f, -1.27f, -0.7f)
            lineToRelative(-1.23f, -1.96f)
            verticalLineToRelative(5.03f)
            lineToRelative(1.78f, 1.06f)
            curveToRelative(0.75f, 0.45f, 1.22f, 1.27f, 1.22f, 2.15f)
            verticalLineToRelative(3.93f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.65f)
            lineToRelative(-3.56f, -2.12f)
            curveToRelative(-0.9f, -0.55f, -1.45f, -1.53f, -1.45f, -2.57f)
            verticalLineToRelative(-4.66f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            curveToRelative(1.46f, 0f, 2.79f, 0.74f, 3.57f, 1.98f)
            lineToRelative(1.26f, 2.02f)
            horizontalLineToRelative(1.67f)
            verticalLineToRelative(-5.0f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(4f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            close()
            moveTo(21f, 11.81f)
            verticalLineToRelative(-6.81f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-3.85f)
            curveToRelative(0.37f, 2.3f, 1.62f, 6.5f, 5.85f, 8.81f)
            close()
            moveTo(21f, 19f)
            verticalLineToRelative(-3.51f)
            curveToRelative(-0.69f, 0.71f, -1.61f, 1.91f, -1.97f, 3.51f)
            close()
            moveTo(1.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _PersonBooth = it }
