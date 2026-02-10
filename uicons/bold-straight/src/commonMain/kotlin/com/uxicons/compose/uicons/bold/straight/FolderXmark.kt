package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmark: ImageVector? = null

val Icons.Bs.FolderXmark: ImageVector
    get() = _FolderXmark ?: UXIcon(name = "FolderXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                lineTo(12.35f, 3f)
                lineTo(8.35f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 20f)
                lineTo(3f, 8f)
                lineTo(21f, 8f)
                verticalLineToRelative(12f)
                lineTo(3f, 20f)
                close()
                moveTo(16.06f, 12.14f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _FolderXmark = it}
