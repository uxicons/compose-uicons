package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorLayer: ImageVector? = null

val Icons.Rr.FloorLayer: ImageVector
    get() = _FloorLayer ?: UXIcon(name = "FloorLayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.01f, 5.83f)
                lineToRelative(-7.42f, -3.56f)
                curveToRelative(-1.65f, -0.79f, -3.54f, -0.79f, -5.19f, 0f)
                lineTo(1.99f, 5.83f)
                curveToRelative(-1.21f, 0.58f, -1.99f, 1.82f, -1.99f, 3.16f)
                verticalLineToRelative(1.16f)
                curveToRelative(0f, 1.34f, 0.78f, 2.58f, 1.99f, 3.16f)
                lineToRelative(7.41f, 3.55f)
                curveToRelative(0.82f, 0.4f, 1.71f, 0.59f, 2.59f, 0.59f)
                curveToRelative(0.89f, 0f, 1.78f, -0.2f, 2.61f, -0.6f)
                lineToRelative(7.42f, -3.58f)
                curveToRelative(1.2f, -0.58f, 1.98f, -1.82f, 1.98f, -3.15f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0f, -1.34f, -0.78f, -2.58f, -1.99f, -3.16f)
                close()
                moveTo(10.27f, 4.08f)
                curveToRelative(1.1f, -0.53f, 2.36f, -0.53f, 3.46f, 0f)
                lineToRelative(6.96f, 3.34f)
                lineToRelative(-8.56f, 4.11f)
                curveToRelative(-0.12f, 0.07f, -0.25f, 0f, -0.25f, 0f)
                lineTo(3.31f, 7.42f)
                lineToRelative(6.96f, -3.34f)
                close()
                moveTo(2.85f, 11.51f)
                curveToRelative(-0.52f, -0.25f, -0.85f, -0.78f, -0.85f, -1.35f)
                verticalLineToRelative(-1.15f)
                lineToRelative(9f, 4.32f)
                verticalLineToRelative(2.0f)
                curveToRelative(-0.25f, -0.07f, -0.5f, -0.14f, -0.74f, -0.26f)
                lineToRelative(-7.41f, -3.55f)
                close()
                moveTo(21.15f, 11.47f)
                lineToRelative(-7.42f, 3.58f)
                curveToRelative(-0.24f, 0.11f, -0.48f, 0.19f, -0.73f, 0.26f)
                verticalLineToRelative(-1.99f)
                lineToRelative(9f, -4.32f)
                verticalLineToRelative(1.11f)
                curveToRelative(0f, 0.57f, -0.33f, 1.1f, -0.85f, 1.35f)
                close()
                moveTo(23.9f, 15.8f)
                curveToRelative(0.24f, 0.5f, 0.03f, 1.09f, -0.47f, 1.33f)
                lineToRelative(-8.83f, 4.26f)
                curveToRelative(-0.83f, 0.4f, -1.72f, 0.6f, -2.61f, 0.6f)
                curveToRelative(-0.89f, 0f, -1.77f, -0.2f, -2.59f, -0.59f)
                lineTo(0.57f, 17.18f)
                curveToRelative(-0.5f, -0.24f, -0.71f, -0.84f, -0.47f, -1.33f)
                curveToRelative(0.24f, -0.5f, 0.83f, -0.71f, 1.33f, -0.47f)
                lineToRelative(8.83f, 4.23f)
                curveToRelative(1.1f, 0.53f, 2.37f, 0.53f, 3.47f, -0.0f)
                lineToRelative(8.83f, -4.26f)
                curveToRelative(0.5f, -0.24f, 1.09f, -0.03f, 1.33f, 0.47f)
                close()
            }
        }.also { _FloorLayer = it}
