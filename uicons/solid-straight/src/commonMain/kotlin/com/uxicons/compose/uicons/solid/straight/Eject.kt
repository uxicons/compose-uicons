package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Ss.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
                moveTo(23.96f, 18f)
                lineTo(0.04f, 18f)
                lineTo(12f, 1.82f)
                lineToRelative(11.96f, 16.18f)
                close()
            }
        }.also { _Eject = it}
