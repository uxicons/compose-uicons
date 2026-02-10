package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalfStroke: ImageVector? = null

val Icons.Rs.StarSharpHalfStroke: ImageVector
    get() = _StarSharpHalfStroke ?: UXIcon(name = "StarSharpHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.04f, 8.99f)
                horizontalLineToRelative(-9.21f)
                lineTo(11.98f, 0.11f)
                lineToRelative(-2.85f, 8.88f)
                lineTo(-0.08f, 8.99f)
                lineToRelative(7.46f, 5.45f)
                lineToRelative(-2.86f, 8.86f)
                lineToRelative(7.47f, -5.49f)
                lineToRelative(7.47f, 5.49f)
                lineToRelative(-2.86f, -8.86f)
                lineToRelative(7.46f, -5.45f)
                close()
                moveTo(11.98f, 15.34f)
                lineTo(11.98f, 6.66f)
                lineToRelative(1.39f, 4.33f)
                horizontalLineToRelative(4.55f)
                lineToRelative(-3.68f, 2.69f)
                lineToRelative(1.4f, 4.34f)
                lineToRelative(-3.66f, -2.69f)
                close()
            }
        }.also { _StarSharpHalfStroke = it}
