package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sparkles: ImageVector? = null

val Icons.Rs.Sparkles: ImageVector
    get() = _Sparkles ?: UXIcon(name = "Sparkles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21.24f)
                lineTo(6.75f, 14.74f)
                lineTo(0.26f, 11.5f)
                lineTo(6.75f, 8.26f)
                lineTo(10f, 1.76f)
                lineToRelative(3.25f, 6.49f)
                lineTo(19.74f, 11.5f)
                lineToRelative(-6.49f, 3.25f)
                close()
                moveTo(4.74f, 11.5f)
                lineToRelative(3.51f, 1.75f)
                lineTo(10f, 16.76f)
                lineToRelative(1.75f, -3.51f)
                lineTo(15.26f, 11.5f)
                lineTo(11.76f, 9.74f)
                lineTo(10f, 6.24f)
                lineTo(8.24f, 9.74f)
                close()
                moveTo(18f, 21f)
                lineToRelative(1.5f, 3f)
                lineTo(21f, 21f)
                lineToRelative(3f, -1.5f)
                lineTo(21f, 18f)
                lineToRelative(-1.5f, -3f)
                lineTo(18f, 18f)
                lineToRelative(-3f, 1.5f)
                close()
                moveTo(19.33f, 4.67f)
                lineTo(20.5f, 7f)
                lineToRelative(1.17f, -2.33f)
                lineTo(24f, 3.5f)
                lineTo(21.67f, 2.33f)
                lineTo(20.5f, 0f)
                lineTo(19.33f, 2.33f)
                lineTo(17f, 3.5f)
                close()
            }
        }.also { _Sparkles = it}
