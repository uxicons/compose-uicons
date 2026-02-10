package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Ts.Octagon: ImageVector
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
                moveTo(7.49f, 23f)
                horizontalLineToRelative(9.11f)
                lineToRelative(6.44f, -6.44f)
                lineTo(23.04f, 7.44f)
                lineTo(16.61f, 1f)
                lineTo(7.49f, 1f)
                lineTo(1.05f, 7.44f)
                verticalLineToRelative(9.11f)
                lineToRelative(6.44f, 6.44f)
                close()
            }
        }.also { _Octagon = it}
