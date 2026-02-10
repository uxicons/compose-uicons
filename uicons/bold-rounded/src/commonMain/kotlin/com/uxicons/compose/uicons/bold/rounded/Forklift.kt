package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forklift: ImageVector? = null

val Icons.Br.Forklift: ImageVector
    get() = _Forklift ?: UXIcon(name = "Forklift") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 18f)
            horizontalLineToRelative(-0.5f)
            lineTo(22f, 4f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(-3.17f)
            lineToRelative(-1.72f, -8.58f)
            curveToRelative(-0.51f, -2.56f, -2.78f, -4.42f, -5.39f, -4.42f)
            horizontalLineToRelative(-3.22f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            horizontalLineToRelative(5f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.1f, -0.01f, -0.2f, -0.03f, -0.29f)
            lineToRelative(-0.54f, -2.71f)
            horizontalLineToRelative(2.57f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(3.22f)
            curveToRelative(1.19f, 0f, 2.22f, 0.85f, 2.45f, 2.01f)
            lineToRelative(1.6f, 7.99f)
            horizontalLineToRelative(-2.17f)
            curveToRelative(-0.27f, 0f, -0.52f, -0.18f, -0.59f, -0.45f)
            curveToRelative(-0.42f, -1.5f, -1.81f, -2.55f, -3.37f, -2.55f)
            horizontalLineToRelative(-3.64f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(13.77f, 18f)
            lineTo(3f, 18f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(3.64f)
            curveToRelative(0.22f, 0f, 0.42f, 0.15f, 0.48f, 0.36f)
            curveToRelative(0.44f, 1.55f, 1.87f, 2.64f, 3.48f, 2.64f)
            horizontalLineToRelative(2.77f)
            lineToRelative(0.4f, 2f)
            close()
        }
    }.also { _Forklift = it }
