package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCamera: ImageVector? = null

val Icons.Bs.FolderCamera: ImageVector
    get() = _FolderCamera ?: UXIcon(name = "FolderCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.56f, 15f)
                horizontalLineToRelative(-0.7f)
                lineToRelative(-1.28f, -2f)
                horizontalLineToRelative(-4.04f)
                lineToRelative(-1.28f, 2f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.56f, 21.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(24.06f, 9f)
                verticalLineToRelative(4.35f)
                curveToRelative(-0.34f, -0.16f, -0.7f, -0.28f, -1.09f, -0.33f)
                lineToRelative(-1.91f, -2.97f)
                verticalLineToRelative(-0.05f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-3f)
                lineTo(3.06f, 7f)
                verticalLineToRelative(12f)
                lineTo(11.06f, 19f)
                verticalLineToRelative(3f)
                lineTo(0.06f, 22f)
                lineTo(0.06f, 3.5f)
                curveTo(0.06f, 1.57f, 1.63f, 0f, 3.56f, 0f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _FolderCamera = it}
