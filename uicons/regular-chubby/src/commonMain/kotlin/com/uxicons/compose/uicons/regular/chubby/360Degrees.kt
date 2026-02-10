package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _360Degrees: ImageVector? = null

val Icons.Rc._Three60Degrees: ImageVector
    get() = _360Degrees ?: UXIcon(name = "360Degrees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(15f, 14.5f)
                curveToRelative(0f, 2.32f, -1.18f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.18f, -3.5f, -3.5f)
                curveToRelative(0.01f, -0.05f, -0.0f, -1.88f, 0f, -2f)
                curveToRelative(0f, -2.72f, 0.47f, -5.5f, 4f, -5.5f)
                curveToRelative(0.57f, 0f, 1.24f, 0.06f, 1.71f, 0.16f)
                curveToRelative(0.54f, 0.11f, 0.89f, 0.65f, 0.77f, 1.19f)
                reflectiveCurveToRelative(-0.65f, 0.89f, -1.19f, 0.77f)
                curveToRelative(-0.28f, -0.06f, -0.82f, -0.12f, -1.29f, -0.12f)
                curveToRelative(-0.88f, 0f, -1.72f, 0.01f, -1.94f, 2.2f)
                curveToRelative(0.42f, -0.13f, 0.9f, -0.2f, 1.44f, -0.2f)
                curveToRelative(2.32f, 0f, 3.5f, 1.18f, 3.5f, 3.5f)
                close()
                moveTo(13f, 14.5f)
                curveToRelative(0f, -1.23f, -0.27f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.27f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.27f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.27f, 1.5f, -1.5f)
                close()
                moveTo(23f, 12.5f)
                curveToRelative(0f, 1.65f, 0f, 5.5f, -3.5f, 5.5f)
                reflectiveCurveToRelative(-3.5f, -3.85f, -3.5f, -5.5f)
                reflectiveCurveToRelative(0f, -5.5f, 3.5f, -5.5f)
                reflectiveCurveToRelative(3.5f, 3.85f, 3.5f, 5.5f)
                close()
                moveTo(21f, 12.5f)
                curveToRelative(0f, -3.5f, -0.87f, -3.5f, -1.5f, -3.5f)
                reflectiveCurveToRelative(-1.5f, 0f, -1.5f, 3.5f)
                reflectiveCurveToRelative(0.87f, 3.5f, 1.5f, 3.5f)
                reflectiveCurveToRelative(1.5f, 0f, 1.5f, -3.5f)
                close()
                moveTo(6.5f, 10f)
                curveToRelative(0f, -1.96f, -1.07f, -3f, -3.1f, -3f)
                curveToRelative(-0.6f, 0f, -1.15f, 0.06f, -1.64f, 0.18f)
                curveToRelative(-0.54f, 0.13f, -0.87f, 0.67f, -0.74f, 1.21f)
                curveToRelative(0.13f, 0.54f, 0.67f, 0.86f, 1.21f, 0.74f)
                curveToRelative(0.33f, -0.08f, 0.72f, -0.12f, 1.17f, -0.12f)
                curveToRelative(1.05f, 0f, 1.1f, 0.26f, 1.1f, 1f)
                curveToRelative(0f, 0.6f, 0f, 1f, -1.5f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(1.97f, 0f, 1.99f, 0.41f, 2f, 1.5f)
                curveToRelative(0f, 1.12f, -0.23f, 1.5f, -1.62f, 1.5f)
                curveToRelative(-0.44f, 0f, -0.85f, -0.03f, -1.21f, -0.09f)
                curveToRelative(-0.55f, -0.09f, -1.06f, 0.27f, -1.16f, 0.81f)
                reflectiveCurveToRelative(0.27f, 1.06f, 0.81f, 1.16f)
                curveToRelative(0.47f, 0.08f, 0.99f, 0.12f, 1.54f, 0.12f)
                curveToRelative(2.4f, 0f, 3.62f, -1.18f, 3.62f, -3.5f)
                curveToRelative(0.06f, -1.24f, -0.36f, -2.26f, -0.96f, -2.73f)
                curveToRelative(0.31f, -0.46f, 0.46f, -1.05f, 0.46f, -1.77f)
                close()
            }
        }.also { _360Degrees = it}
