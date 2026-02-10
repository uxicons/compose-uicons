package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Ts.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 16f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveTo(16.91f, 0f, 12.5f, 0f)
                reflectiveCurveTo(4.5f, 3.59f, 4.5f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                close()
                moveTo(12.5f, 1f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveTo(8.64f, 1f, 12.5f, 1f)
                close()
                moveTo(12.5f, 20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                lineTo(6f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3.05f)
                curveTo(5.35f, 19.44f, 0.5f, 14.28f, 0.5f, 8f)
                curveTo(0.5f, 5.06f, 1.57f, 2.23f, 3.51f, 0.03f)
                lineToRelative(0.75f, 0.66f)
                curveToRelative(-1.78f, 2.02f, -2.76f, 4.61f, -2.76f, 7.31f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                curveToRelative(3.65f, 0f, 7.06f, -1.8f, 9.12f, -4.81f)
                lineToRelative(0.82f, 0.56f)
                curveToRelative(-2.25f, 3.29f, -5.97f, 5.25f, -9.95f, 5.25f)
                close()
            }
        }.also { _GlobeAlt = it}
