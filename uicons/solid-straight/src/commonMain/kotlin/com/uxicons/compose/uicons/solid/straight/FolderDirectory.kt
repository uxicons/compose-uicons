package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDirectory: ImageVector? = null

val Icons.Ss.FolderDirectory: ImageVector
    get() = _FolderDirectory ?: UXIcon(name = "FolderDirectory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                verticalLineToRelative(-3f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                close()
                moveTo(10.02f, 22f)
                curveToRelative(-0.76f, -1.12f, -1.02f, -2f, -1.02f, -3.5f)
                curveToRelative(0f, -2.1f, 1.43f, -3.77f, 3.66f, -5.5f)
                horizontalLineToRelative(-3.66f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.51f)
                curveToRelative(-2.11f, 1.62f, -3f, 2.82f, -3f, 4.01f)
                curveToRelative(0.01f, 0.41f, 0.19f, 3.5f, 3f, 3.5f)
                horizontalLineToRelative(10f)
                lineTo(24f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(13f)
                lineTo(10.02f, 22f)
                close()
            }
        }.also { _FolderDirectory = it}
