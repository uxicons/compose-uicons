package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoRecording: ImageVector? = null

val Icons.Rs.VideoRecording: ImageVector
    get() = _VideoRecording ?: UXIcon(name = "VideoRecording") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.56f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.56f, 2f, -0.56f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-3f)
                curveToRelative(-0.73f, 0f, -1.41f, -0.21f, -2f, -0.56f)
                verticalLineToRelative(5.55f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.78f)
                lineToRelative(0.87f, 3f)
                horizontalLineToRelative(1.74f)
                lineToRelative(-1.05f, -3.47f)
                curveToRelative(0.64f, -0.45f, 1.05f, -1.19f, 1.05f, -2.03f)
                close()
                moveTo(7.5f, 11.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.1f, 10.5f)
                verticalLineToRelative(-0.2f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                reflectiveCurveToRelative(-2.3f, 1.03f, -2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-0.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(0.2f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(0.2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 9.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.55f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.65f)
                close()
            }
        }.also { _VideoRecording = it}
