package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExport: ImageVector? = null

val Icons.Ss.FileExport: ImageVector
    get() = _FileExport ?: UXIcon(name = "FileExport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(15f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(23.41f, 14.59f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.3f, 2.29f)
                lineTo(13f, 14.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.77f, -0.77f, 0.77f, -2.04f, 0f, -2.81f)
                close()
                moveTo(10.99f, 19f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4.59f)
                lineToRelative(4.41f, -4.41f)
                verticalLineToRelative(-1.59f)
                horizontalLineToRelative(-7f)
                lineTo(12.99f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(20f, 24f)
                verticalLineToRelative(-0.59f)
                lineToRelative(-4.41f, -4.41f)
                horizontalLineToRelative(-4.59f)
                close()
            }
        }.also { _FileExport = it}
