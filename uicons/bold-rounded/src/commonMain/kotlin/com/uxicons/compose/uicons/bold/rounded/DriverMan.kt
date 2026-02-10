package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Br.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(15.31f, 0f, 12f, 0f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(16.93f, 22.29f)
            curveToRelative(0.12f, 0.82f, -0.36f, 1.71f, -1.49f, 1.71f)
            curveToRelative(-0.73f, 0f, -1.38f, -0.54f, -1.48f, -1.29f)
            curveToRelative(-0.14f, -0.98f, -0.99f, -1.71f, -1.97f, -1.71f)
            reflectiveCurveToRelative(-1.82f, 0.74f, -1.97f, 1.71f)
            curveToRelative(-0.12f, 0.82f, -0.88f, 1.39f, -1.7f, 1.27f)
            curveToRelative(-0.82f, -0.12f, -1.39f, -0.88f, -1.27f, -1.7f)
            curveToRelative(0.35f, -2.44f, 2.47f, -4.29f, 4.93f, -4.29f)
            reflectiveCurveToRelative(4.58f, 1.84f, 4.93f, 4.29f)
            close()
            moveTo(21.97f, 22.41f)
            curveToRelative(0.05f, 0.83f, -0.58f, 1.54f, -1.41f, 1.58f)
            curveToRelative(-0.03f, 0.0f, -0.06f, 0.0f, -0.09f, 0.0f)
            curveToRelative(-0.79f, 0f, -1.45f, -0.61f, -1.5f, -1.41f)
            curveToRelative(-0.21f, -3.69f, -3.28f, -6.59f, -6.98f, -6.59f)
            reflectiveCurveToRelative(-6.76f, 2.89f, -6.98f, 6.59f)
            curveToRelative(-0.05f, 0.83f, -0.76f, 1.45f, -1.58f, 1.41f)
            curveToRelative(-0.83f, -0.05f, -1.46f, -0.76f, -1.41f, -1.58f)
            curveToRelative(0.31f, -5.28f, 4.69f, -9.41f, 9.97f, -9.41f)
            reflectiveCurveToRelative(9.66f, 4.13f, 9.97f, 9.41f)
            close()
        }
    }.also { _DriverMan = it }
