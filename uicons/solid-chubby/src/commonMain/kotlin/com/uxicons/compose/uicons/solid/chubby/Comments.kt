package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Sc.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.27f, 10.38f)
                curveToRelative(-0.45f, -1.35f, -1.44f, -2.47f, -2.7f, -3.1f)
                curveToRelative(0.33f, 2.32f, 0.1f, 4.65f, -0.67f, 6.96f)
                curveToRelative(-0.73f, 2.17f, -2.46f, 3.9f, -4.63f, 4.63f)
                curveToRelative(-1.62f, 0.54f, -3.27f, 0.82f, -4.9f, 0.82f)
                curveToRelative(-0.69f, 0f, -1.38f, -0.03f, -2.07f, -0.08f)
                curveToRelative(0.63f, 1.25f, 1.74f, 2.21f, 3.08f, 2.66f)
                curveToRelative(1.41f, 0.47f, 2.85f, 0.71f, 4.26f, 0.71f)
                curveToRelative(2.24f, 0f, 4.52f, -0.29f, 6.76f, -0.88f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.58f, -2.24f, 0.88f, -4.51f, 0.88f, -6.76f)
                curveToRelative(0f, -1.42f, -0.24f, -2.85f, -0.71f, -4.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.63f, 16.99f)
                curveToRelative(1.58f, -0.53f, 2.84f, -1.79f, 3.37f, -3.37f)
                curveToRelative(0.95f, -2.83f, 0.95f, -5.7f, 0f, -8.53f)
                curveToRelative(-0.53f, -1.58f, -1.79f, -2.84f, -3.37f, -3.37f)
                curveToRelative(-2.83f, -0.95f, -5.7f, -0.95f, -8.53f, 0f)
                curveToRelative(-1.58f, 0.53f, -2.84f, 1.79f, -3.37f, 3.37f)
                curveToRelative(-0.47f, 1.41f, -0.71f, 2.85f, -0.71f, 4.26f)
                curveToRelative(0f, 2.24f, 0.29f, 4.52f, 0.88f, 6.76f)
                curveToRelative(0.09f, 0.35f, 0.36f, 0.62f, 0.72f, 0.72f)
                curveToRelative(2.24f, 0.58f, 4.51f, 0.88f, 6.76f, 0.88f)
                curveToRelative(1.42f, 0f, 2.85f, -0.24f, 4.26f, -0.71f)
                close()
            }
        }.also { _Comments = it}
