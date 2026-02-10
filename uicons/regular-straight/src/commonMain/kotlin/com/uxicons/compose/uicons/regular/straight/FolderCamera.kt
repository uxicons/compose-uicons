package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCamera: ImageVector? = null

val Icons.Rs.FolderCamera: ImageVector
    get() = _FolderCamera ?: UXIcon(name = "FolderCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(12.24f, 2f)
                lineTo(8.24f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 22f)
                lineTo(10f, 22f)
                verticalLineToRelative(-2f)
                lineTo(2f, 20f)
                lineTo(2f, 8f)
                lineTo(22f, 8f)
                verticalLineToRelative(4.05f)
                curveToRelative(0.73f, 0.08f, 1.42f, 0.32f, 2f, 0.71f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 6f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7.76f, 2f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 6f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(21.5f, 14f)
                horizontalLineToRelative(-0.46f)
                lineToRelative(-1.33f, -2f)
                horizontalLineToRelative(-3.41f)
                lineToRelative(-1.33f, 2f)
                horizontalLineToRelative(-0.46f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(22f, 22f)
                lineTo(14f, 22f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _FolderCamera = it}
