package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Rs.Octagon: ImageVector
    get() = _Octagon ?: UXIcon(name = "Octagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.02f, 24f)
                lineTo(7.08f, 24f)
                lineTo(0.05f, 16.97f)
                lineTo(0.05f, 7.03f)
                lineTo(7.08f, 0f)
                horizontalLineToRelative(9.94f)
                lineToRelative(7.03f, 7.03f)
                verticalLineToRelative(9.94f)
                lineToRelative(-7.03f, 7.03f)
                close()
                moveTo(7.91f, 22f)
                horizontalLineToRelative(8.28f)
                lineToRelative(5.86f, -5.86f)
                lineTo(22.05f, 7.86f)
                lineToRelative(-5.86f, -5.86f)
                lineTo(7.91f, 2f)
                lineTo(2.05f, 7.86f)
                verticalLineToRelative(8.28f)
                lineToRelative(5.86f, 5.86f)
                close()
            }
        }.also { _Octagon = it}
