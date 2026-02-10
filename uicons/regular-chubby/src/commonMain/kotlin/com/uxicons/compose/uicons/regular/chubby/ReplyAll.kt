package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReplyAll: ImageVector? = null

val Icons.Rc.ReplyAll: ImageVector
    get() = _ReplyAll ?: UXIcon(name = "ReplyAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.14f, 8.39f)
                curveToRelative(-0.1f, -0.33f, -0.35f, -0.58f, -0.68f, -0.67f)
                curveToRelative(-0.12f, -0.04f, -3.08f, -0.87f, -6.57f, -0.87f)
                curveToRelative(-1.92f, 0f, -3.78f, 0.18f, -5.06f, 0.35f)
                curveToRelative(0.88f, -0.89f, 2.23f, -2.02f, 4.04f, -2.84f)
                curveToRelative(0.5f, -0.23f, 0.73f, -0.82f, 0.5f, -1.32f)
                curveToRelative(-0.23f, -0.5f, -0.82f, -0.73f, -1.32f, -0.5f)
                curveToRelative(-4.0f, 1.81f, -6.03f, 4.89f, -6.11f, 5.02f)
                curveToRelative(-0.21f, 0.33f, -0.21f, 0.76f, 0f, 1.09f)
                curveToRelative(0.08f, 0.13f, 2.12f, 3.21f, 6.11f, 5.02f)
                curveToRelative(0.13f, 0.06f, 0.91f, 0.32f, 1.32f, -0.5f)
                curveToRelative(0.25f, -0.49f, 0.01f, -1.09f, -0.5f, -1.32f)
                curveToRelative(-1.68f, -0.76f, -2.97f, -1.8f, -3.85f, -2.66f)
                curveToRelative(1.23f, -0.16f, 3.03f, -0.34f, 4.87f, -0.34f)
                curveToRelative(2.36f, 0f, 4.5f, 0.43f, 5.47f, 0.66f)
                curveToRelative(0.22f, 0.94f, 0.64f, 3.02f, 0.64f, 5.57f)
                curveToRelative(0f, 3.44f, -0.77f, 6.08f, -0.78f, 6.11f)
                curveToRelative(-0.16f, 0.53f, 0.16f, 1.28f, 0.96f, 1.28f)
                curveToRelative(0.43f, 0f, 0.83f, -0.28f, 0.96f, -0.71f)
                curveToRelative(0.03f, -0.12f, 0.86f, -2.93f, 0.86f, -6.68f)
                curveToRelative(0f, -3.78f, -0.82f, -6.56f, -0.86f, -6.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.1f, 12.74f)
                curveToRelative(-2.67f, -1.21f, -4.35f, -3.65f, -4.95f, -4.65f)
                curveToRelative(0.6f, -1f, 2.27f, -3.43f, 4.95f, -4.64f)
                curveToRelative(0.5f, -0.23f, 0.73f, -0.82f, 0.5f, -1.32f)
                reflectiveCurveToRelative(-0.82f, -0.73f, -1.32f, -0.5f)
                curveTo(3.22f, 3.47f, 1.19f, 7.48f, 1.1f, 7.65f)
                curveToRelative(-0.14f, 0.28f, -0.14f, 0.61f, 0f, 0.89f)
                curveToRelative(0.08f, 0.17f, 2.12f, 4.18f, 6.17f, 6.02f)
                curveToRelative(0.48f, 0.22f, 1.09f, 0.04f, 1.32f, -0.5f)
                curveToRelative(0.22f, -0.51f, 0.01f, -1.1f, -0.5f, -1.32f)
                close()
            }
        }.also { _ReplyAll = it}
