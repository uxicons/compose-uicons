package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Rc.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.51f, 1.3f)
                curveToRelative(-0.33f, -0.34f, -0.85f, -0.39f, -1.25f, -0.14f)
                curveToRelative(-0.18f, 0.12f, -4.51f, 2.88f, -9.34f, 7.75f)
                curveTo(4.1f, 13.78f, 1.35f, 18.15f, 1.24f, 18.33f)
                curveToRelative(-0.24f, 0.39f, -0.19f, 0.9f, 0.14f, 1.23f)
                curveToRelative(2.1f, 2.12f, 5.53f, 3.44f, 8.96f, 3.44f)
                curveToRelative(2.4f, 0f, 5.89f, -0.64f, 8.92f, -3.7f)
                curveToRelative(5.83f, -5.88f, 3.85f, -14.38f, 0.26f, -18.0f)
                close()
                moveTo(10.35f, 10.31f)
                curveToRelative(1.58f, -1.6f, 3.13f, -2.97f, 4.47f, -4.09f)
                curveToRelative(0.39f, 2.1f, 0.04f, 4.69f, -1.95f, 6.7f)
                curveToRelative(-2.29f, 2.31f, -5.02f, 2.27f, -6.63f, 1.97f)
                curveToRelative(1.12f, -1.37f, 2.5f, -2.96f, 4.11f, -4.58f)
                close()
                moveTo(17.83f, 17.89f)
                curveToRelative(-2.55f, 2.57f, -5.48f, 3.11f, -7.5f, 3.11f)
                curveToRelative(-2.56f, 0f, -5.18f, -0.89f, -6.94f, -2.31f)
                curveToRelative(0.33f, -0.48f, 0.83f, -1.2f, 1.49f, -2.07f)
                curveToRelative(0.87f, 0.26f, 1.84f, 0.41f, 2.86f, 0.41f)
                curveToRelative(2.19f, 0f, 4.59f, -0.72f, 6.54f, -2.7f)
                curveToRelative(2.87f, -2.9f, 3.07f, -6.71f, 2.26f, -9.49f)
                curveToRelative(0.88f, -0.68f, 1.6f, -1.19f, 2.09f, -1.53f)
                curveToRelative(2.69f, 3.38f, 3.65f, 10.08f, -0.8f, 14.58f)
                close()
            }
        }.also { _Melon = it}
