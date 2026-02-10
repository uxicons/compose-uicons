package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUp: ImageVector? = null

val Icons.Sc.CommentArrowUp: ImageVector
    get() = _CommentArrowUp ?: UXIcon(name = "CommentArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                curveToRelative(3.76f, 0f, 7.03f, -0.64f, 9.1f, -1.18f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.79f, -3.02f, 1.18f, -6.08f, 1.18f, -9.1f)
                curveToRelative(-0.0f, -9.75f, -5.88f, -11f, -11.0f, -11f)
                close()
                moveTo(16.27f, 12.41f)
                curveToRelative(-0.15f, 0.08f, -0.31f, 0.11f, -0.46f, 0.11f)
                curveToRelative(-0.36f, 0f, -0.71f, -0.2f, -0.89f, -0.54f)
                curveToRelative(-0.6f, -1.16f, -1.32f, -1.89f, -1.93f, -2.34f)
                verticalLineToRelative(6.36f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.36f)
                curveToRelative(-0.6f, 0.45f, -1.32f, 1.18f, -1.93f, 2.34f)
                curveToRelative(-0.26f, 0.49f, -0.86f, 0.68f, -1.35f, 0.43f)
                curveToRelative(-0.49f, -0.26f, -0.68f, -0.86f, -0.42f, -1.35f)
                curveToRelative(1.73f, -3.32f, 4.35f, -4.0f, 4.46f, -4.03f)
                curveToRelative(0.16f, -0.04f, 0.32f, -0.04f, 0.48f, 0f)
                curveToRelative(0.11f, 0.03f, 2.73f, 0.71f, 4.46f, 4.03f)
                curveToRelative(0.26f, 0.49f, 0.06f, 1.09f, -0.42f, 1.35f)
                close()
            }
        }.also { _CommentArrowUp = it}
