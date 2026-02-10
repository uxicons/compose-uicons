package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Ss.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
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
                moveTo(20f, 12f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _VolumeDown = it}
