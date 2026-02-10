package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoseReel: ImageVector? = null

val Icons.Bs.HoseReel: ImageVector
    get() = _HoseReel ?: UXIcon(name = "HoseReel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 5f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(11f, 14f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(23.46f, 16.14f)
                lineToRelative(-1.46f, 7.87f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1.46f, -7.87f)
                curveToRelative(-0.1f, -0.59f, 0.36f, -1.14f, 0.96f, -1.14f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(3f, 6.59f, 3f, 11f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(1.78f, 0f, 3.42f, -0.59f, 4.74f, -1.57f)
                lineToRelative(0.59f, 3.19f)
                curveToRelative(-1.58f, 0.88f, -3.4f, 1.39f, -5.34f, 1.39f)
                curveTo(4.93f, 22f, 0f, 17.07f, 0f, 11f)
                reflectiveCurveTo(4.93f, 0f, 11f, 0f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.6f, 0f, 1.06f, 0.54f, 0.96f, 1.14f)
                close()
            }
        }.also { _HoseReel = it}
