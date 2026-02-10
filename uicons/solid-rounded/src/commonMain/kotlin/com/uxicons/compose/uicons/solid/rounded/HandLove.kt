package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLove: ImageVector? = null

val Icons.Sr.HandLove: ImageVector
    get() = _HandLove ?: UXIcon(name = "HandLove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 15f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15f, 13.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(22.25f, 1.02f)
                curveToRelative(-0.74f, 0.12f, -1.25f, 0.81f, -1.25f, 1.56f)
                lineTo(21f, 13.31f)
                curveToRelative(0f, 1.91f, -1.45f, 3.62f, -3.37f, 3.69f)
                curveToRelative(-0.8f, 0.03f, -1.53f, -0.21f, -2.13f, -0.63f)
                curveToRelative(-0.6f, 0.42f, -1.34f, 0.66f, -2.13f, 0.63f)
                curveToRelative(-1.91f, -0.07f, -3.37f, -1.77f, -3.37f, -3.69f)
                lineTo(10f, 1.58f)
                curveToRelative(0f, -0.75f, -0.51f, -1.44f, -1.25f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                verticalLineToRelative(15.52f)
                lineToRelative(-3.64f, -3.48f)
                curveToRelative(-0.81f, -0.75f, -2.07f, -0.71f, -2.82f, 0.1f)
                curveToRelative(-0.76f, 0.81f, -0.71f, 2.07f, 0.09f, 2.83f)
                lineToRelative(5.49f, 5.29f)
                curveToRelative(1.49f, 1.44f, 3.48f, 2.24f, 5.55f, 2.24f)
                horizontalLineToRelative(7.32f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -0.91f, -0.81f, -1.63f, -1.75f, -1.48f)
                close()
            }
        }.also { _HandLove = it}
