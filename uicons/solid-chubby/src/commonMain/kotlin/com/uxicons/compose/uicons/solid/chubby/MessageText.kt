package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageText: ImageVector? = null

val Icons.Sc.MessageText: ImageVector
    get() = _MessageText ?: UXIcon(name = "MessageText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.8f, 2.71f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.57f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.29f, -1.06f, -9.09f, -1.06f)
                reflectiveCurveToRelative(-8.92f, 1.01f, -9.09f, 1.06f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.14f, -1.2f, 3.6f, -1.2f, 8.23f)
                curveToRelative(0f, 4.73f, 1.16f, 8.1f, 1.21f, 8.24f)
                curveToRelative(0.11f, 0.33f, 0.39f, 0.57f, 0.72f, 0.65f)
                curveToRelative(0.13f, 0.03f, 3.13f, 0.71f, 5.96f, 0.93f)
                curveToRelative(0.96f, 1.02f, 2.42f, 2.29f, 3.19f, 2.25f)
                curveToRelative(0.61f, -0.05f, 2.17f, -1.28f, 3.03f, -2.25f)
                curveToRelative(2.83f, -0.22f, 5.83f, -0.9f, 5.96f, -0.93f)
                curveToRelative(0.34f, -0.08f, 0.61f, -0.32f, 0.72f, -0.65f)
                curveToRelative(0.05f, -0.14f, 1.21f, -3.51f, 1.21f, -8.24f)
                curveToRelative(0f, -4.64f, -1.15f, -8.09f, -1.2f, -8.23f)
                close()
                moveTo(16.98f, 7.61f)
                curveToRelative(-0.12f, 0.54f, -0.66f, 0.88f, -1.19f, 0.77f)
                curveToRelative(-0.01f, -0.0f, -1.23f, -0.26f, -2.79f, -0.35f)
                verticalLineToRelative(6.97f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.97f)
                curveToRelative(-1.56f, 0.09f, -2.77f, 0.34f, -2.79f, 0.35f)
                curveToRelative(-0.54f, 0.12f, -1.07f, -0.23f, -1.19f, -0.77f)
                curveToRelative(-0.12f, -0.54f, 0.23f, -1.07f, 0.77f, -1.19f)
                curveToRelative(0.08f, -0.02f, 1.98f, -0.42f, 4.21f, -0.42f)
                reflectiveCurveToRelative(4.13f, 0.41f, 4.21f, 0.42f)
                curveToRelative(0.54f, 0.12f, 0.88f, 0.65f, 0.77f, 1.19f)
                close()
            }
        }.also { _MessageText = it}
