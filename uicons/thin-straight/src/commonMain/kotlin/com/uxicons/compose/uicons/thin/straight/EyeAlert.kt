package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeAlert: ImageVector? = null

val Icons.Ts.EyeAlert: ImageVector
    get() = _EyeAlert ?: UXIcon(name = "EyeAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.82f, 11.18f)
                curveToRelative(-0.88f, -1.92f, -4.32f, -8.18f, -11.82f, -8.18f)
                reflectiveCurveTo(1.06f, 9.26f, 0.18f, 11.19f)
                curveToRelative(-0.24f, 0.52f, -0.23f, 1.12f, 0.0f, 1.64f)
                curveToRelative(0.88f, 1.92f, 4.32f, 8.18f, 11.82f, 8.18f)
                reflectiveCurveToRelative(10.95f, -6.26f, 11.82f, -8.18f)
                curveToRelative(0.24f, -0.52f, 0.24f, -1.12f, -0.0f, -1.64f)
                close()
                moveTo(22.91f, 12.4f)
                curveToRelative(-0.81f, 1.78f, -4.01f, 7.6f, -10.91f, 7.6f)
                reflectiveCurveTo(1.9f, 14.19f, 1.09f, 12.4f)
                curveToRelative(-0.12f, -0.26f, -0.12f, -0.55f, -0.0f, -0.81f)
                curveToRelative(0.81f, -1.78f, 4.01f, -7.6f, 10.91f, -7.6f)
                reflectiveCurveToRelative(10.1f, 5.81f, 10.91f, 7.6f)
                curveToRelative(0.12f, 0.26f, 0.12f, 0.55f, 0.0f, 0.81f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(12.5f, 13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                close()
                moveTo(13f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _EyeAlert = it}
