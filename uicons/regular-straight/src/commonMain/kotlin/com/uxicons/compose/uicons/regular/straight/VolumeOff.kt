package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeOff: ImageVector? = null

val Icons.Rs.VolumeOff: ImageVector
    get() = _VolumeOff ?: UXIcon(name = "VolumeOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24.01f)
                lineToRelative(-7.36f, -6.01f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.65f)
                lineTo(12f, 0.04f)
                verticalLineToRelative(23.98f)
                close()
                moveTo(2f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3.36f)
                lineToRelative(4.64f, 3.79f)
                verticalLineTo(4.23f)
                lineToRelative(-4.65f, 3.77f)
                horizontalLineToRelative(-3.35f)
                close()
            }
        }.also { _VolumeOff = it}
