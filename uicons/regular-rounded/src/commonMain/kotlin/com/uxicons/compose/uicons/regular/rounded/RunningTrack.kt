package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RunningTrack: ImageVector? = null

val Icons.Rr.RunningTrack: ImageVector
    get() = _RunningTrack ?: UXIcon(name = "RunningTrack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 4f)
                horizontalLineToRelative(-8f)
                curveTo(3.59f, 4f, 0f, 7.59f, 0f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16f, 10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(-8f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                verticalLineToRelative(-2.05f)
                curveToRelative(2.83f, 0.48f, 5f, 2.94f, 5f, 5.91f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _RunningTrack = it}
