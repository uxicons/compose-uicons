package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeControl: ImageVector? = null

val Icons.Ss.VolumeControl: ImageVector
    get() = _VolumeControl ?: UXIcon(name = "VolumeControl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 8f)
                verticalLineToRelative(-4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(15f, 3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.11f)
                lineToRelative(3.89f, 3f)
                verticalLineToRelative(-12f)
                lineToRelative(-3.89f, 3f)
                close()
                moveTo(22f, 10f)
                curveToRelative(0.73f, 0f, 1.41f, -0.21f, 2f, -0.56f)
                verticalLineToRelative(14.56f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13.73f)
                lineToRelative(-1.29f, 1f)
                horizontalLineToRelative(-0.43f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(0.43f)
                lineToRelative(2.59f, 2f)
                horizontalLineToRelative(-4.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _VolumeControl = it}
