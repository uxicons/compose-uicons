package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Bs.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(24f)
                close()
                moveTo(23.94f, 17f)
                lineTo(0.06f, 17f)
                lineTo(12f, 1.55f)
                lineToRelative(11.94f, 15.45f)
                close()
                moveTo(6.17f, 14f)
                horizontalLineToRelative(11.66f)
                lineToRelative(-5.83f, -7.55f)
                lineToRelative(-5.83f, 7.55f)
                close()
            }
        }.also { _Eject = it}
