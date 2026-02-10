package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenRecorder: ImageVector? = null

val Icons.Ss.ScreenRecorder: ImageVector
    get() = _ScreenRecorder ?: UXIcon(name = "ScreenRecorder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(13f, 20f)
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
                horizontalLineToRelative(10f)
                reflectiveCurveToRelative(1.35f, 0.0f, 1.35f, 0.0f)
                curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.54f, 0f, 2.94f, -0.59f, 4f, -1.54f)
                verticalLineToRelative(11.54f)
                close()
                moveTo(12f, 14.78f)
                lineTo(15f, 17f)
                verticalLineToRelative(-8f)
                lineToRelative(-3f, 2.22f)
                verticalLineToRelative(-2.22f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(9f)
                close()
                moveTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _ScreenRecorder = it}
