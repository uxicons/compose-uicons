package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainClock: ImageVector? = null

val Icons.Ss.TrainClock: ImageVector
    get() = _TrainClock ?: UXIcon(name = "TrainClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(0.34f, 0f, 0.67f, 0.03f, 1f, 0.05f)
                verticalLineToRelative(5.95f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(13f, 6f)
                horizontalLineToRelative(8.25f)
                curveToRelative(-1.97f, -2.85f, -4.86f, -4.9f, -8.25f, -5.66f)
                close()
                moveTo(4f, 6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6f)
                close()
                moveTo(17.5f, 18.5f)
                curveToRelative(0f, 3.04f, -2.46f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.46f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.46f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.46f, 5.5f, 5.5f)
                close()
                moveTo(15.21f, 20.29f)
                lineTo(13f, 18.09f)
                verticalLineToRelative(-3.09f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.91f)
                lineToRelative(2.79f, 2.79f)
                close()
                moveTo(22.43f, 8f)
                horizontalLineToRelative(-22.43f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4.94f)
                curveToRelative(1.03f, -2.91f, 3.8f, -5f, 7.06f, -5f)
                reflectiveCurveToRelative(6.03f, 2.09f, 7.06f, 5f)
                horizontalLineToRelative(4.94f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.55f, -0.57f, -4.92f, -1.57f, -7f)
                close()
            }
        }.also { _TrainClock = it}
