package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Axe: ImageVector? = null

val Icons.Ts.Axe: ImageVector
    get() = _Axe ?: UXIcon(name = "Axe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.47f, 6.98f)
                curveToRelative(-0.03f, 0.0f, -3.09f, 0.18f, -4.5f, -1.23f)
                lineToRelative(-0.5f, -0.51f)
                lineToRelative(2.38f, -2.38f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-2.38f, 2.38f)
                lineToRelative(-3.42f, -3.43f)
                lineToRelative(-5.23f, 5.23f)
                lineToRelative(3.42f, 3.43f)
                lineTo(0.02f, 22.27f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(12.51f, -12.51f)
                lineToRelative(0.5f, 0.51f)
                curveToRelative(1.39f, 1.39f, 1.24f, 4.46f, 1.24f, 4.5f)
                lineToRelative(-0.03f, 0.53f)
                horizontalLineToRelative(0.53f)
                curveToRelative(5.02f, 0f, 8.52f, -3.5f, 8.52f, -8.52f)
                verticalLineToRelative(-0.53f)
                lineToRelative(-0.53f, 0.03f)
                close()
                moveTo(15.98f, 14.99f)
                curveToRelative(-0.02f, -1.06f, -0.22f, -3.4f, -1.54f, -4.71f)
                lineToRelative(-3.92f, -3.94f)
                lineToRelative(3.82f, -3.82f)
                lineToRelative(3.92f, 3.94f)
                curveToRelative(1.33f, 1.33f, 3.67f, 1.52f, 4.73f, 1.53f)
                curveToRelative(-0.22f, 3.99f, -3.01f, 6.78f, -7.0f, 7f)
                close()
            }
        }.also { _Axe = it}
