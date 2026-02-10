package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Rc.CommentCheck: ImageVector
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
                moveTo(20.03f, 20.02f)
                curveToRelative(-2.67f, 0.65f, -5.36f, 0.97f, -8.03f, 0.97f)
                curveToRelative(-1.67f, 0f, -3.37f, -0.29f, -5.05f, -0.85f)
                curveToRelative(-1.45f, -0.49f, -2.61f, -1.65f, -3.1f, -3.1f)
                curveToRelative(-1.12f, -3.35f, -1.12f, -6.75f, 0f, -10.1f)
                curveToRelative(0.49f, -1.45f, 1.65f, -2.61f, 3.1f, -3.1f)
                curveToRelative(1.68f, -0.56f, 3.36f, -0.84f, 5.05f, -0.84f)
                reflectiveCurveToRelative(3.38f, 0.28f, 5.05f, 0.84f)
                curveToRelative(1.45f, 0.49f, 2.61f, 1.65f, 3.1f, 3.1f)
                curveToRelative(0.56f, 1.68f, 0.85f, 3.38f, 0.85f, 5.05f)
                curveToRelative(0f, 2.66f, -0.33f, 5.36f, -0.97f, 8.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.43f, 8.67f)
                curveToRelative(-0.49f, -0.26f, -1.09f, -0.06f, -1.35f, 0.43f)
                curveToRelative(-1.37f, 2.65f, -3.05f, 3.82f, -3.77f, 4.23f)
                curveToRelative(-0.51f, -0.28f, -1.48f, -0.94f, -2.49f, -2.21f)
                curveToRelative(-0.34f, -0.43f, -0.97f, -0.51f, -1.41f, -0.17f)
                curveToRelative(-0.43f, 0.34f, -0.51f, 0.97f, -0.17f, 1.41f)
                curveToRelative(1.75f, 2.21f, 3.5f, 2.94f, 3.69f, 3.02f)
                curveToRelative(0.12f, 0.05f, 0.24f, 0.07f, 0.37f, 0.07f)
                curveToRelative(0.12f, 0f, 0.24f, -0.02f, 0.35f, -0.06f)
                curveToRelative(0.12f, -0.05f, 3.04f, -1.18f, 5.2f, -5.36f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
            }
        }.also { _CommentCheck = it}
