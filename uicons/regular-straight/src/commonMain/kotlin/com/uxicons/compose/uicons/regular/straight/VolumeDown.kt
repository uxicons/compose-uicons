package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Rs.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.64f)
                lineToRelative(7.36f, 6.01f)
                lineTo(12f, 0.04f)
                lineToRelative(-7.35f, 5.96f)
                horizontalLineToRelative(-2.65f)
                close()
                moveTo(10f, 4.23f)
                verticalLineToRelative(15.56f)
                lineToRelative(-4.64f, -3.79f)
                horizontalLineToRelative(-3.36f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3.35f)
                lineToRelative(4.65f, -3.77f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _VolumeDown = it}
