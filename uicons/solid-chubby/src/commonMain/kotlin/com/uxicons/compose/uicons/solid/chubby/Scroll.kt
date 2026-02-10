package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scroll: ImageVector? = null

val Icons.Sc.Scroll: ImageVector
    get() = _Scroll ?: UXIcon(name = "Scroll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 17f)
                curveToRelative(-0.17f, -0.34f, -0.62f, -0.5f, -1f, -0.5f)
                horizontalLineToRelative(-12.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.01f, -0.01f, 1.5f, -1f, 1.5f)
                curveToRelative(-0.51f, 0f, -0.93f, 0.38f, -0.99f, 0.88f)
                curveToRelative(-0.06f, 0.5f, 0.26f, 0.97f, 0.75f, 1.09f)
                curveToRelative(2.12f, 0.53f, 5.09f, 0.53f, 8.24f, 0.53f)
                curveToRelative(4.86f, 0f, 6.16f, -0.46f, 6.45f, -0.6f)
                curveToRelative(0.16f, -0.08f, 1.55f, -0.85f, 1.55f, -3.4f)
                curveToRelative(0f, -1.69f, -0.44f, -1.88f, -0.5f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 1.88f)
                curveToRelative(-0.25f, 0.09f, -0.42f, 0.19f, -0.56f, 0.28f)
                curveToRelative(-0.58f, 0.34f, -1.44f, 1.26f, -1.45f, 2.83f)
                curveToRelative(-0.01f, 2.18f, 0.56f, 2.97f, 0.8f, 3.21f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.7f, 0.29f)
                horizontalLineToRelative(0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.12f, 2.79f)
                curveToRelative(-0.09f, -0.28f, -0.3f, -0.51f, -0.57f, -0.62f)
                curveToRelative(-0.12f, -0.05f, -2.9f, -1.16f, -7.55f, -1.16f)
                curveToRelative(-3.56f, 0f, -6.31f, 0.38f, -7f, 0.49f)
                verticalLineToRelative(17.78f)
                curveToRelative(0.29f, -0.26f, 0.63f, -0.46f, 1f, -0.59f)
                verticalLineToRelative(-1.17f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.93f)
                curveToRelative(0.05f, -0.86f, 0.07f, -1.69f, 0.07f, -2.5f)
                curveToRelative(0f, -6.4f, -0.84f, -9.1f, -0.87f, -9.21f)
                close()
            }
        }.also { _Scroll = it}
