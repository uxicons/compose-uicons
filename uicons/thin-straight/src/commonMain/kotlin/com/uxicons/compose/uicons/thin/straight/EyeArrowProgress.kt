package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Ts.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.82f, 11.18f)
                curveToRelative(-0.88f, -1.92f, -4.32f, -8.18f, -11.82f, -8.18f)
                reflectiveCurveTo(1.05f, 9.27f, 0.18f, 11.19f)
                curveToRelative(-0.24f, 0.52f, -0.23f, 1.11f, 0.0f, 1.64f)
                curveToRelative(0.88f, 1.92f, 4.31f, 8.18f, 11.82f, 8.18f)
                reflectiveCurveToRelative(10.95f, -6.26f, 11.82f, -8.19f)
                curveToRelative(0.23f, -0.52f, 0.23f, -1.11f, -0.0f, -1.64f)
                close()
                moveTo(22.91f, 12.4f)
                curveToRelative(-0.81f, 1.78f, -4.01f, 7.6f, -10.91f, 7.6f)
                reflectiveCurveTo(1.9f, 14.19f, 1.09f, 12.4f)
                curveToRelative(-0.12f, -0.26f, -0.12f, -0.55f, -0.0f, -0.81f)
                curveToRelative(0.81f, -1.78f, 4.01f, -7.6f, 10.91f, -7.6f)
                reflectiveCurveToRelative(10.1f, 5.81f, 10.91f, 7.59f)
                curveToRelative(0.12f, 0.26f, 0.12f, 0.55f, 0.0f, 0.81f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.84f, 0f, -3.43f, -1.01f, -4.3f, -2.49f)
                lineToRelative(1.8f, -1.8f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(2.29f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-2.24f, 2.24f)
                curveToRelative(-0.16f, -0.48f, -0.26f, -0.99f, -0.26f, -1.53f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _EyeArrowProgress = it}
