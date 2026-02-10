package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircleUp: ImageVector? = null

val Icons.Br.SortCircleUp: ImageVector
    get() = _SortCircleUp ?: UXIcon(name = "SortCircleUp") {
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
            moveTo(16.59f, 13.47f)
            curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.06f, 2.12f)
            lineToRelative(-2.93f, 2.76f)
            curveToRelative(-0.41f, 0.41f, -0.98f, 0.65f, -1.6f, 0.65f)
            reflectiveCurveToRelative(-1.2f, -0.24f, -1.63f, -0.68f)
            lineToRelative(-2.9f, -2.73f)
            curveToRelative(-0.6f, -0.57f, -0.63f, -1.52f, -0.06f, -2.12f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.63f, 2.12f, -0.06f)
            lineToRelative(2.47f, 2.33f)
            lineToRelative(2.47f, -2.33f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.54f, 2.12f, 0.06f)
            close()
            moveTo(7.11f, 10.05f)
            curveToRelative(-0.23f, -0.57f, -0.08f, -1.22f, 0.36f, -1.65f)
            lineToRelative(2.93f, -2.76f)
            curveToRelative(0.81f, -0.81f, 2.36f, -0.84f, 3.23f, 0.03f)
            lineToRelative(2.9f, 2.73f)
            curveToRelative(0.45f, 0.42f, 0.59f, 1.07f, 0.36f, 1.65f)
            curveToRelative(-0.23f, 0.57f, -0.78f, 0.95f, -1.39f, 0.95f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.61f, 0f, -1.17f, -0.38f, -1.39f, -0.95f)
            close()
        }
    }.also { _SortCircleUp = it }
