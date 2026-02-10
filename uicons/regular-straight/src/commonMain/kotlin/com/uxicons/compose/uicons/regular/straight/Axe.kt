package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Axe: ImageVector? = null

val Icons.Rs.Axe: ImageVector
    get() = _Axe ?: UXIcon(name = "Axe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 5.95f)
                lineToRelative(-1.06f, 0.06f)
                curveToRelative(-0.71f, 0.04f, -2.62f, -0.03f, -3.74f, -0.79f)
                lineToRelative(2.01f, -2.01f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.04f, 2.04f)
                lineTo(14.09f, 0.16f)
                lineToRelative(-5.92f, 5.92f)
                lineToRelative(3.66f, 3.67f)
                lineTo(0.05f, 21.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(11.74f, -11.74f)
                curveToRelative(0.75f, 1.12f, 0.84f, 3.03f, 0.8f, 3.74f)
                lineToRelative(-0.05f, 1.05f)
                horizontalLineToRelative(1.05f)
                curveToRelative(5.29f, 0f, 8.99f, -3.7f, 8.99f, -8.99f)
                lineToRelative(-0.0f, -1.06f)
                close()
                moveTo(15.99f, 13.95f)
                curveToRelative(-0.08f, -1.25f, -0.41f, -3.25f, -1.66f, -4.51f)
                lineToRelative(-3.34f, -3.35f)
                lineToRelative(3.09f, -3.09f)
                lineToRelative(3.34f, 3.35f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.26f, 1.27f, 3.26f, 1.59f, 4.52f, 1.66f)
                curveToRelative(-0.38f, 3.31f, -2.64f, 5.57f, -5.95f, 5.94f)
                close()
            }
        }.also { _Axe = it}
