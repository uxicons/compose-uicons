package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Ts.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                verticalLineToRelative(1f)
                lineTo(0f, 22f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(24f)
                close()
                moveTo(23.97f, 19f)
                lineTo(0.03f, 19f)
                lineTo(12f, 2.14f)
                lineToRelative(11.97f, 16.86f)
                close()
                moveTo(1.97f, 18f)
                horizontalLineToRelative(20.06f)
                lineTo(12f, 3.86f)
                lineTo(1.97f, 18f)
                close()
            }
        }.also { _Eject = it}
