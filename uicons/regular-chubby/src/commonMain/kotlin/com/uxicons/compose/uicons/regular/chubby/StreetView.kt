package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Rc.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 7f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.9f, -0.01f, 2.96f, -1.07f, 2.99f, -3.01f)
                curveToRelative(-0.03f, -1.86f, -1.15f, -2.98f, -3.0f, -2.99f)
                curveToRelative(-1.87f, 0.01f, -2.96f, 1.1f, -3.0f, 3.01f)
                curveToRelative(0.04f, 1.92f, 1.1f, 2.98f, 2.99f, 2.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 16.54f)
                verticalLineToRelative(2.46f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.23f)
                curveToRelative(0f, -0.47f, -0.33f, -0.87f, -0.78f, -0.98f)
                curveToRelative(-0.0f, 0f, -0.01f, -0.0f, -0.01f, -0.0f)
                curveToRelative(-0.09f, -0.53f, -0.2f, -1.38f, -0.2f, -2.3f)
                reflectiveCurveToRelative(0.11f, -1.77f, 0.21f, -2.3f)
                curveToRelative(0.42f, -0.1f, 1.06f, -0.2f, 1.79f, -0.2f)
                curveToRelative(0.73f, 0f, 1.37f, 0.11f, 1.79f, 0.2f)
                curveToRelative(0.09f, 0.53f, 0.21f, 1.38f, 0.21f, 2.3f)
                reflectiveCurveToRelative(-0.11f, 1.77f, -0.21f, 2.3f)
                curveToRelative(-0.0f, 0f, -0.01f, 0.0f, -0.01f, 0.0f)
                curveToRelative(-0.46f, 0.1f, -0.78f, 0.51f, -0.78f, 0.98f)
                verticalLineToRelative(3.29f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.53f)
                curveToRelative(0.31f, -0.12f, 0.55f, -0.38f, 0.63f, -0.7f)
                curveToRelative(0.02f, -0.06f, 0.37f, -1.56f, 0.37f, -3.33f)
                reflectiveCurveToRelative(-0.36f, -3.27f, -0.37f, -3.33f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.6f, -0.64f, -0.71f)
                curveToRelative(-0.05f, -0.02f, -1.32f, -0.46f, -2.99f, -0.46f)
                curveToRelative(-1.68f, 0f, -2.94f, 0.44f, -2.99f, 0.46f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.38f, -0.64f, 0.71f)
                curveToRelative(-0.02f, 0.06f, -0.37f, 1.56f, -0.37f, 3.33f)
                reflectiveCurveToRelative(0.36f, 3.27f, 0.37f, 3.33f)
                curveToRelative(0.08f, 0.32f, 0.32f, 0.59f, 0.63f, 0.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.34f, 12.72f)
                curveToRelative(-0.52f, -0.19f, -1.09f, 0.08f, -1.28f, 0.6f)
                reflectiveCurveToRelative(0.08f, 1.09f, 0.6f, 1.28f)
                curveToRelative(2.07f, 0.75f, 2.33f, 2.02f, 2.34f, 2.89f)
                curveToRelative(-0.04f, 2.5f, -2.35f, 3.52f, -8f, 3.52f)
                curveToRelative(-3.7f, 0f, -7.95f, -0.4f, -8f, -3.48f)
                curveToRelative(0.02f, -1.48f, 0.74f, -2.38f, 2.33f, -2.94f)
                curveToRelative(0.52f, -0.18f, 0.8f, -0.75f, 0.62f, -1.27f)
                reflectiveCurveToRelative(-0.75f, -0.8f, -1.27f, -0.62f)
                curveToRelative(-2.99f, 1.04f, -3.65f, 3.18f, -3.67f, 4.83f)
                curveToRelative(0.09f, 5.48f, 7.29f, 5.48f, 10f, 5.48f)
                curveToRelative(2.97f, 0f, 9.92f, 0f, 10f, -5.52f)
                curveToRelative(-0.04f, -2.27f, -1.3f, -3.91f, -3.66f, -4.76f)
                close()
            }
        }.also { _StreetView = it}
