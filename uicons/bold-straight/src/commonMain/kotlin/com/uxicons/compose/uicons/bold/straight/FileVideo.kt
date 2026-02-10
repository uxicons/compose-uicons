package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileVideo: ImageVector? = null

val Icons.Bs.FileVideo: ImageVector
    get() = _FileVideo ?: UXIcon(name = "FileVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.12f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 5.88f)
                lineTo(16.12f, 0f)
                close()
                moveTo(5f, 21f)
                lineTo(5f, 3f)
                lineTo(14f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                lineTo(5f, 21f)
                close()
                moveTo(14f, 14.64f)
                lineToRelative(3f, -2.14f)
                verticalLineToRelative(7f)
                lineToRelative(-3f, -2.14f)
                verticalLineToRelative(1.64f)
                lineTo(7f, 19f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.64f)
                close()
            }
        }.also { _FileVideo = it}
