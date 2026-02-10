package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceGrinTongueWink: ImageVector? = null

val Icons.Ss.FaceGrinTongueWink: ImageVector
    get() = _FaceGrinTongueWink ?: UXIcon(name = "FaceGrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16.6f)
                verticalLineToRelative(-0.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 0.66f, -0.41f, 1.4f, -1f, 1.4f)
                reflectiveCurveToRelative(-1f, -0.74f, -1f, -1.4f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(8.69f, 10.98f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(-0.79f, -0.78f, -1.91f, -1.26f, -3.07f, -1.26f)
                curveToRelative(-1.04f, 0f, -2.12f, 0.39f, -3.02f, 1.3f)
                lineToRelative(1.42f, 1.41f)
                curveToRelative(1.19f, -1.2f, 2.6f, -0.67f, 3.26f, -0.02f)
                close()
                moveTo(17f, 14f)
                lineTo(7f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 1.64f, 1.15f, 3.4f, 3f, 3.4f)
                reflectiveCurveToRelative(3f, -1.76f, 3f, -3.4f)
                verticalLineToRelative(-0.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 9.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _FaceGrinTongueWink = it}
