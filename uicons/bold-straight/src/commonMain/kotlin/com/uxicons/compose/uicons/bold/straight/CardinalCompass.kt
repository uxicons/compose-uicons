package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardinalCompass: ImageVector? = null

val Icons.Bs.CardinalCompass: ImageVector
    get() = _CardinalCompass ?: UXIcon(name = "CardinalCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.04f, 14.8f)
                lineToRelative(7.0f, -2.8f)
                lineToRelative(-7.0f, -2.8f)
                lineToRelative(2.46f, -4.7f)
                lineToRelative(-4.7f, 2.46f)
                lineTo(12f, -0.04f)
                lineToRelative(-2.8f, 7.0f)
                lineToRelative(-4.7f, -2.46f)
                lineToRelative(2.46f, 4.7f)
                lineTo(-0.04f, 12f)
                lineToRelative(7.0f, 2.8f)
                lineToRelative(-2.46f, 4.7f)
                lineToRelative(4.7f, -2.46f)
                lineToRelative(2.8f, 7.0f)
                lineToRelative(2.8f, -7.0f)
                lineToRelative(4.7f, 2.46f)
                lineToRelative(-2.46f, -4.7f)
                close()
                moveTo(12f, 15.96f)
                lineToRelative(-1.13f, -2.83f)
                lineToRelative(-2.83f, -1.13f)
                lineToRelative(2.83f, -1.13f)
                lineToRelative(1.13f, -2.83f)
                lineToRelative(1.13f, 2.83f)
                lineToRelative(2.83f, 1.13f)
                lineToRelative(-2.83f, 1.13f)
                lineToRelative(-1.13f, 2.83f)
                close()
            }
        }.also { _CardinalCompass = it}
