package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropperHalf: ImageVector? = null

val Icons.Sr.EyeDropperHalf: ImageVector
    get() = _EyeDropperHalf ?: UXIcon(name = "EyeDropperHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.37f, 9.92f)
                lineToRelative(4.08f, 4.08f)
                lineTo(5.29f, 14f)
                lineToRelative(4.08f, -4.08f)
                close()
                moveTo(3.29f, 16f)
                lineToRelative(-1.32f, 1.32f)
                curveToRelative(-1.04f, 1.04f, -1.23f, 2.61f, -0.59f, 3.85f)
                lineToRelative(-1.09f, 1.09f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(0.29f, 23.68f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.09f, -1.09f)
                curveToRelative(0.47f, 0.24f, 0.99f, 0.38f, 1.51f, 0.38f)
                curveToRelative(0.85f, 0f, 1.7f, -0.32f, 2.34f, -0.97f)
                lineToRelative(6.0f, -6.0f)
                lineTo(3.29f, 16f)
                close()
                moveTo(23.15f, 4.89f)
                curveToRelative(0.55f, -0.54f, 0.85f, -1.27f, 0.85f, -2.04f)
                curveToRelative(0f, -0.77f, -0.3f, -1.49f, -0.84f, -2.04f)
                curveToRelative(-1.09f, -1.09f, -2.98f, -1.09f, -4.07f, 0f)
                lineToRelative(-2.48f, 2.48f)
                curveToRelative(-0.92f, 0.92f, -2.84f, 0.71f, -4.17f, -0.02f)
                curveToRelative(-0.94f, -0.52f, -2.15f, -0.34f, -2.92f, 0.44f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(6.83f, 6.83f)
                curveToRelative(0.27f, 0.1f, 0.48f, 0.3f, 0.58f, 0.56f)
                curveToRelative(0.46f, 0.37f, 1.02f, 0.56f, 1.58f, 0.56f)
                curveToRelative(0.64f, 0f, 1.28f, -0.24f, 1.76f, -0.73f)
                curveToRelative(0.78f, -0.78f, 0.96f, -1.98f, 0.44f, -2.92f)
                curveToRelative(-0.73f, -1.33f, -0.94f, -3.25f, -0.02f, -4.17f)
                lineToRelative(2.48f, -2.48f)
                close()
            }
        }.also { _EyeDropperHalf = it}
