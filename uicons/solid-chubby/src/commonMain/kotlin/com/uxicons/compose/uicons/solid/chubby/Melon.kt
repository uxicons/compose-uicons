package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Sc.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 12.07f)
                curveToRelative(2.32f, -2.34f, 2.59f, -5.41f, 2.01f, -7.77f)
                curveToRelative(-1.49f, 1.21f, -3.25f, 2.76f, -5.08f, 4.61f)
                curveToRelative(-1.86f, 1.87f, -3.41f, 3.67f, -4.62f, 5.19f)
                curveToRelative(1.64f, 0.4f, 4.95f, 0.73f, 7.69f, -2.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.51f, 1.3f)
                curveToRelative(-0.33f, -0.34f, -0.85f, -0.39f, -1.25f, -0.14f)
                curveToRelative(-0.08f, 0.05f, -1.06f, 0.68f, -2.56f, 1.81f)
                curveToRelative(1.0f, 3f, 0.91f, 7.28f, -2.29f, 10.51f)
                curveToRelative(-2.09f, 2.11f, -4.64f, 2.88f, -6.98f, 2.88f)
                curveToRelative(-1.24f, 0f, -2.41f, -0.21f, -3.43f, -0.56f)
                curveToRelative(-1.1f, 1.49f, -1.71f, 2.45f, -1.76f, 2.54f)
                curveToRelative(-0.24f, 0.39f, -0.19f, 0.9f, 0.14f, 1.23f)
                curveToRelative(2.1f, 2.12f, 5.53f, 3.44f, 8.96f, 3.44f)
                curveToRelative(2.4f, 0f, 5.89f, -0.64f, 8.92f, -3.7f)
                curveToRelative(5.83f, -5.88f, 3.85f, -14.38f, 0.26f, -18.0f)
                close()
            }
        }.also { _Melon = it}
