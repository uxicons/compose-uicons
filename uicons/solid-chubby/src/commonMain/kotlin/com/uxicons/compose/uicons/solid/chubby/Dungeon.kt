package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dungeon: ImageVector? = null

val Icons.Sc.Dungeon: ImageVector
    get() = _Dungeon ?: UXIcon(name = "Dungeon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 14.22f)
                curveToRelative(0f, 0.8f, 0.03f, 2.01f, 0.1f, 3.28f)
                horizontalLineToRelative(6.35f)
                verticalLineToRelative(-3.28f)
                curveToRelative(0f, -0.27f, 0.0f, -0.52f, 0.01f, -0.77f)
                horizontalLineToRelative(-6.45f)
                curveToRelative(-0.01f, 0.25f, -0.01f, 0.51f, -0.01f, 0.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.12f, 11.45f)
                horizontalLineToRelative(6.53f)
                curveToRelative(0.12f, -0.7f, 0.28f, -1.28f, 0.48f, -1.76f)
                lineToRelative(-4.88f, -5.0f)
                curveToRelative(-1.17f, 1.66f, -1.87f, 3.9f, -2.13f, 6.76f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 1f)
                curveToRelative(-2.71f, 0.14f, -4.82f, 0.87f, -6.4f, 2.21f)
                lineToRelative(4.75f, 4.87f)
                curveToRelative(0.5f, -0.35f, 1.07f, -0.52f, 1.65f, -0.59f)
                curveToRelative(0f, -0.02f, -0.0f, -0.04f, -0.0f, -0.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 1f)
                verticalLineToRelative(6.43f)
                curveToRelative(0f, 0.02f, 0f, 0.04f, -0.0f, 0.05f)
                curveToRelative(0.58f, 0.07f, 1.14f, 0.24f, 1.64f, 0.59f)
                lineToRelative(4.74f, -4.89f)
                curveToRelative(-1.58f, -1.33f, -3.69f, -2.05f, -6.38f, -2.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.62f, 22.25f)
                curveToRelative(0.11f, 0.44f, 0.51f, 0.76f, 0.97f, 0.76f)
                horizontalLineToRelative(3.86f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(0.1f, 1.11f, 0.22f, 2.11f, 0.38f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.56f, 22.0f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1f, 1.0f)
                horizontalLineToRelative(3.85f)
                curveToRelative(0.46f, 0f, 0.86f, -0.31f, 0.97f, -0.75f)
                curveToRelative(0.16f, -0.64f, 0.29f, -1.64f, 0.39f, -2.75f)
                horizontalLineToRelative(-6.21f)
                verticalLineToRelative(2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.73f, 4.67f)
                lineToRelative(-4.87f, 5.02f)
                curveToRelative(0.21f, 0.49f, 0.38f, 1.08f, 0.5f, 1.81f)
                horizontalLineToRelative(6.52f)
                curveToRelative(-0.26f, -2.9f, -0.96f, -5.15f, -2.15f, -6.82f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 13.49f)
                horizontalLineToRelative(-6.45f)
                curveToRelative(0.01f, 0.23f, 0.01f, 0.47f, 0.01f, 0.72f)
                verticalLineToRelative(3.28f)
                horizontalLineToRelative(6.35f)
                curveToRelative(0.07f, -1.27f, 0.1f, -2.48f, 0.1f, -3.28f)
                curveToRelative(0f, -0.24f, -0.0f, -0.48f, -0.01f, -0.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 13.99f)
                verticalLineToRelative(8.01f)
                curveToRelative(0f, 0.49f, 0.34f, 1.0f, 0.84f, 1.0f)
                horizontalLineToRelative(0.66f)
                verticalLineToRelative(-13.48f)
                curveToRelative(-0.88f, 0.24f, -1.5f, 0.95f, -1.5f, 4.47f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 9.52f)
                verticalLineToRelative(13.48f)
                horizontalLineToRelative(0.66f)
                curveToRelative(0.49f, 0f, 0.84f, -0.51f, 0.84f, -1.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0f, -3.52f, -0.62f, -4.23f, -1.5f, -4.47f)
                close()
            }
        }.also { _Dungeon = it}
