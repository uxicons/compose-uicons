package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gavel: ImageVector? = null

val Icons.Bs.Gavel: ImageVector
    get() = _Gavel ?: UXIcon(name = "Gavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.82f, 10.05f)
                lineToRelative(-0.74f, 0.74f)
                lineTo(13.21f, 2.92f)
                lineToRelative(0.74f, -0.74f)
                lineTo(11.82f, 0.06f)
                lineTo(3.82f, 8.06f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.69f, -0.69f)
                lineToRelative(2.88f, 2.88f)
                lineTo(0.04f, 21.84f)
                lineToRelative(2.12f, 2.12f)
                lineTo(11.63f, 14.49f)
                lineToRelative(2.88f, 2.88f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(8.02f, -8.02f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(12.31f, 6.27f)
                lineToRelative(5.42f, 5.42f)
                lineToRelative(-2.33f, 2.34f)
                lineToRelative(-5.42f, -5.42f)
                lineToRelative(2.33f, -2.34f)
                close()
            }
        }.also { _Gavel = it}
