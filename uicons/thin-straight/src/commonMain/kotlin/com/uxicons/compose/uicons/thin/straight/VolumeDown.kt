package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Ts.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.82f)
                lineToRelative(6.68f, 5.46f)
                lineTo(12f, 0.58f)
                lineToRelative(-6.68f, 5.42f)
                horizontalLineToRelative(-2.82f)
                close()
                moveTo(11f, 2.68f)
                verticalLineToRelative(18.67f)
                lineToRelative(-5.32f, -4.35f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.18f)
                lineToRelative(5.32f, -4.32f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _VolumeDown = it}
