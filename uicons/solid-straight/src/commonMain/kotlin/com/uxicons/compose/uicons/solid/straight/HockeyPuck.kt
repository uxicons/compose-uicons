package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Ss.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.05f, 7.79f)
                curveTo(0.56f, 3.44f, 5.72f, 0f, 12f, 0f)
                reflectiveCurveTo(23.44f, 3.44f, 23.95f, 7.79f)
                curveTo(23.44f, 11.82f, 18.28f, 15f, 12f, 15f)
                reflectiveCurveTo(0.56f, 11.82f, 0.05f, 7.79f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-5.1f, 0f, -9.55f, -1.93f, -12f, -4.81f)
                verticalLineTo(15.5f)
                curveTo(0f, 20.19f, 5.38f, 24f, 12f, 24f)
                reflectiveCurveToRelative(12f, -3.81f, 12f, -8.5f)
                verticalLineTo(12.19f)
                curveTo(21.55f, 15.07f, 17.1f, 17f, 12f, 17f)
                close()
            }
        }.also { _HockeyPuck = it}
