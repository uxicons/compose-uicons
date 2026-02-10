package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Sc.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11.71f)
                curveToRelative(0.47f, -0.28f, 1.22f, -0.75f, 1.9f, -1.27f)
                curveToRelative(0.75f, -0.57f, 1.32f, -1.12f, 1.68f, -1.47f)
                curveToRelative(-0.76f, -0.14f, -2.1f, -0.34f, -3.57f, -0.34f)
                curveToRelative(-1.45f, 0f, -2.8f, 0.2f, -3.57f, 0.34f)
                curveToRelative(0.35f, 0.35f, 0.93f, 0.9f, 1.68f, 1.47f)
                curveToRelative(0.68f, 0.52f, 1.42f, 0.99f, 1.9f, 1.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.12f, 12.02f)
                curveToRelative(-1.21f, 0.93f, -2.58f, 1.69f, -2.64f, 1.72f)
                curveToRelative(-0.42f, 0.22f, -0.81f, 0.08f, -0.96f, 0f)
                curveToRelative(-0.06f, -0.03f, -1.43f, -0.78f, -2.64f, -1.72f)
                curveToRelative(-0.33f, -0.26f, -0.63f, -0.51f, -0.9f, -0.74f)
                curveToRelative(-0.01f, 0.23f, -0.03f, 0.47f, -0.03f, 0.72f)
                curveToRelative(0f, 1.29f, 0.22f, 2.39f, 0.38f, 3.01f)
                curveToRelative(0.76f, 0.14f, 2.19f, 0.36f, 3.67f, 0.36f)
                curveToRelative(1.53f, 0f, 2.93f, -0.22f, 3.67f, -0.36f)
                curveToRelative(0.15f, -0.62f, 0.38f, -1.72f, 0.38f, -3.02f)
                curveToRelative(0f, -0.25f, -0.01f, -0.48f, -0.03f, -0.72f)
                curveToRelative(-0.27f, 0.23f, -0.57f, 0.48f, -0.9f, 0.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(17.41f, 16.2f)
                curveToRelative(-0.11f, 0.32f, -0.38f, 0.56f, -0.71f, 0.64f)
                curveToRelative(-0.09f, 0.02f, -2.21f, 0.53f, -4.7f, 0.53f)
                curveToRelative(-2.41f, 0f, -4.6f, -0.51f, -4.7f, -0.53f)
                curveToRelative(-0.33f, -0.08f, -0.6f, -0.32f, -0.72f, -0.65f)
                curveToRelative(-0.03f, -0.07f, -0.64f, -1.86f, -0.64f, -4.2f)
                reflectiveCurveToRelative(0.61f, -4.12f, 0.64f, -4.2f)
                curveToRelative(0.11f, -0.32f, 0.38f, -0.57f, 0.71f, -0.65f)
                curveToRelative(0.09f, -0.02f, 2.25f, -0.53f, 4.7f, -0.53f)
                curveToRelative(2.5f, 0f, 4.62f, 0.51f, 4.7f, 0.53f)
                curveToRelative(0.33f, 0.08f, 0.59f, 0.32f, 0.71f, 0.64f)
                curveToRelative(0.03f, 0.07f, 0.64f, 1.83f, 0.64f, 4.2f)
                curveToRelative(0f, 2.35f, -0.61f, 4.12f, -0.64f, 4.2f)
                close()
            }
        }.also { _CircleEnvelope = it}
