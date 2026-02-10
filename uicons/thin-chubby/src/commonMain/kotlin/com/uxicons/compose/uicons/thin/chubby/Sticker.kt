package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Tc.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1.1f)
                horizontalLineToRelative(-0.01f)
                curveTo(4.93f, 1.14f, 1.13f, 4.95f, 1f, 12.14f)
                curveToRelative(0.11f, 6.18f, 2.81f, 9.8f, 8.03f, 10.76f)
                curveToRelative(0.03f, 0.01f, 0.16f, 0.02f, 0.28f, -0.03f)
                curveToRelative(0.15f, -0.07f, 3.85f, -1.48f, 7.45f, -4.32f)
                curveToRelative(3.66f, -2.89f, 6.05f, -6.32f, 6.15f, -6.46f)
                curveToRelative(0.07f, -0.09f, 0.1f, -0.2f, 0.1f, -0.31f)
                curveTo(22.7f, 3.01f, 16.86f, 1.13f, 12.01f, 1.1f)
                close()
                moveTo(2f, 12.13f)
                curveToRelative(0.12f, -6.62f, 3.48f, -10.0f, 10.01f, -10.04f)
                curveToRelative(4.29f, 0.03f, 9.43f, 1.65f, 9.96f, 9.06f)
                curveToRelative(-0.73f, -0.1f, -1.52f, -0.16f, -2.35f, -0.16f)
                curveToRelative(-7.08f, 0.04f, -10.78f, 3.67f, -10.99f, 10.79f)
                curveToRelative(-4.36f, -1.02f, -6.53f, -4.2f, -6.63f, -9.65f)
                close()
                moveTo(16.1f, 17.65f)
                curveToRelative(-2.57f, 2.03f, -5.24f, 3.4f, -6.47f, 3.98f)
                curveToRelative(0.25f, -6.44f, 3.52f, -9.59f, 9.99f, -9.62f)
                curveToRelative(0.7f, 0.0f, 1.36f, 0.04f, 1.99f, 0.12f)
                curveToRelative(-0.88f, 1.1f, -2.89f, 3.45f, -5.51f, 5.53f)
                close()
            }
        }.also { _Sticker = it}
