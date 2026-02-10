package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileWord: ImageVector? = null

val Icons.Ss.FileWord: ImageVector
    get() = _FileWord ?: UXIcon(name = "FileWord") {
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
                moveTo(17.03f, 11f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(-1.15f, 5.97f)
                lineToRelative(-1.83f, -4.17f)
                lineToRelative(-1.83f, 4.18f)
                lineToRelative(-1.15f, -5.97f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(1.7f, 9f)
                horizontalLineToRelative(2.31f)
                lineToRelative(1.01f, -2.22f)
                lineToRelative(1.05f, 2.22f)
                horizontalLineToRelative(2.27f)
                lineToRelative(1.7f, -9f)
                close()
            }
        }.also { _FileWord = it}
