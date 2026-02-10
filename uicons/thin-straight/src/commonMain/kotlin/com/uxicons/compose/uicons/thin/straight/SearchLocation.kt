package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Ts.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                curveToRelative(-1.34f, 0f, -2.59f, 0.52f, -3.54f, 1.47f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.47f, 3.54f)
                lineToRelative(3.53f, 3.45f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                reflectiveCurveToRelative(-2.2f, -1.47f, -3.54f, -1.47f)
                close()
                moveTo(12.83f, 11.82f)
                lineToRelative(-2.83f, 2.77f)
                lineToRelative(-2.83f, -2.77f)
                curveToRelative(-0.76f, -0.76f, -1.17f, -1.76f, -1.17f, -2.83f)
                reflectiveCurveToRelative(0.42f, -2.07f, 1.17f, -2.83f)
                curveToRelative(0.76f, -0.76f, 1.76f, -1.17f, 2.83f, -1.17f)
                reflectiveCurveToRelative(2.07f, 0.42f, 2.83f, 1.17f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.07f, -1.17f, 2.82f)
                close()
                moveTo(11f, 8.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24.0f, 23.29f)
                lineToRelative(-6.6f, -6.6f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.6f, 6.6f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(1f, 10f)
                curveTo(1f, 5.04f, 5.04f, 1f, 10f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(1f, 14.96f, 1f, 10f)
                close()
            }
        }.also { _SearchLocation = it}
