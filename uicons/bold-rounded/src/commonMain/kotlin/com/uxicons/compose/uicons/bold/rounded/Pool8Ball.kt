package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pool8Ball: ImageVector? = null

val Icons.Br.Pool8Ball: ImageVector
    get() = _Pool8Ball ?: UXIcon(name = "Pool8Ball") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(15f, 6f)
            curveToRelative(0f, 0.72f, -0.27f, 1.37f, -0.69f, 1.89f)
            curveToRelative(0.72f, 0.64f, 1.19f, 1.57f, 1.19f, 2.61f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -1.04f, 0.47f, -1.97f, 1.19f, -2.61f)
            curveToRelative(-0.42f, -0.52f, -0.69f, -1.17f, -0.69f, -1.89f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            curveToRelative(0f, -2.72f, 1.22f, -5.17f, 3.13f, -6.82f)
            curveToRelative(-0.72f, 1.1f, -1.13f, 2.41f, -1.13f, 3.82f)
            curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
            curveToRelative(0f, -1.41f, -0.42f, -2.72f, -1.13f, -3.82f)
            curveToRelative(1.92f, 1.65f, 3.13f, 4.1f, 3.13f, 6.82f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            close()
            moveTo(11f, 6f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            close()
            moveTo(10.5f, 10.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _Pool8Ball = it }
