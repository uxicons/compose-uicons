package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Sc.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.05f, 6.31f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.69f, -2.04f, -2.32f, -3.67f, -4.36f, -4.36f)
                curveToRelative(-3.77f, -1.27f, -7.6f, -1.27f, -11.37f, 0f)
                curveToRelative(-2.04f, 0.69f, -3.67f, 2.32f, -4.36f, 4.36f)
                curveToRelative(-1.27f, 3.77f, -1.27f, 7.6f, 0f, 11.37f)
                curveToRelative(0.69f, 2.04f, 2.32f, 3.67f, 4.36f, 4.36f)
                curveToRelative(1.88f, 0.63f, 3.8f, 0.95f, 5.69f, 0.95f)
                curveToRelative(3.02f, 0f, 6.08f, -0.4f, 9.1f, -1.18f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.79f, -3.02f, 1.18f, -6.08f, 1.18f, -9.1f)
                curveToRelative(0f, -1.89f, -0.32f, -3.8f, -0.95f, -5.69f)
                close()
                moveTo(16.85f, 10.02f)
                curveToRelative(-2.16f, 4.18f, -5.08f, 5.31f, -5.2f, 5.36f)
                curveToRelative(-0.11f, 0.04f, -0.23f, 0.06f, -0.35f, 0.06f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.02f, -0.37f, -0.07f)
                curveToRelative(-0.19f, -0.08f, -1.94f, -0.81f, -3.69f, -3.02f)
                curveToRelative(-0.34f, -0.43f, -0.27f, -1.06f, 0.17f, -1.41f)
                curveToRelative(0.43f, -0.34f, 1.06f, -0.27f, 1.41f, 0.17f)
                curveToRelative(1.0f, 1.27f, 1.98f, 1.93f, 2.49f, 2.21f)
                curveToRelative(0.72f, -0.41f, 2.4f, -1.58f, 3.77f, -4.23f)
                curveToRelative(0.25f, -0.49f, 0.85f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                close()
            }
        }.also { _CommentCheck = it}
