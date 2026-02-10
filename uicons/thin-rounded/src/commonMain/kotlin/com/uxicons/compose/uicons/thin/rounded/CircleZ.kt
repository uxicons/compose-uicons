package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleZ: ImageVector? = null

val Icons.Tr.CircleZ: ImageVector
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
                moveTo(8.04f, 16.32f)
                curveToRelative(0.1f, 0.33f, 0.41f, 0.68f, 0.96f, 0.68f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.9f, 0f, -1.65f, -0.54f, -1.92f, -1.38f)
                curveToRelative(-0.26f, -0.81f, 0.03f, -1.66f, 0.74f, -2.17f)
                lineToRelative(7.77f, -5.72f)
                curveToRelative(0.53f, -0.38f, 0.42f, -0.9f, 0.37f, -1.05f)
                curveToRelative(-0.1f, -0.33f, -0.41f, -0.68f, -0.96f, -0.68f)
                horizontalLineToRelative(-7.49f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.49f)
                curveToRelative(0.9f, 0f, 1.65f, 0.54f, 1.92f, 1.38f)
                curveToRelative(0.26f, 0.81f, -0.03f, 1.66f, -0.74f, 2.17f)
                lineToRelative(-7.77f, 5.72f)
                curveToRelative(-0.53f, 0.38f, -0.42f, 0.9f, -0.37f, 1.05f)
                close()
            }
        }.also { _CircleZ = it}
