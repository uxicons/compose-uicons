package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenRecorder: ImageVector? = null

val Icons.Bs.ScreenRecorder: ImageVector
    get() = _ScreenRecorder ?: UXIcon(name = "ScreenRecorder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                verticalLineToRelative(1.64f)
                lineToRelative(3f, -2.14f)
                verticalLineToRelative(7f)
                lineToRelative(-3f, -2.14f)
                verticalLineToRelative(1.64f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(11.09f)
                curveToRelative(0.19f, -1.14f, 0.71f, -2.17f, 1.45f, -3f)
                horizontalLineToRelative(-12.54f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-10.54f)
                curveToRelative(-0.83f, 0.74f, -1.86f, 1.26f, -3f, 1.45f)
                close()
            }
        }.also { _ScreenRecorder = it}
