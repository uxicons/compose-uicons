package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExport: ImageVector? = null

val Icons.Rs.FileExport: ImageVector
    get() = _FileExport ?: UXIcon(name = "FileExport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(11f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1.41f)
                lineTo(12.41f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(20f, 24f)
                verticalLineToRelative(-2f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                close()
                moveTo(13f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(13f, 3.41f)
                close()
                moveTo(23.42f, 17.4f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.01f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0f, 2.81f)
                close()
            }
        }.also { _FileExport = it}
