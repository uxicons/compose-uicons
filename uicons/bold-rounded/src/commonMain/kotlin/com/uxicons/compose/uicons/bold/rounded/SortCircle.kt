package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircle: ImageVector? = null

val Icons.Br.SortCircle: ImageVector
    get() = _SortCircle ?: UXIcon(name = "SortCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
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
            moveTo(16.89f, 13.95f)
            curveToRelative(0.23f, 0.57f, 0.08f, 1.22f, -0.36f, 1.65f)
            lineToRelative(-2.93f, 2.76f)
            curveToRelative(-0.41f, 0.41f, -0.98f, 0.65f, -1.6f, 0.65f)
            reflectiveCurveToRelative(-1.2f, -0.24f, -1.63f, -0.68f)
            lineToRelative(-2.9f, -2.73f)
            curveToRelative(-0.45f, -0.42f, -0.59f, -1.07f, -0.36f, -1.65f)
            reflectiveCurveToRelative(0.78f, -0.95f, 1.39f, -0.95f)
            horizontalLineToRelative(7f)
            curveToRelative(0.61f, 0f, 1.17f, 0.38f, 1.39f, 0.95f)
            close()
            moveTo(16.53f, 8.41f)
            curveToRelative(0.45f, 0.42f, 0.59f, 1.07f, 0.36f, 1.65f)
            curveToRelative(-0.23f, 0.57f, -0.78f, 0.95f, -1.39f, 0.95f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.61f, 0f, -1.17f, -0.38f, -1.39f, -0.95f)
            reflectiveCurveToRelative(-0.08f, -1.22f, 0.36f, -1.65f)
            lineToRelative(2.93f, -2.76f)
            curveToRelative(0.81f, -0.81f, 2.36f, -0.84f, 3.23f, 0.03f)
            lineToRelative(2.9f, 2.73f)
            close()
        }
    }.also { _SortCircle = it }
