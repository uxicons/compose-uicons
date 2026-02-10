package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderUpload: ImageVector? = null

val Icons.Bs.FolderUpload: ImageVector
    get() = _FolderUpload ?: UXIcon(name = "FolderUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.5f)
                lineTo(24f, 23f)
                lineTo(16f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                lineTo(21f, 8f)
                lineTo(3f, 8f)
                verticalLineToRelative(12f)
                lineTo(8f, 20f)
                verticalLineToRelative(3f)
                lineTo(0f, 23f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(16.5f, 15f)
                lineToRelative(-3.79f, -3.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, 3.71f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 15f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _FolderUpload = it}
