package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KissBeam: ImageVector? = null

val Icons.Ts.KissBeam: ImageVector
    get() = _KissBeam ?: UXIcon(name = "KissBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(14.47f, 16f)
                curveToRelative(0.33f, 0.32f, 0.53f, 0.76f, 0.53f, 1.25f)
                curveToRelative(0f, 0.96f, -0.79f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.96f, 0f, 1.75f, 0.79f, 1.75f, 1.75f)
                curveToRelative(0f, 0.49f, -0.2f, 0.93f, -0.53f, 1.25f)
                close()
                moveTo(10f, 11f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.43f, -0.79f, -3f, -1.5f, -3f)
                reflectiveCurveToRelative(-1.5f, 1.57f, -1.5f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.89f, 1.07f, -4f, 2.5f, -4f)
                reflectiveCurveToRelative(2.5f, 2.11f, 2.5f, 4f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.43f, -0.79f, -3f, -1.5f, -3f)
                reflectiveCurveToRelative(-1.5f, 1.57f, -1.5f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.89f, 1.07f, -4f, 2.5f, -4f)
                reflectiveCurveToRelative(2.5f, 2.11f, 2.5f, 4f)
                close()
            }
        }.also { _KissBeam = it}
