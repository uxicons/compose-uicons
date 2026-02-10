package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RunningTrack: ImageVector? = null

val Icons.Ss.RunningTrack: ImageVector
    get() = _RunningTrack ?: UXIcon(name = "RunningTrack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 9f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(15f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                horizontalLineToRelative(-8f)
                curveTo(3.59f, 20f, 0f, 16.41f, 0f, 12f)
                reflectiveCurveTo(3.59f, 4f, 8f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.41f, -1.72f, -4.43f, -4f, -4.9f)
                verticalLineToRelative(-3.03f)
                curveToRelative(3.94f, 0.49f, 7f, 3.86f, 7f, 7.93f)
                close()
            }
        }.also { _RunningTrack = it}
