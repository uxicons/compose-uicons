package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Rc.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.32f, 2.95f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.72f)
                curveToRelative(-0.15f, -0.05f, -3.64f, -1.24f, -7.67f, -1.24f)
                curveToRelative(-2.21f, 0f, -4.25f, 0.36f, -5.57f, 0.66f)
                curveToRelative(-1.65f, 0.38f, -2.9f, 1.76f, -3.17f, 3.52f)
                curveToRelative(-0.26f, 1.62f, -0.56f, 4.17f, -0.56f, 7.12f)
                curveToRelative(0f, 2.83f, 0.28f, 5.27f, 0.51f, 6.82f)
                curveToRelative(0.29f, 1.92f, 1.78f, 3.39f, 3.64f, 3.6f)
                curveToRelative(1.78f, 0.19f, 3.51f, 0.29f, 5.15f, 0.29f)
                curveToRelative(3.99f, 0f, 7.38f, -0.59f, 7.52f, -0.61f)
                curveToRelative(0.39f, -0.07f, 0.7f, -0.36f, 0.8f, -0.75f)
                curveToRelative(0.04f, -0.17f, 0.98f, -4.1f, 0.98f, -9.35f)
                curveToRelative(0f, -5.09f, -0.88f, -8.92f, -0.98f, -9.34f)
                close()
                moveTo(18.5f, 3.96f)
                curveToRelative(0.26f, 1.24f, 0.81f, 4.37f, 0.81f, 8.33f)
                curveToRelative(0f, 1.19f, -0.05f, 2.31f, -0.13f, 3.33f)
                lineTo(8.83f, 15.62f)
                lineTo(8.83f, 3.24f)
                curveToRelative(0.95f, -0.14f, 2.04f, -0.24f, 3.17f, -0.24f)
                curveToRelative(2.87f, 0f, 5.43f, 0.65f, 6.5f, 0.96f)
                close()
                moveTo(5.23f, 5.49f)
                curveToRelative(0.15f, -0.93f, 0.77f, -1.66f, 1.6f, -1.86f)
                lineTo(6.83f, 15.83f)
                curveToRelative(-0.72f, 0.23f, -1.36f, 0.65f, -1.88f, 1.21f)
                curveToRelative(-0.14f, -1.33f, -0.26f, -2.95f, -0.26f, -4.75f)
                curveToRelative(0f, -2.82f, 0.29f, -5.26f, 0.54f, -6.81f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-1.55f, 0f, -3.25f, -0.1f, -4.94f, -0.28f)
                curveToRelative(-0.54f, -0.06f, -1.02f, -0.33f, -1.36f, -0.74f)
                curveToRelative(0.15f, -1.33f, 1.2f, -2.35f, 2.45f, -2.35f)
                horizontalLineToRelative(10.82f)
                curveToRelative(-0.16f, 1.29f, -0.34f, 2.29f, -0.46f, 2.9f)
                curveToRelative(-1.16f, 0.17f, -3.71f, 0.48f, -6.51f, 0.48f)
                close()
            }
        }.also { _Book = it}
