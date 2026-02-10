package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextCheck: ImageVector? = null

val Icons.Bs.TextCheck: ImageVector
    get() = _TextCheck ?: UXIcon(name = "TextCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24.12f)
                lineToRelative(-6.06f, -6.06f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.94f, 3.94f)
                lineToRelative(8.94f, -8.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-11.06f, 11.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.15f, 15f)
                horizontalLineTo(15.5f)
                lineTo(8f, 0f)
                lineTo(0.5f, 15f)
                horizontalLineTo(3.85f)
                lineToRelative(1f, -2f)
                horizontalLineToRelative(6.29f)
                close()
                moveTo(6.35f, 10f)
                lineTo(8f, 6.71f)
                lineTo(9.65f, 10f)
                close()
            }
        }.also { _TextCheck = it}
