package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Ss.Octagon: ImageVector
    get() = _Octagon ?: UXIcon(name = "Octagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.02f, 24f)
                horizontalLineTo(7.08f)
                lineTo(0.05f, 16.97f)
                verticalLineTo(7.03f)
                lineTo(7.08f, 0f)
                horizontalLineToRelative(9.94f)
                lineToRelative(7.03f, 7.03f)
                verticalLineToRelative(9.94f)
                lineToRelative(-7.03f, 7.03f)
                close()
            }
        }.also { _Octagon = it}
