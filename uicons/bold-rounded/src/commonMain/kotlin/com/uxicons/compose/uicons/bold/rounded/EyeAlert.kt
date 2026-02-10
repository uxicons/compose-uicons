package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeAlert: ImageVector? = null

val Icons.Br.EyeAlert: ImageVector
    get() = _EyeAlert ?: UXIcon(name = "EyeAlert") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 7f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
            close()
            moveTo(12f, 16f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(0f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            close()
            moveTo(12f, 13f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(0f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-5.97f, 0f, -9.47f, -3.71f, -11.03f, -5.93f)
            curveToRelative(-1.29f, -1.84f, -1.29f, -4.3f, 0.0f, -6.14f)
            curveTo(2.52f, 6.71f, 6.03f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9.47f, 3.71f, 11.03f, 5.93f)
            curveToRelative(1.29f, 1.83f, 1.29f, 4.3f, 0f, 6.14f)
            curveToRelative(-1.55f, 2.21f, -5.06f, 5.93f, -11.03f, 5.93f)
            close()
            moveTo(12f, 6f)
            curveToRelative(-4.62f, 0f, -7.35f, 2.92f, -8.57f, 4.65f)
            curveToRelative(-0.57f, 0.81f, -0.57f, 1.89f, -0.0f, 2.69f)
            curveToRelative(1.22f, 1.74f, 3.96f, 4.65f, 8.58f, 4.65f)
            reflectiveCurveToRelative(7.35f, -2.92f, 8.57f, -4.65f)
            curveToRelative(0.57f, -0.81f, 0.57f, -1.89f, 0.0f, -2.69f)
            curveToRelative(-1.22f, -1.74f, -3.96f, -4.66f, -8.58f, -4.66f)
            close()
        }
    }.also { _EyeAlert = it }
