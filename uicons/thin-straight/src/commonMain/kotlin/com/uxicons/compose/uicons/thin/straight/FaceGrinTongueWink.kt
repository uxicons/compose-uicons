package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceGrinTongueWink: ImageVector? = null

val Icons.Ts.FaceGrinTongueWink: ImageVector
    get() = _FaceGrinTongueWink ?: UXIcon(name = "FaceGrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.68f, 1.15f, 3.5f, 3f, 3.5f)
                reflectiveCurveToRelative(3f, -1.82f, 3f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                lineTo(7f, 15f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 16.5f)
                curveToRelative(0f, 1.2f, -0.77f, 2.5f, -2f, 2.5f)
                reflectiveCurveToRelative(-2f, -1.3f, -2f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 6.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(17f, 12.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.61f, 10.01f)
                curveToRelative(0.76f, 0.05f, 1.5f, 0.39f, 2.04f, 0.92f)
                lineToRelative(0.7f, -0.71f)
                curveToRelative(-0.71f, -0.7f, -1.69f, -1.14f, -2.68f, -1.21f)
                curveToRelative(-0.81f, -0.05f, -2.02f, 0.12f, -3.13f, 1.24f)
                lineToRelative(0.71f, 0.7f)
                curveToRelative(0.85f, -0.85f, 1.74f, -0.98f, 2.35f, -0.94f)
                close()
            }
        }.also { _FaceGrinTongueWink = it}
