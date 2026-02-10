package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeAlert: ImageVector? = null

val Icons.Rr.EyeAlert: ImageVector
    get() = _EyeAlert ?: UXIcon(name = "EyeAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveToRelative(-6.19f, 0f, -9.72f, -4.08f, -11.27f, -6.51f)
                curveToRelative(-0.98f, -1.53f, -0.98f, -3.44f, 0f, -4.97f)
                curveTo(2.28f, 7.08f, 5.81f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9.72f, 4.08f, 11.27f, 6.51f)
                curveToRelative(0.98f, 1.53f, 0.98f, 3.44f, 0f, 4.97f)
                curveToRelative(-1.55f, 2.43f, -5.08f, 6.51f, -11.27f, 6.51f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-5.24f, 0f, -8.25f, 3.5f, -9.59f, 5.59f)
                curveToRelative(-0.55f, 0.87f, -0.55f, 1.95f, 0f, 2.82f)
                curveToRelative(1.33f, 2.09f, 4.35f, 5.59f, 9.59f, 5.59f)
                reflectiveCurveToRelative(8.25f, -3.5f, 9.59f, -5.59f)
                curveToRelative(0.55f, -0.87f, 0.55f, -1.95f, 0f, -2.82f)
                curveToRelative(-1.33f, -2.09f, -4.35f, -5.59f, -9.59f, -5.59f)
                close()
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
            }
        }.also { _EyeAlert = it}
