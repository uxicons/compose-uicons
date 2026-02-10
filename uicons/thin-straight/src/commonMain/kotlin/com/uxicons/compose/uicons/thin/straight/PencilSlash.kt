package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilSlash: ImageVector? = null

val Icons.Ts.PencilSlash: ImageVector
    get() = _PencilSlash ?: UXIcon(name = "PencilSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.97f, 22.27f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(6.93f, -6.93f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0f, 19.34f)
                verticalLineToRelative(4.66f)
                horizontalLineToRelative(4.66f)
                lineToRelative(7.96f, -7.96f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-6.93f, 6.93f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-3.24f)
                lineToRelative(0.03f, -0.03f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(-0.03f, 0.03f)
                lineTo(1f, 23f)
                close()
                moveTo(23.04f, 5.62f)
                curveToRelative(1.28f, -1.28f, 1.28f, -3.37f, 0f, -4.66f)
                curveToRelative(-1.28f, -1.28f, -3.37f, -1.28f, -4.66f, 0f)
                lineToRelative(-8.35f, 8.35f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineToRelative(23.2f, 23.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-9.27f, -9.27f)
                lineToRelative(8.35f, -8.35f)
                close()
                moveTo(19.08f, 1.67f)
                curveToRelative(0.9f, -0.9f, 2.35f, -0.9f, 3.24f, 0f)
                curveToRelative(0.89f, 0.9f, 0.89f, 2.35f, 0f, 3.24f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(2.86f, -2.86f)
                close()
                moveTo(15.51f, 5.24f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(-4.78f, 4.78f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(4.78f, -4.78f)
                close()
            }
        }.also { _PencilSlash = it}
