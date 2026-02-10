package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookBookmark: ImageVector? = null

val Icons.Sc.BookBookmark: ImageVector
    get() = _BookBookmark ?: UXIcon(name = "BookBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.31f, 16.08f)
                horizontalLineToRelative(0.52f)
                verticalLineTo(1.57f)
                curveToRelative(-0.14f, 0.03f, -0.27f, 0.06f, -0.4f, 0.09f)
                curveToRelative(-1.65f, 0.38f, -2.9f, 1.76f, -3.17f, 3.52f)
                curveToRelative(-0.26f, 1.62f, -0.56f, 4.17f, -0.56f, 7.12f)
                curveToRelative(0f, 1.93f, 0.13f, 3.69f, 0.29f, 5.1f)
                curveToRelative(0.89f, -0.82f, 2.06f, -1.31f, 3.33f, -1.31f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.31f, 18.08f)
                curveToRelative(-1.26f, 0f, -2.36f, 0.84f, -2.83f, 2.04f)
                curveToRelative(0.57f, 1.41f, 1.85f, 2.43f, 3.36f, 2.59f)
                curveToRelative(1.78f, 0.19f, 3.51f, 0.29f, 5.15f, 0.29f)
                curveToRelative(3.99f, 0f, 7.38f, -0.59f, 7.52f, -0.61f)
                curveToRelative(0.39f, -0.07f, 0.7f, -0.36f, 0.8f, -0.75f)
                curveToRelative(0.02f, -0.1f, 0.35f, -1.44f, 0.61f, -3.56f)
                horizontalLineTo(6.31f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.32f, 2.95f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.72f)
                curveToRelative(-0.04f, -0.01f, -0.3f, -0.1f, -0.74f, -0.23f)
                curveToRelative(0.03f, 0.61f, 0.04f, 1.51f, 0.04f, 1.89f)
                curveToRelative(0f, 3.03f, -0.43f, 4.51f, -1.32f, 4.51f)
                curveToRelative(-0.49f, 0f, -1.02f, -0.48f, -1.3f, -0.78f)
                curveToRelative(-0.28f, 0.3f, -0.81f, 0.78f, -1.3f, 0.78f)
                curveToRelative(-0.89f, 0f, -1.32f, -1.48f, -1.32f, -4.51f)
                curveToRelative(0f, -0.47f, 0.07f, -2.23f, 0.12f, -2.82f)
                curveToRelative(-0.59f, -0.05f, -1.21f, -0.08f, -1.84f, -0.08f)
                curveToRelative(-1.12f, 0f, -2.2f, 0.09f, -3.17f, 0.22f)
                verticalLineToRelative(14.85f)
                horizontalLineToRelative(12.31f)
                curveToRelative(0.1f, -1.14f, 0.16f, -2.42f, 0.16f, -3.78f)
                curveToRelative(0f, -5.09f, -0.88f, -8.92f, -0.98f, -9.34f)
                close()
            }
        }.also { _BookBookmark = it}
