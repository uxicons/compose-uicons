package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Rc.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.92f)
                curveToRelative(-2.71f, 0f, -4.08f, 1.37f, -4.08f, 4.08f)
                reflectiveCurveToRelative(1.37f, 4.08f, 4.08f, 4.08f)
                reflectiveCurveToRelative(4.08f, -1.37f, 4.08f, -4.08f)
                reflectiveCurveToRelative(-1.37f, -4.08f, -4.08f, -4.08f)
                close()
                moveTo(12f, 14.08f)
                curveToRelative(-1.44f, 0f, -2.08f, -0.3f, -2.08f, -2.08f)
                reflectiveCurveToRelative(0.64f, -2.08f, 2.08f, -2.08f)
                reflectiveCurveToRelative(2.08f, 0.3f, 2.08f, 2.08f)
                reflectiveCurveToRelative(-0.64f, 2.08f, -2.08f, 2.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.44f, 6.03f)
                curveToRelative(-1.23f, -1.04f, -2.61f, -1.49f, -3.77f, -1.68f)
                lineToRelative(1.48f, -1.47f)
                curveToRelative(0.27f, -0.27f, 0.36f, -0.67f, 0.24f, -1.02f)
                curveToRelative(-0.12f, -0.36f, -0.43f, -0.62f, -0.81f, -0.67f)
                curveToRelative(-0.34f, -0.05f, -8.48f, -1.14f, -12.7f, 2.53f)
                curveToRelative(-1.64f, 1.42f, -2.47f, 3.35f, -2.47f, 5.72f)
                curveToRelative(0f, 3.81f, 1.04f, 6.64f, 3.09f, 8.41f)
                curveToRelative(1.26f, 1.09f, 2.69f, 1.57f, 3.87f, 1.77f)
                lineToRelative(-1.52f, 1.51f)
                curveToRelative(-0.27f, 0.27f, -0.36f, 0.67f, -0.24f, 1.03f)
                reflectiveCurveToRelative(0.44f, 0.62f, 0.82f, 0.67f)
                curveToRelative(0.13f, 0.02f, 1.31f, 0.17f, 2.96f, 0.17f)
                curveToRelative(2.85f, 0f, 7.1f, -0.44f, 9.76f, -2.77f)
                curveToRelative(1.61f, -1.42f, 2.43f, -3.31f, 2.43f, -5.64f)
                curveToRelative(0f, -3.92f, -1.06f, -6.8f, -3.14f, -8.55f)
                close()
                moveTo(18.84f, 18.72f)
                curveToRelative(-2.35f, 2.06f, -6.49f, 2.33f, -9.01f, 2.27f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(0.31f, -0.3f, 0.38f, -0.77f, 0.19f, -1.16f)
                curveToRelative(-0.19f, -0.39f, -0.61f, -0.6f, -1.04f, -0.54f)
                curveToRelative(-0.03f, 0.0f, -2.7f, 0.37f, -4.74f, -1.39f)
                curveToRelative(-1.59f, -1.37f, -2.4f, -3.69f, -2.4f, -6.9f)
                curveToRelative(0f, -1.79f, 0.58f, -3.17f, 1.78f, -4.21f)
                curveToRelative(2.35f, -2.05f, 6.49f, -2.28f, 8.99f, -2.21f)
                lineToRelative(-1.59f, 1.59f)
                curveToRelative(-0.31f, 0.31f, -0.38f, 0.78f, -0.18f, 1.17f)
                curveToRelative(0.2f, 0.39f, 0.63f, 0.6f, 1.06f, 0.53f)
                curveToRelative(0.03f, -0.01f, 2.65f, -0.44f, 4.68f, 1.27f)
                curveToRelative(1.61f, 1.36f, 2.43f, 3.72f, 2.43f, 7.02f)
                curveToRelative(0f, 1.75f, -0.57f, 3.11f, -1.75f, 4.14f)
                close()
            }
        }.also { _Hurricane = it}
