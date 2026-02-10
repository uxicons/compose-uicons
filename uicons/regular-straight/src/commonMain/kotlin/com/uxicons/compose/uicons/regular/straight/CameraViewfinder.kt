package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraViewfinder: ImageVector? = null

val Icons.Rs.CameraViewfinder: ImageVector
    get() = _CameraViewfinder ?: UXIcon(name = "CameraViewfinder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                lineTo(8f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(2f, 3f)
                close()
                moveTo(12f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(8.5f, 7f)
                horizontalLineToRelative(0.46f)
                lineToRelative(1.33f, -2f)
                horizontalLineToRelative(3.41f)
                lineToRelative(1.33f, 2f)
                horizontalLineToRelative(0.46f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                lineTo(6f, 17f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(15.5f, 9f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _CameraViewfinder = it}
