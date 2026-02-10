package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Bs.Octagon: ImageVector
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
                moveTo(8.32f, 21f)
                horizontalLineToRelative(7.46f)
                lineToRelative(5.27f, -5.27f)
                verticalLineToRelative(-7.46f)
                lineTo(15.78f, 3f)
                horizontalLineToRelative(-7.46f)
                lineTo(3.05f, 8.27f)
                verticalLineToRelative(7.46f)
                lineToRelative(5.27f, 5.27f)
                close()
            }
        }.also { _Octagon = it}
