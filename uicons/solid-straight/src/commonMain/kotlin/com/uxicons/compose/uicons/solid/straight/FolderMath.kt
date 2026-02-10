package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderMath: ImageVector? = null

val Icons.Ss.FolderMath: ImageVector
    get() = _FolderMath ?: UXIcon(name = "FolderMath") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(12.24f, 3f)
                lineTo(8.24f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.21f, 19.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.79f, 1.79f)
                close()
                moveTo(20f, 20f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 10f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _FolderMath = it}
