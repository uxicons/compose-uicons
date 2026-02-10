package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Tc.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                curveToRelative(0f, 7.71f, 3.29f, 11f, 11f, 11f)
                curveToRelative(5.12f, 0f, 11f, -1.25f, 11f, -11f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.1f, 0f, -10f, -2.9f, -10f, -10f)
                reflectiveCurveToRelative(2.9f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.9f, 10f, 10f)
                reflectiveCurveToRelative(-2.9f, 10f, -10f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.16f, 7.77f)
                curveToRelative(-0.06f, -0.16f, -0.19f, -0.28f, -0.35f, -0.32f)
                curveToRelative(-0.09f, -0.02f, -2.25f, -0.54f, -4.81f, -0.54f)
                curveToRelative(-2.51f, 0f, -4.71f, 0.52f, -4.81f, 0.54f)
                curveToRelative(-0.17f, 0.04f, -0.3f, 0.16f, -0.36f, 0.32f)
                curveToRelative(-0.03f, 0.07f, -0.64f, 1.87f, -0.64f, 4.23f)
                reflectiveCurveToRelative(0.61f, 4.15f, 0.64f, 4.23f)
                curveToRelative(0.06f, 0.16f, 0.19f, 0.28f, 0.36f, 0.32f)
                curveToRelative(0.1f, 0.02f, 2.34f, 0.54f, 4.8f, 0.54f)
                curveToRelative(2.55f, 0f, 4.72f, -0.52f, 4.81f, -0.54f)
                curveToRelative(0.17f, -0.04f, 0.3f, -0.16f, 0.35f, -0.32f)
                curveToRelative(0.03f, -0.07f, 0.64f, -1.85f, 0.64f, -4.23f)
                curveToRelative(0f, -2.39f, -0.61f, -4.16f, -0.64f, -4.23f)
                close()
                moveTo(7.7f, 8.36f)
                curveToRelative(0.66f, -0.14f, 2.4f, -0.46f, 4.3f, -0.46f)
                curveToRelative(1.92f, 0f, 3.65f, 0.32f, 4.3f, 0.45f)
                curveToRelative(0.04f, 0.13f, 0.09f, 0.32f, 0.14f, 0.54f)
                curveToRelative(-0.28f, 0.3f, -1.04f, 1.07f, -2.11f, 1.9f)
                curveToRelative(-0.88f, 0.68f, -1.88f, 1.28f, -2.33f, 1.54f)
                curveToRelative(-0.45f, -0.26f, -1.44f, -0.85f, -2.33f, -1.54f)
                curveToRelative(-1.07f, -0.82f, -1.82f, -1.59f, -2.11f, -1.89f)
                curveToRelative(0.05f, -0.22f, 0.1f, -0.41f, 0.14f, -0.54f)
                close()
                moveTo(16.3f, 15.64f)
                curveToRelative(-0.65f, 0.14f, -2.38f, 0.45f, -4.3f, 0.45f)
                curveToRelative(-1.86f, 0f, -3.63f, -0.32f, -4.3f, -0.46f)
                curveToRelative(-0.16f, -0.56f, -0.5f, -1.95f, -0.5f, -3.64f)
                curveToRelative(0f, -0.7f, 0.06f, -1.34f, 0.14f, -1.9f)
                curveToRelative(0.41f, 0.4f, 1.0f, 0.93f, 1.72f, 1.49f)
                curveToRelative(1.24f, 0.95f, 2.64f, 1.72f, 2.7f, 1.76f)
                curveToRelative(0.2f, 0.11f, 0.41f, 0.04f, 0.48f, 0f)
                curveToRelative(0.06f, -0.03f, 1.46f, -0.8f, 2.7f, -1.76f)
                curveToRelative(0.73f, -0.56f, 1.31f, -1.09f, 1.72f, -1.49f)
                curveToRelative(0.08f, 0.56f, 0.14f, 1.2f, 0.14f, 1.9f)
                curveToRelative(0f, 1.69f, -0.34f, 3.08f, -0.5f, 3.64f)
                close()
            }
        }.also { _CircleEnvelope = it}
