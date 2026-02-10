package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenRecorder: ImageVector? = null

val Icons.Rs.ScreenRecorder: ImageVector
    get() = _ScreenRecorder ?: UXIcon(name = "ScreenRecorder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2.22f)
                lineToRelative(3f, 2.22f)
                verticalLineToRelative(-8f)
                lineToRelative(-3f, 2.22f)
                verticalLineToRelative(-2.22f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(20f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(20f, 2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(22f, 9.65f)
                curveToRelative(0.75f, -0.26f, 1.42f, -0.67f, 2f, -1.19f)
                verticalLineToRelative(11.54f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineToRelative(11.35f, 0.01f)
                curveToRelative(-0.22f, 0.62f, -0.34f, 1.28f, -0.34f, 1.98f)
                verticalLineToRelative(0.01f)
                lineToRelative(-11f, -0.01f)
                curveToRelative(-0.55f, 0f, -1f, 0.46f, -1f, 1.01f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(20f)
                close()
            }
        }.also { _ScreenRecorder = it}
