package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Bs.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(3f, 24f)
                lineTo(21f, 24f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10.16f, 11.99f)
                lineToRelative(-4.16f, 5.83f)
                lineTo(6f, 6.16f)
                lineToRelative(4.16f, 5.83f)
                close()
                moveTo(7.43f, 3f)
                horizontalLineToRelative(9.15f)
                lineToRelative(-4.57f, 6.41f)
                lineTo(7.43f, 3f)
                close()
                moveTo(12f, 14.57f)
                lineToRelative(4.59f, 6.43f)
                lineTo(7.41f, 21f)
                lineToRelative(4.59f, -6.43f)
                close()
                moveTo(13.84f, 11.99f)
                lineToRelative(4.16f, -5.83f)
                verticalLineToRelative(11.65f)
                lineToRelative(-4.16f, -5.83f)
                close()
            }
        }.also { _Notdef = it}
