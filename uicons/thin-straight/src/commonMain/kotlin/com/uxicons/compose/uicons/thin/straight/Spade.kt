package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Ts.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 20f)
                curveToRelative(3.08f, 0f, 5.5f, -2.8f, 5.5f, -6.38f)
                curveToRelative(0f, -5.16f, -7.17f, -11.29f, -9.37f, -13.05f)
                curveToRelative(-0.96f, -0.77f, -2.3f, -0.77f, -3.26f, 0f)
                curveTo(8.17f, 2.33f, 1f, 8.47f, 1f, 13.62f)
                curveToRelative(0f, 3.58f, 2.42f, 6.38f, 5.5f, 6.38f)
                curveToRelative(2.23f, 0f, 3.94f, -1.47f, 4.93f, -2.63f)
                curveToRelative(-0.32f, 3.73f, -1.8f, 5.63f, -4.43f, 5.63f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.63f, 0f, -4.12f, -1.89f, -4.43f, -5.63f)
                curveToRelative(1f, 1.16f, 2.7f, 2.63f, 4.93f, 2.63f)
                close()
                moveTo(6.5f, 19f)
                curveToRelative(-2.52f, 0f, -4.5f, -2.36f, -4.5f, -5.38f)
                curveTo(2f, 9.88f, 6.65f, 4.83f, 10.99f, 1.35f)
                curveToRelative(0.59f, -0.47f, 1.42f, -0.47f, 2.01f, 0f)
                curveToRelative(4.35f, 3.48f, 8.99f, 8.53f, 8.99f, 12.27f)
                curveToRelative(0f, 3.01f, -1.98f, 5.38f, -4.5f, 5.38f)
                curveToRelative(-3.01f, 0f, -5.05f, -3.45f, -5.07f, -3.48f)
                lineToRelative(-0.43f, -0.74f)
                lineToRelative(-0.43f, 0.74f)
                curveToRelative(-0.02f, 0.04f, -2.06f, 3.48f, -5.07f, 3.48f)
                close()
                moveTo(13.91f, 23f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(0.79f, -0.63f, 1.48f, -1.6f, 1.91f, -3.1f)
                curveToRelative(0.43f, 1.5f, 1.12f, 2.47f, 1.91f, 3.1f)
                close()
            }
        }.also { _Spade = it}
