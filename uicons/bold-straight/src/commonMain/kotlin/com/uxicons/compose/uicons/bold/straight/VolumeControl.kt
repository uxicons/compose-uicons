package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeControl: ImageVector? = null

val Icons.Bs.VolumeControl: ImageVector
    get() = _VolumeControl ?: UXIcon(name = "VolumeControl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 12f)
                lineToRelative(-3.89f, -3f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.11f)
                lineToRelative(3.89f, -3f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.06f)
                curveToRelative(0.69f, -1.19f, 1.97f, -2f, 3.44f, -2f)
                horizontalLineToRelative(0.43f)
                lineToRelative(1.29f, -1f)
                horizontalLineToRelative(-13.23f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(19f, 13.76f)
                lineTo(15.43f, 11f)
                horizontalLineToRelative(-1.43f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _VolumeControl = it}
