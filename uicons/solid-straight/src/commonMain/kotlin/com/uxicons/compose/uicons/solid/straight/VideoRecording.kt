package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoRecording: ImageVector? = null

val Icons.Ss.VideoRecording: ImageVector
    get() = _VideoRecording ?: UXIcon(name = "VideoRecording") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(10.95f, 12.54f)
                lineTo(12f, 16f)
                horizontalLineToRelative(-1.74f)
                lineToRelative(-0.87f, -3f)
                horizontalLineToRelative(-0.78f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.84f, -0.42f, 1.58f, -1.05f, 2.03f)
                close()
                moveTo(16.5f, 9.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.65f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.55f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(22.1f, 10.5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-0.2f)
                curveToRelative(0f, -0.39f, -0.31f, -0.7f, -0.7f, -0.7f)
                reflectiveCurveToRelative(-0.7f, 0.31f, -0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.39f, 0.31f, 0.7f, 0.7f, 0.7f)
                reflectiveCurveToRelative(0.7f, -0.31f, 0.7f, -0.7f)
                verticalLineToRelative(-0.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.2f)
                curveToRelative(0f, 1.27f, -1.03f, 2.3f, -2.3f, 2.3f)
                reflectiveCurveToRelative(-2.3f, -1.03f, -2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, 1.03f, -2.3f, 2.3f, -2.3f)
                reflectiveCurveToRelative(2.3f, 1.03f, 2.3f, 2.3f)
                close()
                moveTo(10.4f, 10.5f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                close()
            }
        }.also { _VideoRecording = it}
