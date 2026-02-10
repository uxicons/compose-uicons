package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Rr.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.28f, 22.99f)
                curveToRelative(-1.21f, 0f, -2.39f, -0.33f, -3.44f, -0.99f)
                curveToRelative(-0.75f, -0.47f, -1.37f, -1.08f, -1.84f, -1.77f)
                curveToRelative(-0.47f, 0.69f, -1.09f, 1.3f, -1.84f, 1.77f)
                curveToRelative(-1.96f, 1.23f, -4.37f, 1.32f, -6.6f, 0.24f)
                curveToRelative(-1.0f, -0.48f, -1.84f, -1.21f, -2.44f, -2.11f)
                curveTo(-2.38f, 14.88f, 2.96f, 7.62f, 9.12f, 2.58f)
                curveToRelative(1.67f, -1.37f, 4.09f, -1.37f, 5.76f, 0f)
                curveToRelative(6.16f, 5.04f, 11.5f, 12.3f, 8.0f, 17.55f)
                curveToRelative(-0.6f, 0.9f, -1.44f, 1.63f, -2.44f, 2.11f)
                curveToRelative(-1.04f, 0.5f, -2.11f, 0.75f, -3.16f, 0.75f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 1.32f, 0.71f, 2.55f, 1.91f, 3.3f)
                curveToRelative(1.36f, 0.86f, 3.07f, 0.91f, 4.67f, 0.13f)
                curveToRelative(0.67f, -0.32f, 1.24f, -0.81f, 1.64f, -1.42f)
                curveToRelative(2.76f, -4.14f, -2.37f, -10.61f, -7.6f, -14.9f)
                curveToRelative(-0.93f, -0.77f, -2.29f, -0.77f, -3.23f, 0f)
                curveTo(5.15f, 8.41f, 0.02f, 14.88f, 2.78f, 19.02f)
                curveToRelative(0.4f, 0.6f, 0.97f, 1.09f, 1.64f, 1.42f)
                curveToRelative(1.6f, 0.77f, 3.31f, 0.72f, 4.67f, -0.13f)
                curveToRelative(1.19f, -0.75f, 1.91f, -1.99f, 1.91f, -3.3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _HeartUpsideDown = it}
