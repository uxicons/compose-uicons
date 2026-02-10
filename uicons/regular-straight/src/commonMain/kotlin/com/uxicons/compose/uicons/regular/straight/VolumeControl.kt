package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeControl: ImageVector? = null

val Icons.Rs.VolumeControl: ImageVector
    get() = _VolumeControl ?: UXIcon(name = "VolumeControl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 17f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                close()
                moveTo(20f, 12f)
                lineTo(16.11f, 9f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.11f)
                lineToRelative(3.89f, -3f)
                close()
                moveTo(18f, 4.07f)
                lineTo(16.8f, 5f)
                horizontalLineToRelative(-1.8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.8f)
                lineToRelative(1.2f, 0.93f)
                verticalLineToRelative(-3.86f)
                close()
                moveTo(9f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9.39f)
                curveToRelative(0.7f, -0.62f, 1.61f, -1f, 2.61f, -1f)
                horizontalLineToRelative(0.43f)
                lineToRelative(1.29f, -1f)
                horizontalLineToRelative(-13.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.56f)
                curveToRelative(-0.59f, 0.34f, -1.27f, 0.56f, -2f, 0.56f)
                close()
            }
        }.also { _VolumeControl = it}
