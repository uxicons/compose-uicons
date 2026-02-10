package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDownload: ImageVector? = null

val Icons.Bs.FolderDownload: ImageVector
    get() = _FolderDownload ?: UXIcon(name = "FolderDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 19f)
                lineToRelative(-3.79f, 3.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, -3.71f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20.5f, 3f)
                horizontalLineTo(12.35f)
                lineTo(8.35f, 1f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineTo(23f)
                horizontalLineTo(8.72f)
                lineToRelative(-3.0f, -3f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2.82f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(8.82f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _FolderDownload = it}
