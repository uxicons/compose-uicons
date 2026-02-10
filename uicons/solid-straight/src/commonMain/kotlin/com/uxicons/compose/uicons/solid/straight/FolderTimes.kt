package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTimes: ImageVector? = null

val Icons.Ss.FolderTimes: ImageVector
    get() = _FolderTimes ?: UXIcon(name = "FolderTimes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 9f)
                verticalLineToRelative(14f)
                lineTo(24f, 23f)
                lineTo(24f, 9f)
                lineTo(0f, 9f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                verticalLineToRelative(-3f)
                curveTo(0f, 2.34f, 1.34f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(12.79f, 18.21f)
                lineToRelative(-1.79f, -1.79f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.21f, 1.21f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _FolderTimes = it}
