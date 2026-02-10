package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAudio: ImageVector? = null

val Icons.Ss.FileAudio: ImageVector
    get() = _FileAudio ?: UXIcon(name = "FileAudio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(13f, 11.44f)
                lineToRelative(-3.89f, 2.56f)
                horizontalLineToRelative(-2.11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.11f)
                lineToRelative(3.89f, 2.56f)
                verticalLineToRelative(-9.12f)
                close()
                moveTo(17f, 16f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _FileAudio = it}
