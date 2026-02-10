package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Sc.StreetView: ImageVector
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
                moveToRelative(17.95f, 13.56f)
                curveToRelative(-0.07f, 0.73f, -0.22f, 1.38f, -0.45f, 1.91f)
                verticalLineToRelative(2.03f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-0.74f, 0f, -1.43f, -0.23f, -2f, -0.63f)
                curveToRelative(-0.57f, 0.4f, -1.26f, 0.63f, -2f, 0.63f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-0.22f, -0.53f, -0.38f, -1.17f, -0.45f, -1.9f)
                curveToRelative(-2.2f, 0.61f, -4.05f, 1.86f, -4.05f, 4.42f)
                curveToRelative(0f, 5f, 7.01f, 5f, 10f, 5f)
                curveToRelative(4.95f, 0f, 10f, -0.59f, 10f, -5f)
                curveToRelative(0f, -2.54f, -1.68f, -3.81f, -4.05f, -4.44f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.06f, -0.09f, 0.5f, -0.73f, 0.5f, -2.5f)
                reflectiveCurveToRelative(-0.36f, -3.27f, -0.37f, -3.33f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.6f, -0.64f, -0.71f)
                curveToRelative(-0.05f, -0.02f, -1.32f, -0.46f, -2.99f, -0.46f)
                curveToRelative(-1.68f, 0f, -2.94f, 0.44f, -2.99f, 0.46f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.38f, -0.64f, 0.71f)
                curveToRelative(-0.02f, 0.06f, -0.37f, 1.56f, -0.37f, 3.33f)
                reflectiveCurveToRelative(0.44f, 2.41f, 0.5f, 2.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _StreetView = it}
