package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddle: ImageVector? = null

val Icons.Sc.CommentAltMiddle: ImageVector
    get() = _CommentAltMiddle ?: UXIcon(name = "CommentAltMiddle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.8f, 2.72f)
                curveToRelative(-0.11f, -0.32f, -0.37f, -0.56f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.26f, -1.07f, -9.1f, -1.07f)
                curveToRelative(-4.75f, 0f, -8.92f, 1.02f, -9.09f, 1.07f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.33f, -0.71f, 0.66f)
                curveToRelative(-0.05f, 0.15f, -1.2f, 3.67f, -1.2f, 8.3f)
                reflectiveCurveToRelative(1.15f, 8.15f, 1.2f, 8.3f)
                curveToRelative(0.11f, 0.33f, 0.38f, 0.57f, 0.71f, 0.66f)
                curveToRelative(0.11f, 0.03f, 2.65f, 0.64f, 5.95f, 0.93f)
                curveToRelative(1.32f, 1.21f, 2.58f, 1.93f, 2.64f, 1.97f)
                curveToRelative(0.41f, 0.24f, 0.83f, 0.09f, 0.98f, 0.01f)
                curveToRelative(0.06f, -0.03f, 1.27f, -0.7f, 2.65f, -1.97f)
                curveToRelative(3.37f, -0.28f, 5.86f, -0.91f, 5.96f, -0.93f)
                curveToRelative(0.33f, -0.08f, 0.59f, -0.33f, 0.7f, -0.65f)
                curveToRelative(0.05f, -0.15f, 1.2f, -3.64f, 1.2f, -8.3f)
                curveToRelative(0f, -4.7f, -1.15f, -8.16f, -1.2f, -8.3f)
                close()
            }
        }.also { _CommentAltMiddle = it}
