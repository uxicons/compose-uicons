package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenRecorder: ImageVector? = null

val Icons.Ts.ScreenRecorder: ImageVector
    get() = _ScreenRecorder ?: UXIcon(name = "ScreenRecorder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1.73f)
                lineToRelative(3f, 2.22f)
                verticalLineToRelative(-8.98f)
                lineToRelative(-3f, 2.22f)
                verticalLineToRelative(-1.73f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7f)
                close()
                moveTo(14f, 10.49f)
                verticalLineToRelative(5.02f)
                lineToRelative(-2f, -1.48f)
                verticalLineToRelative(-2.06f)
                lineToRelative(2f, -1.48f)
                close()
                moveTo(20f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(20f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(23f, 9.19f)
                curveToRelative(0.36f, -0.21f, 0.69f, -0.45f, 1f, -0.73f)
                verticalLineToRelative(11.54f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11.85f)
                curveToRelative(-0.11f, 0.32f, -0.2f, 0.66f, -0.26f, 1f)
                horizontalLineToRelative(-11.59f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(22f)
                close()
            }
        }.also { _ScreenRecorder = it}
