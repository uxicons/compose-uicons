package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Br.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 24f)
            horizontalLineToRelative(-4.19f)
            curveToRelative(-1.82f, 0f, -3.31f, -1.48f, -3.31f, -3.31f)
            curveToRelative(0f, -1.21f, 0.65f, -2.31f, 1.7f, -2.88f)
            curveToRelative(2.69f, -1.47f, 4.3f, -4.02f, 4.3f, -6.81f)
            curveToRelative(0f, -4.41f, -4.04f, -8f, -9f, -8f)
            reflectiveCurveTo(3f, 6.59f, 3f, 11f)
            curveToRelative(0f, 2.79f, 1.61f, 5.34f, 4.3f, 6.81f)
            curveToRelative(1.04f, 0.57f, 1.7f, 1.68f, 1.7f, 2.88f)
            curveToRelative(0f, 1.82f, -1.48f, 3.31f, -3.31f, 3.31f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.19f)
            curveToRelative(0.17f, 0f, 0.31f, -0.14f, 0.31f, -0.31f)
            curveToRelative(0f, -0.11f, -0.05f, -0.2f, -0.13f, -0.25f)
            curveTo(2.19f, 18.44f, 0f, 14.91f, 0f, 11f)
            curveTo(0f, 4.93f, 5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 4.93f, 12f, 11f)
            curveToRelative(0f, 3.91f, -2.19f, 7.44f, -5.87f, 9.45f)
            curveToRelative(-0.08f, 0.04f, -0.13f, 0.14f, -0.13f, 0.25f)
            curveToRelative(0f, 0.17f, 0.14f, 0.31f, 0.31f, 0.31f)
            horizontalLineToRelative(4.19f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _Omega = it }
