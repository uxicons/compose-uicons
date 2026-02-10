package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceGrinTongueWink: ImageVector? = null

val Icons.Bs.FaceGrinTongueWink: ImageVector
    get() = _FaceGrinTongueWink ?: UXIcon(name = "FaceGrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(10f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0f, 1.5f, 1f, 3f, 2.5f, 3f)
                reflectiveCurveToRelative(2.5f, -1.5f, 2.5f, -3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                lineTo(7f, 13f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _FaceGrinTongueWink = it}
