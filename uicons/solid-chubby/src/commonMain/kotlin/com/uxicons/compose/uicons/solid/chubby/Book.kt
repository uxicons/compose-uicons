package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Sc.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.83f, 16.08f)
                verticalLineTo(1.57f)
                curveToRelative(-0.14f, 0.03f, -0.27f, 0.06f, -0.4f, 0.09f)
                curveToRelative(-1.65f, 0.38f, -2.9f, 1.76f, -3.17f, 3.52f)
                curveToRelative(-0.26f, 1.62f, -0.56f, 4.17f, -0.56f, 7.12f)
                curveToRelative(0f, 1.93f, 0.13f, 3.69f, 0.29f, 5.1f)
                curveToRelative(0.89f, -0.82f, 2.06f, -1.31f, 3.33f, -1.31f)
                horizontalLineToRelative(0.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.32f, 2.95f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.72f)
                curveToRelative(-0.15f, -0.05f, -3.64f, -1.24f, -7.67f, -1.24f)
                curveToRelative(-1.12f, 0f, -2.2f, 0.09f, -3.17f, 0.22f)
                verticalLineToRelative(14.85f)
                horizontalLineToRelative(12.31f)
                curveToRelative(0.1f, -1.14f, 0.16f, -2.42f, 0.16f, -3.78f)
                curveToRelative(0f, -5.09f, -0.88f, -8.92f, -0.98f, -9.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.48f, 20.11f)
                curveToRelative(0.57f, 1.41f, 1.85f, 2.43f, 3.36f, 2.59f)
                curveToRelative(1.78f, 0.19f, 3.51f, 0.29f, 5.15f, 0.29f)
                curveToRelative(3.99f, 0f, 7.38f, -0.59f, 7.52f, -0.61f)
                curveToRelative(0.39f, -0.07f, 0.7f, -0.36f, 0.8f, -0.75f)
                curveToRelative(0.02f, -0.1f, 0.35f, -1.44f, 0.61f, -3.56f)
                horizontalLineTo(6.31f)
                curveToRelative(-1.26f, 0f, -2.36f, 0.84f, -2.83f, 2.04f)
                close()
            }
        }.also { _Book = it}
