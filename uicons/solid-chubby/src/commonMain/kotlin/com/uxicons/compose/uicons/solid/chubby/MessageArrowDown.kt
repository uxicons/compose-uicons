package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowDown: ImageVector? = null

val Icons.Sc.MessageArrowDown: ImageVector
    get() = _MessageArrowDown ?: UXIcon(name = "MessageArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.8f, 2.71f)
                curveToRelative(-0.11f, -0.32f, -0.37f, -0.57f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.28f, -1.06f, -9.09f, -1.06f)
                reflectiveCurveToRelative(-8.92f, 1.01f, -9.09f, 1.06f)
                curveToRelative(-0.33f, 0.08f, -0.59f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.14f, -1.2f, 3.6f, -1.2f, 8.23f)
                curveToRelative(0f, 4.8f, 1.16f, 8.11f, 1.21f, 8.25f)
                curveToRelative(0.12f, 0.32f, 0.39f, 0.56f, 0.72f, 0.64f)
                curveToRelative(0.13f, 0.03f, 3.12f, 0.71f, 5.96f, 0.93f)
                curveToRelative(0.91f, 0.99f, 2.43f, 2.25f, 3.19f, 2.25f)
                curveToRelative(0.61f, -0.05f, 2.17f, -1.27f, 3.03f, -2.25f)
                curveToRelative(2.83f, -0.22f, 5.83f, -0.9f, 5.96f, -0.93f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.32f, 0.72f, -0.64f)
                curveToRelative(0.05f, -0.14f, 1.21f, -3.45f, 1.21f, -8.25f)
                curveToRelative(0f, -4.64f, -1.15f, -8.09f, -1.2f, -8.23f)
                close()
                moveTo(15.8f, 12.6f)
                curveToRelative(-0.91f, 1.22f, -1.99f, 2.29f, -3.2f, 3.2f)
                curveToRelative(-0.36f, 0.26f, -0.84f, 0.26f, -1.2f, 0f)
                curveToRelative(-1.21f, -0.91f, -2.29f, -1.98f, -3.2f, -3.2f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.2f, -1.4f)
                curveToRelative(0.44f, -0.33f, 1.07f, -0.24f, 1.4f, 0.2f)
                curveToRelative(0.37f, 0.49f, 0.77f, 0.95f, 1.2f, 1.38f)
                verticalLineToRelative(-5.78f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.78f)
                curveToRelative(0.43f, -0.44f, 0.83f, -0.89f, 1.2f, -1.38f)
                curveToRelative(0.33f, -0.44f, 0.96f, -0.53f, 1.4f, -0.2f)
                curveToRelative(0.44f, 0.33f, 0.53f, 0.96f, 0.2f, 1.4f)
                close()
            }
        }.also { _MessageArrowDown = it}
