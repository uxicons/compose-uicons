package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Piano: ImageVector? = null

val Icons.Sc.Piano: ImageVector
    get() = _Piano ?: UXIcon(name = "Piano") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 16.35f)
                curveToRelative(2.08f, 0.22f, 3.49f, 0.53f, 3.88f, 0.63f)
                curveToRelative(-0.21f, 2.68f, -0.63f, 4.38f, -0.66f, 4.48f)
                curveToRelative(-0.09f, 0.36f, -0.37f, 0.64f, -0.73f, 0.73f)
                curveToRelative(-0.14f, 0.03f, -3.44f, 0.82f, -9.49f, 0.82f)
                reflectiveCurveToRelative(-9.36f, -0.79f, -9.49f, -0.82f)
                curveToRelative(-0.37f, -0.09f, -0.65f, -0.38f, -0.74f, -0.75f)
                curveToRelative(-0.02f, -0.09f, -0.35f, -1.54f, -0.57f, -4.51f)
                curveToRelative(0.11f, -0.01f, 1.29f, -0.31f, 3.8f, -0.57f)
                verticalLineToRelative(1.65f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.83f)
                curveToRelative(0.62f, -0.04f, 1.29f, -0.08f, 2f, -0.11f)
                verticalLineToRelative(1.94f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.99f)
                curveToRelative(0.33f, -0.0f, 0.66f, -0.01f, 1f, -0.01f)
                reflectiveCurveToRelative(0.67f, 0.0f, 1f, 0.01f)
                verticalLineToRelative(1.99f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.94f)
                curveToRelative(0.71f, 0.03f, 1.38f, 0.07f, 2f, 0.11f)
                verticalLineToRelative(1.83f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.65f)
                close()
                moveTo(18.2f, 8.06f)
                curveToRelative(-0.84f, -0.17f, -1.22f, -0.52f, -1.34f, -1.23f)
                curveToRelative(-0.66f, -4.04f, -3.08f, -5.84f, -7.86f, -5.84f)
                curveToRelative(-5.53f, 0.0f, -8f, 2.47f, -8f, 8.0f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.47f, 0.03f, 2.76f, 0.08f, 3.9f)
                curveToRelative(1.07f, -0.22f, 4.8f, -0.9f, 10.92f, -0.9f)
                curveToRelative(6.25f, 0f, 10.02f, 0.71f, 10.99f, 0.92f)
                curveToRelative(0.01f, -0.3f, 0.01f, -0.6f, 0.01f, -0.92f)
                curveToRelative(0f, -3.54f, -1.39f, -5.26f, -4.8f, -5.94f)
                close()
            }
        }.also { _Piano = it}
