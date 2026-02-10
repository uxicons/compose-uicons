package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCamera: ImageVector? = null

val Icons.Ss.FolderCamera: ImageVector
    get() = _FolderCamera ?: UXIcon(name = "FolderCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 6f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(0f, 6f)
                close()
                moveTo(24f, 16.5f)
                verticalLineToRelative(7.5f)
                lineTo(13f, 24f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.7f)
                lineToRelative(1.28f, -2f)
                horizontalLineToRelative(4.04f)
                lineToRelative(1.28f, 2f)
                horizontalLineToRelative(0.7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 19.5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(11f, 16.5f)
                curveToRelative(0f, -1.79f, 1.35f, -3.27f, 3.09f, -3.48f)
                lineToRelative(1.3f, -2.02f)
                horizontalLineToRelative(6.22f)
                lineToRelative(1.3f, 2.02f)
                curveToRelative(0.39f, 0.04f, 0.75f, 0.16f, 1.09f, 0.33f)
                verticalLineToRelative(-5.35f)
                lineTo(0f, 8f)
                verticalLineToRelative(14f)
                lineTo(11f, 22f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.also { _FolderCamera = it}
