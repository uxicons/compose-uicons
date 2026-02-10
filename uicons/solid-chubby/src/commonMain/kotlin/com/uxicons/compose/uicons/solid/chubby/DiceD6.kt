package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Sc.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.8f, 17.05f)
                curveToRelative(0f, 0.23f, 0.08f, 0.46f, 0.23f, 0.64f)
                curveToRelative(1.87f, 2.31f, 7.03f, 4.42f, 8.96f, 5.16f)
                verticalLineTo(13.26f)
                curveToRelative(-4.03f, -1.74f, -6.41f, -3.09f, -9.19f, -5.27f)
                verticalLineToRelative(9.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.37f, 0.95f)
                curveToRelative(-0.27f, -0.13f, -0.58f, -0.14f, -0.85f, -0.01f)
                curveTo(7.56f, 2.69f, 5.4f, 3.89f, 2.51f, 5.96f)
                curveToRelative(2.92f, 2.36f, 5.26f, 3.71f, 9.5f, 5.53f)
                curveToRelative(4.44f, -1.82f, 6.8f, -3.06f, 9.51f, -5.05f)
                curveToRelative(-3.27f, -2.42f, -5.37f, -3.67f, -9.14f, -5.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.01f, 13.27f)
                verticalLineToRelative(9.57f)
                curveToRelative(1.93f, -0.73f, 7.09f, -2.85f, 8.96f, -5.16f)
                curveToRelative(0.15f, -0.18f, 0.23f, -0.41f, 0.23f, -0.64f)
                verticalLineTo(8.46f)
                curveToRelative(-2.6f, 1.85f, -4.99f, 3.09f, -9.19f, 4.82f)
                close()
            }
        }.also { _DiceD6 = it}
