package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Sc.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.13f, 11.84f)
                curveToRelative(2.84f, 1.1f, 5.81f, 1.76f, 8.84f, 1.97f)
                verticalLineTo(1.01f)
                curveToRelative(-0.32f, 0.13f, -0.61f, 0.32f, -0.85f, 0.57f)
                curveTo(7.88f, 3.87f, 3.98f, 8.13f, 2.13f, 11.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.87f, 1.58f)
                curveToRelative(-0.25f, -0.25f, -0.54f, -0.44f, -0.85f, -0.57f)
                verticalLineTo(13.8f)
                curveToRelative(3.03f, -0.21f, 6.0f, -0.87f, 8.84f, -1.97f)
                curveToRelative(-1.85f, -3.71f, -5.75f, -7.97f, -7.99f, -10.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.64f, 22.84f)
                curveToRelative(0.11f, 0.07f, 0.22f, 0.13f, 0.34f, 0.18f)
                verticalLineToRelative(-7.16f)
                curveToRelative(-2.96f, -0.19f, -5.86f, -0.78f, -8.66f, -1.77f)
                curveToRelative(1.27f, 1.7f, 5.24f, 6.82f, 8.32f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.02f, 23.01f)
                curveToRelative(0.12f, -0.05f, 0.23f, -0.11f, 0.34f, -0.18f)
                curveToRelative(3.08f, -1.93f, 7.05f, -7.06f, 8.32f, -8.75f)
                curveToRelative(-2.8f, 0.98f, -5.7f, 1.58f, -8.66f, 1.77f)
                verticalLineToRelative(7.16f)
                close()
            }
        }.also { _DiceD8 = it}
