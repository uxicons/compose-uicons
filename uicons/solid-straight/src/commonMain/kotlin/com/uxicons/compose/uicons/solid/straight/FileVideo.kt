package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileVideo: ImageVector? = null

val Icons.Ss.FileVideo: ImageVector
    get() = _FileVideo ?: UXIcon(name = "FileVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                close()
                moveTo(17f, 0.59f)
                lineTo(17f, 5f)
                horizontalLineToRelative(4.41f)
                lineTo(17f, 0.59f)
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
                moveTo(18f, 12f)
                lineToRelative(-3f, 2.25f)
                verticalLineToRelative(-2.25f)
                lineTo(6f, 12f)
                verticalLineToRelative(8f)
                lineTo(15f, 20f)
                verticalLineToRelative(-2.25f)
                lineToRelative(3f, 2.25f)
                lineTo(18f, 12f)
                close()
            }
        }.also { _FileVideo = it}
