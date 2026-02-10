package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextCheck: ImageVector? = null

val Icons.Ss.TextCheck: ImageVector
    get() = _TextCheck ?: UXIcon(name = "TextCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.24f, 14.24f)
                lineTo(7.12f, 0f)
                lineTo(0f, 14.24f)
                lineTo(2.24f, 14.24f)
                lineToRelative(2f, -4f)
                lineTo(10f, 10.24f)
                lineToRelative(2f, 4f)
                close()
                moveTo(5.24f, 8.24f)
                lineTo(7.12f, 4.47f)
                lineTo(9f, 8.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.0f, 24f)
                lineToRelative(-5.71f, -5.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(9.59f, -9.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-11.0f, 11.0f)
                close()
            }
        }.also { _TextCheck = it}
