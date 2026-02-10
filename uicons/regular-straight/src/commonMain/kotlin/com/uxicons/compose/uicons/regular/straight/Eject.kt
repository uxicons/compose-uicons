package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Rs.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1.82f)
                lineTo(0.04f, 18f)
                horizontalLineToRelative(23.91f)
                lineTo(12f, 1.82f)
                close()
                moveTo(12f, 5.18f)
                lineToRelative(7.99f, 10.82f)
                lineTo(4.01f, 16.0f)
                lineToRelative(7.99f, -10.82f)
                close()
                moveTo(24f, 20.0f)
                verticalLineToRelative(2f)
                lineTo(0f, 22.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _Eject = it}
