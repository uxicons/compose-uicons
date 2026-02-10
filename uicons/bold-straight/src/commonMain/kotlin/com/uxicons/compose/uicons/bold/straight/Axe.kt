package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Axe: ImageVector? = null

val Icons.Bs.Axe: ImageVector
    get() = _Axe ?: UXIcon(name = "Axe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 6.41f)
                lineToRelative(-1.59f, 0.09f)
                curveToRelative(-0.44f, 0.03f, -1.57f, -0.01f, -2.48f, -0.32f)
                lineToRelative(1.62f, -1.62f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.82f, 1.82f)
                lineToRelative(-3.71f, -3.72f)
                lineToRelative(-6.35f, 6.35f)
                lineToRelative(3.71f, 3.72f)
                lineTo(-0.01f, 21.89f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(11.06f, -11.06f)
                curveToRelative(0.29f, 0.85f, 0.36f, 1.92f, 0.33f, 2.47f)
                lineToRelative(-0.09f, 1.58f)
                horizontalLineToRelative(1.58f)
                curveToRelative(5.21f, 0f, 9f, -3.79f, 9f, -9f)
                lineToRelative(-0.0f, -1.59f)
                close()
                moveTo(16.43f, 13.86f)
                curveToRelative(-0.15f, -1.24f, -0.56f, -2.88f, -1.66f, -3.98f)
                lineToRelative(-2.97f, -2.98f)
                lineToRelative(2.11f, -2.11f)
                lineToRelative(2.97f, 2.98f)
                curveToRelative(1.11f, 1.11f, 2.75f, 1.52f, 3.99f, 1.67f)
                curveToRelative(-0.47f, 2.33f, -2.1f, 3.96f, -4.43f, 4.42f)
                close()
            }
        }.also { _Axe = it}
