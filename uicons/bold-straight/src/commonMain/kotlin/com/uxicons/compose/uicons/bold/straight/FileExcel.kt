package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExcel: ImageVector? = null

val Icons.Bs.FileExcel: ImageVector
    get() = _FileExcel ?: UXIcon(name = "FileExcel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.38f, 0f)
                lineTo(5f, 0f)
                curveTo(3.35f, 0f, 2f, 1.35f, 2f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 5.66f)
                lineTo(16.38f, 0f)
                close()
                moveTo(15.58f, 22f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(-1.29f, -2.09f)
                lineToRelative(-1.29f, 2.09f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(2.46f, -4f)
                lineToRelative(-2.46f, -4f)
                horizontalLineToRelative(2.35f)
                lineToRelative(1.29f, 2.09f)
                lineToRelative(1.29f, -2.09f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-2.46f, 4f)
                lineToRelative(2.46f, 4f)
                close()
                moveTo(5f, 12f)
                lineTo(5f, 3f)
                lineTo(14f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                lineTo(5f, 12f)
                close()
            }
        }.also { _FileExcel = it}
