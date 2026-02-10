package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle7: ImageVector? = null

val Icons.Br.Circle7: ImageVector
    get() = _Circle7 ?: UXIcon(name = "Circle7") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            reflectiveCurveTo(16.96f, 3f, 12f, 3f)
            close()
            moveTo(10.5f, 18.5f)
            curveToRelative(-0.22f, 0f, -0.44f, -0.05f, -0.65f, -0.15f)
            curveToRelative(-0.75f, -0.36f, -1.06f, -1.26f, -0.7f, -2.0f)
            lineToRelative(3.55f, -7.35f)
            horizontalLineToRelative(-3.2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.0f)
            curveToRelative(0.87f, 0f, 1.67f, 0.44f, 2.13f, 1.19f)
            curveToRelative(0.46f, 0.74f, 0.5f, 1.65f, 0.11f, 2.43f)
            lineToRelative(-3.88f, 8.04f)
            curveToRelative(-0.26f, 0.54f, -0.79f, 0.85f, -1.35f, 0.85f)
            close()
        }
    }.also { _Circle7 = it }
