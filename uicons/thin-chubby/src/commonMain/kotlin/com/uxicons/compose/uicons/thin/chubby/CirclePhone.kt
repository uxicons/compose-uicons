package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhone: ImageVector? = null

val Icons.Tc.CirclePhone: ImageVector
    get() = _CirclePhone ?: UXIcon(name = "CirclePhone") {
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
                moveToRelative(16.13f, 12.51f)
                curveToRelative(-0.92f, -0.28f, -1.93f, -0.04f, -2.62f, 0.62f)
                lineToRelative(-0.12f, 0.12f)
                curveToRelative(-0.51f, -0.17f, -1.22f, -0.64f, -1.61f, -1.02f)
                curveToRelative(-0.39f, -0.4f, -0.86f, -1.09f, -1.04f, -1.6f)
                lineToRelative(0.11f, -0.11f)
                curveToRelative(0.68f, -0.68f, 0.92f, -1.68f, 0.63f, -2.6f)
                curveToRelative(-0.25f, -0.8f, -0.88f, -1.44f, -1.67f, -1.69f)
                curveToRelative(-0.92f, -0.29f, -1.91f, -0.05f, -2.55f, 0.6f)
                curveToRelative(-0.06f, 0.05f, -1.53f, 1.29f, -1.16f, 3.29f)
                curveToRelative(0.36f, 1.82f, 1.66f, 3.8f, 2.8f, 4.97f)
                curveToRelative(1.17f, 1.12f, 3.17f, 2.43f, 5.01f, 2.76f)
                curveToRelative(1.93f, 0.34f, 3.14f, -0.96f, 3.29f, -1.13f)
                curveToRelative(0.69f, -0.67f, 0.93f, -1.65f, 0.63f, -2.55f)
                curveToRelative(-0.26f, -0.79f, -0.9f, -1.41f, -1.71f, -1.65f)
                close()
                moveTo(16.49f, 16.01f)
                curveToRelative(-0.01f, 0.01f, -0.96f, 1.11f, -2.4f, 0.85f)
                curveToRelative(-1.63f, -0.32f, -3.48f, -1.51f, -4.49f, -2.48f)
                curveToRelative(-0.99f, -1.02f, -2.2f, -2.84f, -2.52f, -4.45f)
                curveToRelative(-0.26f, -1.4f, 0.78f, -2.3f, 0.85f, -2.37f)
                curveToRelative(0.3f, -0.3f, 0.69f, -0.47f, 1.1f, -0.46f)
                curveToRelative(0.85f, 0.02f, 1.33f, 0.61f, 1.49f, 1.11f)
                curveToRelative(0.18f, 0.57f, 0.03f, 1.18f, -0.39f, 1.6f)
                lineToRelative(-0.31f, 0.32f)
                curveToRelative(-0.11f, 0.11f, -0.16f, 0.27f, -0.14f, 0.43f)
                curveToRelative(0.14f, 0.84f, 0.92f, 1.9f, 1.39f, 2.38f)
                curveToRelative(0.47f, 0.45f, 1.54f, 1.22f, 2.39f, 1.36f)
                curveToRelative(0.15f, 0.03f, 0.31f, -0.03f, 0.42f, -0.13f)
                lineToRelative(0.32f, -0.31f)
                curveToRelative(0.43f, -0.41f, 1.05f, -0.56f, 1.63f, -0.38f)
                curveToRelative(0.5f, 0.15f, 0.89f, 0.53f, 1.05f, 1.01f)
                curveToRelative(0.18f, 0.54f, 0.03f, 1.13f, -0.39f, 1.54f)
                close()
            }
        }.also { _CirclePhone = it}
