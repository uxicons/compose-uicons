package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleZ: ImageVector? = null

val Icons.Ts.CircleZ: ImageVector
    get() = _CircleZ ?: UXIcon(name = "CircleZ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
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
                moveTo(8.25f, 17f)
                horizontalLineToRelative(8.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8.75f)
                curveToRelative(-0.49f, 0f, -0.92f, -0.29f, -1.11f, -0.74f)
                reflectiveCurveToRelative(-0.08f, -0.96f, 0.26f, -1.31f)
                lineTo(15.89f, 7.35f)
                curveToRelative(0.09f, -0.09f, 0.07f, -0.17f, 0.05f, -0.22f)
                curveToRelative(-0.02f, -0.05f, -0.07f, -0.12f, -0.19f, -0.12f)
                lineTo(7f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.75f)
                curveToRelative(0.49f, 0f, 0.92f, 0.29f, 1.11f, 0.74f)
                reflectiveCurveToRelative(0.08f, 0.96f, -0.26f, 1.31f)
                lineToRelative(-8.49f, 8.6f)
                curveToRelative(-0.09f, 0.09f, -0.07f, 0.17f, -0.05f, 0.22f)
                curveToRelative(0.02f, 0.05f, 0.07f, 0.12f, 0.19f, 0.12f)
                close()
            }
        }.also { _CircleZ = it}
