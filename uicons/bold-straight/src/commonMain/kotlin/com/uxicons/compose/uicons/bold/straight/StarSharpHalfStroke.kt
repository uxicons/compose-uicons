package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalfStroke: ImageVector? = null

val Icons.Bs.StarSharpHalfStroke: ImageVector
    get() = _StarSharpHalfStroke ?: UXIcon(name = "StarSharpHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 6.96f)
                horizontalLineToRelative(-6.73f)
                lineTo(14.05f, 0f)
                horizontalLineToRelative(-4.09f)
                lineToRelative(-2.23f, 6.96f)
                lineTo(1f, 6.96f)
                lineToRelative(-1f, 4.47f)
                lineToRelative(5.1f, 3.73f)
                lineToRelative(-2.53f, 7.86f)
                lineToRelative(4.33f, 0.98f)
                lineToRelative(5.11f, -3.77f)
                lineToRelative(5.11f, 3.77f)
                lineToRelative(4.32f, -0.99f)
                lineToRelative(-2.53f, -7.86f)
                lineToRelative(5.1f, -3.73f)
                lineToRelative(-1f, -4.47f)
                close()
                moveTo(15.38f, 14.01f)
                lineToRelative(2.1f, 6.53f)
                lineToRelative(-5.49f, -4.04f)
                lineTo(12.0f, 3.45f)
                lineToRelative(2.08f, 6.51f)
                horizontalLineToRelative(6.82f)
                lineToRelative(-5.52f, 4.05f)
                close()
            }
        }.also { _StarSharpHalfStroke = it}
