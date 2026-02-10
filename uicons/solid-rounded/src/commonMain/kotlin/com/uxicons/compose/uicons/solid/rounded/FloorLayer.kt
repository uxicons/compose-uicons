package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorLayer: ImageVector? = null

val Icons.Sr.FloorLayer: ImageVector
    get() = _FloorLayer ?: UXIcon(name = "FloorLayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.01f, 5.16f)
                lineToRelative(-7.42f, -3.56f)
                curveToRelative(-1.65f, -0.79f, -3.54f, -0.79f, -5.19f, 0f)
                lineTo(1.99f, 5.16f)
                curveToRelative(-1.21f, 0.58f, -1.99f, 1.82f, -1.99f, 3.16f)
                verticalLineToRelative(1.16f)
                curveToRelative(0f, 1.34f, 0.78f, 2.58f, 1.99f, 3.16f)
                lineToRelative(7.41f, 3.55f)
                curveToRelative(0.52f, 0.25f, 1.05f, 0.41f, 1.6f, 0.5f)
                verticalLineToRelative(-4.04f)
                lineToRelative(-8.0f, -3.84f)
                curveToRelative(-0.5f, -0.24f, -0.71f, -0.84f, -0.47f, -1.33f)
                curveToRelative(0.24f, -0.5f, 0.83f, -0.71f, 1.33f, -0.47f)
                lineToRelative(8.13f, 3.9f)
                lineToRelative(8.11f, -3.9f)
                curveToRelative(0.5f, -0.24f, 1.09f, -0.03f, 1.33f, 0.47f)
                curveToRelative(0.24f, 0.5f, 0.03f, 1.1f, -0.47f, 1.33f)
                lineToRelative(-7.97f, 3.84f)
                verticalLineToRelative(4.04f)
                curveToRelative(0.55f, -0.09f, 1.09f, -0.26f, 1.6f, -0.51f)
                lineToRelative(7.42f, -3.58f)
                curveToRelative(1.2f, -0.58f, 1.98f, -1.82f, 1.98f, -3.15f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0f, -1.34f, -0.78f, -2.58f, -1.99f, -3.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 23.17f)
                curveToRelative(-0.55f, -0.09f, -1.09f, -0.25f, -1.6f, -0.5f)
                lineToRelative(-8.26f, -3.96f)
                curveToRelative(-0.69f, -0.33f, -1.14f, -1.03f, -1.14f, -1.8f)
                verticalLineToRelative(-1.31f)
                curveToRelative(0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f)
                curveToRelative(0.29f, -0.18f, 0.66f, -0.2f, 0.97f, -0.06f)
                lineToRelative(8.83f, 4.23f)
                curveToRelative(0.24f, 0.11f, 0.49f, 0.19f, 0.74f, 0.26f)
                verticalLineToRelative(3.99f)
                close()
                moveTo(23.53f, 14.71f)
                curveToRelative(-0.29f, -0.18f, -0.66f, -0.2f, -0.97f, -0.05f)
                lineToRelative(-8.83f, 4.27f)
                curveToRelative(-0.24f, 0.11f, -0.48f, 0.19f, -0.73f, 0.26f)
                verticalLineToRelative(3.99f)
                curveToRelative(0.55f, -0.09f, 1.09f, -0.26f, 1.6f, -0.51f)
                lineToRelative(8.27f, -3.99f)
                curveToRelative(0.69f, -0.33f, 1.13f, -1.03f, 1.13f, -1.8f)
                verticalLineToRelative(-1.31f)
                curveToRelative(0f, -0.34f, -0.18f, -0.66f, -0.47f, -0.85f)
                close()
            }
        }.also { _FloorLayer = it}
