package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardinalCompass: ImageVector? = null

val Icons.Rs.CardinalCompass: ImageVector
    get() = _CardinalCompass ?: UXIcon(name = "CardinalCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.95f, 14.63f)
                lineToRelative(6.83f, -2.63f)
                lineToRelative(-6.83f, -2.63f)
                lineToRelative(2.55f, -4.87f)
                lineToRelative(-4.87f, 2.55f)
                lineTo(12f, 0.21f)
                lineToRelative(-2.63f, 6.83f)
                lineToRelative(-4.87f, -2.55f)
                lineToRelative(2.55f, 4.87f)
                lineTo(0.21f, 12f)
                lineToRelative(6.83f, 2.63f)
                lineToRelative(-2.55f, 4.87f)
                lineToRelative(4.87f, -2.55f)
                lineToRelative(2.63f, 6.83f)
                lineToRelative(2.63f, -6.83f)
                lineToRelative(4.87f, 2.55f)
                lineToRelative(-2.55f, -4.87f)
                close()
                moveTo(12f, 18.21f)
                lineToRelative(-1.73f, -4.49f)
                lineToRelative(-4.49f, -1.73f)
                lineToRelative(4.49f, -1.73f)
                lineToRelative(1.73f, -4.49f)
                lineToRelative(1.73f, 4.49f)
                lineToRelative(4.49f, 1.73f)
                lineToRelative(-4.49f, 1.73f)
                lineToRelative(-1.73f, 4.49f)
                close()
            }
        }.also { _CardinalCompass = it}
