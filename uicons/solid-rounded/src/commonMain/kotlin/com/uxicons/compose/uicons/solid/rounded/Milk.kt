package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Milk: ImageVector? = null

val Icons.Sr.Milk: ImageVector
    get() = _Milk ?: UXIcon(name = "Milk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4f)
                lineTo(4f, 4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(-8f)
                lineTo(1f, 12f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(9.54f)
                curveToRelative(-0.95f, -1.06f, -1.54f, -2.46f, -1.54f, -4f)
                close()
                moveTo(19f, 6f)
                lineToRelative(-2.87f, 3.5f)
                curveToRelative(-0.73f, 0.89f, -1.13f, 2.01f, -1.13f, 3.17f)
                verticalLineToRelative(7.16f)
                curveToRelative(0f, 2.09f, 1.53f, 3.96f, 3.61f, 4.15f)
                curveToRelative(2.39f, 0.23f, 4.39f, -1.64f, 4.39f, -3.98f)
                verticalLineToRelative(-7.59f)
                curveToRelative(0f, -1.22f, -0.45f, -2.4f, -1.26f, -3.32f)
                lineToRelative(-2.74f, -3.09f)
                close()
                moveTo(3.71f, 6f)
                lineToRelative(-1.95f, 3.01f)
                curveToRelative(-0.18f, 0.32f, -0.32f, 0.65f, -0.44f, 0.99f)
                horizontalLineToRelative(12.23f)
                curveToRelative(0.26f, -0.63f, 0.6f, -1.24f, 1.03f, -1.77f)
                lineToRelative(1.83f, -2.23f)
                lineTo(3.71f, 6f)
                close()
            }
        }.also { _Milk = it}
