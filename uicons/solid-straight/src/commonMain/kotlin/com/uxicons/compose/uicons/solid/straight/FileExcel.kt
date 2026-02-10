package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExcel: ImageVector? = null

val Icons.Ss.FileExcel: ImageVector
    get() = _FileExcel ?: UXIcon(name = "FileExcel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(22f, 7f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(13.17f, 15.5f)
                lineToRelative(2.77f, -4.5f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(-1.6f, 2.59f)
                lineToRelative(-1.6f, -2.59f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(2.77f, 4.5f)
                lineToRelative(-2.77f, 4.5f)
                horizontalLineToRelative(2.35f)
                lineToRelative(1.6f, -2.59f)
                lineToRelative(1.6f, 2.59f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-2.77f, -4.5f)
                close()
            }
        }.also { _FileExcel = it}
