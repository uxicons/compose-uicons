package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCamera: ImageVector? = null

val Icons.Ts.FolderCamera: ImageVector
    get() = _FolderCamera ?: UXIcon(name = "FolderCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 16.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(17.5f, 20.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22f, 14f)
                horizontalLineToRelative(-1.23f)
                lineToRelative(-1.33f, -2f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(-1.33f, 2f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(16.1f, 13f)
                horizontalLineToRelative(2.81f)
                lineToRelative(0.67f, 1f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(0.67f, -1f)
                close()
                moveTo(23f, 23f)
                lineTo(12f, 23f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                close()
                moveTo(21.5f, 2f)
                lineTo(12.12f, 2f)
                lineTo(8.12f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 22f)
                lineTo(9f, 22f)
                verticalLineToRelative(-1f)
                lineTo(1f, 21f)
                lineTo(1f, 7f)
                lineTo(23f, 7f)
                verticalLineToRelative(5.14f)
                curveToRelative(0.36f, 0.09f, 0.69f, 0.23f, 1f, 0.41f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 6f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.88f, 1f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 6f)
                close()
            }
        }.also { _FolderCamera = it}
