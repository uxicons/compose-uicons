package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gavel: ImageVector? = null

val Icons.Rs.Gavel: ImageVector
    get() = _Gavel ?: UXIcon(name = "Gavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.57f, 10.53f)
                lineToRelative(-0.99f, 0.99f)
                lineTo(12.49f, 2.44f)
                lineToRelative(0.99f, -0.99f)
                lineTo(12.07f, 0.03f)
                lineTo(4.18f, 7.92f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.02f, -1.02f)
                lineToRelative(3.83f, 3.83f)
                lineTo(0.02f, 22.56f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11.86f, 13.55f)
                lineToRelative(3.84f, 3.84f)
                lineToRelative(-1.02f, 1.02f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(7.89f, -7.89f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(17.49f, 10.27f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-3.67f, -3.67f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(3.67f, 3.67f)
                close()
                moveTo(11.08f, 3.85f)
                lineToRelative(1.33f, 1.33f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.33f, -1.33f)
                lineToRelative(3.04f, -3.04f)
                close()
                moveTo(15.87f, 14.72f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.25f, -1.25f)
                close()
            }
        }.also { _Gavel = it}
