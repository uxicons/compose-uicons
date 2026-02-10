package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropperHalf: ImageVector? = null

val Icons.Sc.EyeDropperHalf: ImageVector
    get() = _EyeDropperHalf ?: UXIcon(name = "EyeDropperHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.8f, 16f)
                horizontalLineToRelative(10.88f)
                curveToRelative(-2.72f, 2.66f, -4.68f, 4.31f, -5.88f, 5.24f)
                curveToRelative(-1.03f, 0.8f, -2.35f, 0.99f, -3.51f, 0.59f)
                lineToRelative(-0.73f, 0.73f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(-0.45f, -1.24f, -0.24f, -2.67f, 0.66f, -3.73f)
                close()
                moveTo(21.87f, 2.16f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.02f, -0.03f, -0.04f)
                curveToRelative(-1.45f, -1.4f, -3.76f, -1.5f, -5.39f, -0.23f)
                curveToRelative(-0.79f, 0.62f, -1.68f, 1.36f, -2.63f, 2.2f)
                curveToRelative(-2.29f, -0.38f, -4.3f, 1.02f, -4.4f, 1.09f)
                curveToRelative(-0.36f, 0.26f, -0.51f, 0.71f, -0.37f, 1.13f)
                curveToRelative(1.43f, 4.3f, 4.34f, 7.2f, 8.63f, 8.63f)
                curveToRelative(0.1f, 0.04f, 0.21f, 0.05f, 0.32f, 0.05f)
                curveToRelative(0.32f, 0f, 0.62f, -0.15f, 0.81f, -0.42f)
                curveToRelative(0.07f, -0.09f, 1.49f, -2.14f, 1.08f, -4.44f)
                curveToRelative(0.84f, -0.96f, 1.58f, -1.85f, 2.2f, -2.65f)
                curveToRelative(1.26f, -1.62f, 1.16f, -3.86f, -0.22f, -5.33f)
                close()
                moveTo(8.41f, 9.79f)
                curveToRelative(-1.66f, 1.68f, -2.96f, 3.08f, -3.94f, 4.21f)
                horizontalLineToRelative(7.39f)
                curveToRelative(-1.4f, -1.16f, -2.54f, -2.56f, -3.45f, -4.21f)
                close()
            }
        }.also { _EyeDropperHalf = it}
