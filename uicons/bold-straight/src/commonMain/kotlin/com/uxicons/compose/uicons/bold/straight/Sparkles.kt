package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sparkles: ImageVector? = null

val Icons.Bs.Sparkles: ImageVector
    get() = _Sparkles ?: UXIcon(name = "Sparkles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22.35f)
                lineTo(7.38f, 15.12f)
                lineTo(0.15f, 11.5f)
                lineTo(7.38f, 7.88f)
                lineTo(11f, 0.65f)
                lineToRelative(3.62f, 7.24f)
                lineTo(21.85f, 11.5f)
                lineToRelative(-7.24f, 3.62f)
                close()
                moveTo(6.85f, 11.5f)
                lineToRelative(2.76f, 1.38f)
                lineTo(11f, 15.65f)
                lineToRelative(1.38f, -2.76f)
                lineTo(15.15f, 11.5f)
                lineToRelative(-2.76f, -1.38f)
                lineTo(11f, 7.35f)
                lineTo(9.62f, 10.12f)
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
