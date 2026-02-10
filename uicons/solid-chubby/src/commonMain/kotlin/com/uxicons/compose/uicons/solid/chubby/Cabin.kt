package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cabin: ImageVector? = null

val Icons.Sc.Cabin: ImageVector
    get() = _Cabin ?: UXIcon(name = "Cabin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.27f, 12.5f)
                horizontalLineToRelative(-8.15f)
                curveToRelative(-0.04f, 0.47f, -0.1f, 0.97f, -0.12f, 1.5f)
                horizontalLineToRelative(6.17f)
                curveToRelative(-0.06f, 0.63f, -0.12f, 1.32f, -0.15f, 2f)
                horizontalLineToRelative(-6.02f)
                curveToRelative(0.02f, 0.46f, 0.07f, 0.98f, 0.11f, 1.5f)
                horizontalLineToRelative(5.9f)
                curveToRelative(0.02f, 0.57f, 0.05f, 1.27f, 0.1f, 2f)
                horizontalLineToRelative(-5.85f)
                curveToRelative(0.12f, 1.38f, 0.23f, 2.51f, 0.24f, 2.6f)
                curveToRelative(0.05f, 0.51f, 0.48f, 0.9f, 0.99f, 0.9f)
                horizontalLineToRelative(6.82f)
                curveToRelative(-0.12f, -1.34f, -0.32f, -4.52f, -0.32f, -6f)
                curveToRelative(0f, -1.54f, 0.16f, -3.39f, 0.27f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.83f, 14f)
                horizontalLineToRelative(6.17f)
                curveToRelative(-0.02f, -0.53f, -0.07f, -1.02f, -0.12f, -1.5f)
                horizontalLineToRelative(-8.15f)
                curveToRelative(0.11f, 1.11f, 0.27f, 2.96f, 0.27f, 4.5f)
                curveToRelative(0f, 1.48f, -0.2f, 4.66f, -0.32f, 6f)
                horizontalLineToRelative(6.82f)
                curveToRelative(0.51f, 0f, 0.94f, -0.39f, 0.99f, -0.9f)
                curveToRelative(0.01f, -0.1f, 0.12f, -1.22f, 0.24f, -2.6f)
                horizontalLineToRelative(-5.85f)
                curveToRelative(0.05f, -0.73f, 0.09f, -1.43f, 0.1f, -2f)
                horizontalLineToRelative(5.9f)
                curveToRelative(0.04f, -0.53f, 0.09f, -1.04f, 0.11f, -1.5f)
                horizontalLineToRelative(-6.02f)
                curveToRelative(-0.03f, -0.68f, -0.09f, -1.37f, -0.15f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 6.58f)
                reflectiveCurveToRelative(-0.0f, -0.0f, -0.0f, -0.01f)
                curveToRelative(0.0f, -0.04f, 0.01f, -0.09f, 0.01f, -0.13f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.28f)
                curveToRelative(-2.25f, -1.53f, -5.12f, -3.28f, -6.5f, -3.28f)
                curveToRelative(-2.08f, 0f, -7.56f, 3.98f, -9.19f, 5.2f)
                curveToRelative(-0.13f, 0.1f, -0.24f, 0.23f, -0.31f, 0.38f)
                curveToRelative(-0.04f, 0.09f, -0.69f, 1.49f, -1.12f, 3.92f)
                horizontalLineToRelative(21.23f)
                curveToRelative(-0.43f, -2.44f, -1.08f, -3.84f, -1.12f, -3.92f)
                close()
                moveTo(12f, 7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Cabin = it}
