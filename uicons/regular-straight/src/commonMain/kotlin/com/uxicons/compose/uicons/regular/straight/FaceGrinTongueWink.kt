package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceGrinTongueWink: ImageVector? = null

val Icons.Rs.FaceGrinTongueWink: ImageVector
    get() = _FaceGrinTongueWink ?: UXIcon(name = "FaceGrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 1.64f, 1.15f, 3.4f, 3f, 3.4f)
                reflectiveCurveToRelative(3f, -1.76f, 3f, -3.4f)
                verticalLineToRelative(-0.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineTo(7f, 14f)
                close()
                moveTo(13f, 16.6f)
                curveToRelative(0f, 0.66f, -0.41f, 1.4f, -1f, 1.4f)
                reflectiveCurveToRelative(-1f, -0.74f, -1f, -1.4f)
                verticalLineToRelative(-0.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 9.59f)
                curveToRelative(0.9f, -0.91f, 1.98f, -1.3f, 3.02f, -1.3f)
                curveToRelative(1.16f, 0f, 2.28f, 0.48f, 3.07f, 1.26f)
                lineToRelative(-1.41f, 1.42f)
                curveToRelative(-0.66f, -0.65f, -2.07f, -1.19f, -3.26f, 0.02f)
                lineToRelative(-1.42f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _FaceGrinTongueWink = it}
