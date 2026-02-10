package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gavel: ImageVector? = null

val Icons.Ss.Gavel: ImageVector
    get() = _Gavel ?: UXIcon(name = "Gavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.29f, 15.98f)
                lineToRelative(-2.43f, -2.43f)
                lineTo(1.44f, 23.98f)
                lineTo(0.02f, 22.56f)
                lineTo(10.45f, 12.14f)
                lineToRelative(-2.41f, -2.41f)
                lineTo(13.91f, 3.85f)
                lineToRelative(6.25f, 6.25f)
                curveToRelative(-1.54f, 1.54f, -3.99f, 3.99f, -5.87f, 5.87f)
                close()
                moveTo(22.57f, 10.53f)
                lineToRelative(-7.89f, 7.89f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(7.89f, -7.89f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(13.49f, 1.44f)
                lineTo(12.07f, 0.03f)
                lineTo(4.18f, 7.92f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13.49f, 1.44f)
                close()
            }
        }.also { _Gavel = it}
