package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardinalCompass: ImageVector? = null

val Icons.Ss.CardinalCompass: ImageVector
    get() = _CardinalCompass ?: UXIcon(name = "CardinalCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                lineToRelative(-3f, -9f)
                lineTo(0f, 12f)
                lineToRelative(9f, -3f)
                lineTo(12f, 0f)
                lineToRelative(3f, 9f)
                lineToRelative(9f, 3f)
                lineToRelative(-9f, 3f)
                lineToRelative(-3f, 9f)
                close()
                moveTo(7.42f, 7.42f)
                lineToRelative(0.47f, -1.39f)
                lineToRelative(-3.9f, -2.04f)
                lineToRelative(2.04f, 3.9f)
                lineToRelative(1.39f, -0.47f)
                close()
                moveTo(16.57f, 7.42f)
                lineToRelative(1.39f, 0.47f)
                lineToRelative(2.04f, -3.9f)
                lineToRelative(-3.9f, 2.04f)
                lineToRelative(0.47f, 1.39f)
                close()
                moveTo(7.42f, 16.57f)
                lineToRelative(-1.39f, -0.47f)
                lineToRelative(-2.04f, 3.9f)
                lineToRelative(3.9f, -2.04f)
                lineToRelative(-0.47f, -1.39f)
                close()
                moveTo(16.57f, 16.57f)
                lineToRelative(-0.47f, 1.39f)
                lineToRelative(3.9f, 2.04f)
                lineToRelative(-2.04f, -3.9f)
                lineToRelative(-1.39f, 0.47f)
                close()
            }
        }.also { _CardinalCompass = it}
