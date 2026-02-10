package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalfStroke: ImageVector? = null

val Icons.Ts.StarSharpHalfStroke: ImageVector
    get() = _StarSharpHalfStroke ?: UXIcon(name = "StarSharpHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.05f, 9f)
                horizontalLineToRelative(-9.22f)
                lineTo(11.98f, 0.11f)
                lineToRelative(-2.85f, 8.89f)
                lineTo(-0.09f, 9f)
                lineToRelative(7.46f, 5.44f)
                lineToRelative(-2.86f, 8.86f)
                lineToRelative(7.47f, -5.49f)
                lineToRelative(7.47f, 5.49f)
                lineToRelative(-2.86f, -8.86f)
                lineToRelative(7.46f, -5.44f)
                close()
                moveTo(17.54f, 20.66f)
                lineToRelative(-5.54f, -4.08f)
                lineTo(12f, 3.45f)
                lineToRelative(2.1f, 6.55f)
                horizontalLineToRelative(6.88f)
                lineToRelative(-5.57f, 4.06f)
                lineToRelative(2.13f, 6.6f)
                close()
            }
        }.also { _StarSharpHalfStroke = it}
