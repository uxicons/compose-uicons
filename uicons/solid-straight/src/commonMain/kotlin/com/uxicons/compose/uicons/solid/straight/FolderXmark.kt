package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmark: ImageVector? = null

val Icons.Ss.FolderXmark: ImageVector
    get() = _FolderXmark ?: UXIcon(name = "FolderXmark") {
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
                moveTo(24f, 9f)
                verticalLineToRelative(14f)
                lineTo(0f, 23f)
                lineTo(0f, 9f)
                lineTo(24f, 9f)
                close()
                moveTo(13.41f, 16f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.54f, -2.54f)
                close()
            }
        }.also { _FolderXmark = it}
