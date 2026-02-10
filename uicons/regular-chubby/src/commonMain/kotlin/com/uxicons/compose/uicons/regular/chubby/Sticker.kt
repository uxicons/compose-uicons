package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Rc.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1.12f)
                curveTo(5.1f, 1.12f, 1.13f, 4.96f, 1.0f, 12.14f)
                curveToRelative(0.11f, 6.15f, 2.83f, 9.76f, 8.07f, 10.72f)
                curveToRelative(0.06f, 0.01f, 0.36f, 0.04f, 0.56f, -0.06f)
                curveToRelative(0.15f, -0.07f, 3.69f, -1.54f, 7.18f, -4.28f)
                curveToRelative(3.54f, -2.79f, 5.89f, -6.0f, 5.99f, -6.13f)
                curveToRelative(0.13f, -0.18f, 0.2f, -0.4f, 0.19f, -0.62f)
                curveToRelative(-0.24f, -6.82f, -4.17f, -10.65f, -10.98f, -10.65f)
                close()
                moveTo(3.0f, 12.14f)
                curveToRelative(0.11f, -6.03f, 3.05f, -8.98f, 9f, -9.02f)
                curveToRelative(5.34f, 0.04f, 8.33f, 2.56f, 8.9f, 7.49f)
                curveToRelative(-0.53f, -0.05f, -1.08f, -0.08f, -1.65f, -0.08f)
                curveToRelative(-6.85f, 0.04f, -10.53f, 3.42f, -10.96f, 10.09f)
                curveToRelative(-3.47f, -1.06f, -5.21f, -3.86f, -5.29f, -8.48f)
                close()
                moveTo(15.58f, 16.95f)
                curveToRelative(-1.95f, 1.53f, -3.95f, 2.66f, -5.25f, 3.32f)
                curveToRelative(0.47f, -5.24f, 3.34f, -7.71f, 8.93f, -7.75f)
                curveToRelative(0.29f, 0.0f, 0.58f, 0.01f, 0.86f, 0.03f)
                curveToRelative(-0.98f, 1.15f, -2.57f, 2.85f, -4.53f, 4.4f)
                close()
            }
        }.also { _Sticker = it}
