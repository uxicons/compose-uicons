package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenRecorder: ImageVector? = null

val Icons.Sr.ScreenRecorder: ImageVector
    get() = _ScreenRecorder ?: UXIcon(name = "ScreenRecorder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(9f, 11f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(20f, 10f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -0.7f, 0.13f, -1.37f, 0.35f, -2f)
                horizontalLineToRelative(-9.35f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.54f)
                curveToRelative(-1.06f, 0.95f, -2.46f, 1.54f, -4f, 1.54f)
                close()
                moveTo(15f, 14.98f)
                curveToRelative(0f, 0.84f, -0.95f, 1.31f, -1.62f, 0.81f)
                lineToRelative(-1.46f, -1.12f)
                curveToRelative(-0.31f, 1.33f, -1.5f, 2.32f, -2.92f, 2.32f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.42f, 0f, 2.61f, 1.0f, 2.92f, 2.33f)
                lineToRelative(1.46f, -1.09f)
                curveToRelative(0.67f, -0.5f, 1.62f, -0.02f, 1.62f, 0.81f)
                verticalLineToRelative(3.94f)
                close()
            }
        }.also { _ScreenRecorder = it}
