package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gavel: ImageVector? = null

val Icons.Ts.Gavel: ImageVector
    get() = _Gavel ?: UXIcon(name = "Gavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.31f, 10.49f)
                lineToRelative(-1.02f, 1.02f)
                lineTo(12.5f, 1.72f)
                lineToRelative(1.02f, -1.02f)
                lineTo(12.81f, -0.01f)
                lineTo(4.54f, 8.27f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(4.53f, 4.53f)
                lineTo(0.07f, 23.22f)
                lineToRelative(0.71f, 0.71f)
                lineTo(11.46f, 13.25f)
                lineToRelative(4.55f, 4.55f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(8.28f, -8.28f)
                lineToRelative(-0.71f, -0.71f)
                close()
                moveTo(19.31f, 9.94f)
                lineToRelative(-4.87f, 4.87f)
                lineToRelative(-5.27f, -5.27f)
                lineToRelative(4.87f, -4.87f)
                lineToRelative(5.27f, 5.27f)
                close()
                moveTo(11.8f, 2.43f)
                lineToRelative(1.53f, 1.53f)
                lineToRelative(-4.87f, 4.87f)
                lineToRelative(-1.53f, -1.53f)
                lineTo(11.8f, 2.43f)
                close()
                moveTo(15.15f, 15.52f)
                lineToRelative(4.87f, -4.87f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(-4.87f, 4.87f)
                lineToRelative(-1.57f, -1.57f)
                close()
            }
        }.also { _Gavel = it}
