package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniversalAccess: ImageVector? = null

val Icons.Br.UniversalAccess: ImageVector
    get() = _UniversalAccess ?: UXIcon(name = "UniversalAccess") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(10f, 6f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            close()
            moveTo(17.88f, 8.41f)
            curveToRelative(0.33f, 0.76f, -0.03f, 1.64f, -0.79f, 1.97f)
            lineToRelative(-3.09f, 1.32f)
            verticalLineToRelative(1.9f)
            lineToRelative(1.8f, 3.15f)
            curveToRelative(0.41f, 0.72f, 0.16f, 1.64f, -0.56f, 2.05f)
            curveToRelative(-0.23f, 0.13f, -0.49f, 0.2f, -0.74f, 0.2f)
            curveToRelative(-0.52f, 0f, -1.03f, -0.27f, -1.3f, -0.76f)
            lineToRelative(-1.2f, -2.1f)
            lineToRelative(-1.2f, 2.1f)
            curveToRelative(-0.28f, 0.48f, -0.78f, 0.76f, -1.3f, 0.76f)
            curveToRelative(-0.25f, 0f, -0.51f, -0.06f, -0.74f, -0.2f)
            curveToRelative(-0.72f, -0.41f, -0.97f, -1.33f, -0.56f, -2.05f)
            lineToRelative(1.8f, -3.15f)
            verticalLineToRelative(-1.9f)
            lineToRelative(-3.09f, -1.32f)
            curveToRelative(-0.76f, -0.33f, -1.11f, -1.21f, -0.79f, -1.97f)
            curveToRelative(0.33f, -0.76f, 1.21f, -1.12f, 1.97f, -0.79f)
            lineToRelative(3.22f, 1.38f)
            horizontalLineToRelative(1.38f)
            lineToRelative(3.22f, -1.38f)
            curveToRelative(0.76f, -0.33f, 1.64f, 0.03f, 1.97f, 0.79f)
            close()
        }
    }.also { _UniversalAccess = it }
