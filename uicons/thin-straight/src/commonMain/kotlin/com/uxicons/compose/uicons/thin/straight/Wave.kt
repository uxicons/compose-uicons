package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wave: ImageVector? = null

val Icons.Ts.Wave: ImageVector
    get() = _Wave ?: UXIcon(name = "Wave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.61f, 22.79f)
                lineToRelative(0.37f, 0.93f)
                curveToRelative(-0.47f, 0.19f, -0.97f, 0.28f, -1.48f, 0.28f)
                curveToRelative(-1.52f, 0f, -2.82f, -0.86f, -3.5f, -2.1f)
                curveToRelative(-0.68f, 1.25f, -1.98f, 2.1f, -3.5f, 2.1f)
                reflectiveCurveToRelative(-2.82f, -0.86f, -3.5f, -2.1f)
                curveToRelative(-0.68f, 1.25f, -1.98f, 2.1f, -3.5f, 2.1f)
                reflectiveCurveToRelative(-2.82f, -0.86f, -3.5f, -2.1f)
                curveToRelative(-0.68f, 1.25f, -1.98f, 2.1f, -3.5f, 2.1f)
                curveToRelative(-0.51f, 0f, -1.01f, -0.1f, -1.48f, -0.28f)
                lineToRelative(0.37f, -0.93f)
                curveToRelative(0.35f, 0.14f, 0.72f, 0.21f, 1.11f, 0.21f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0.38f, 0f, 0.76f, -0.07f, 1.11f, -0.21f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-3.45f, 0f, -5f, -3.77f, -5f, -7.5f)
                curveToRelative(0f, -3.55f, 2.67f, -7.5f, 6.5f, -7.5f)
                curveToRelative(0.6f, 0f, 1.17f, 0.13f, 1.69f, 0.27f)
                lineToRelative(0.4f, 0.06f)
                lineToRelative(0.43f, -0.78f)
                lineToRelative(-0.44f, -0.24f)
                curveToRelative(-1.55f, -0.86f, -3.31f, -1.32f, -5.09f, -1.32f)
                curveTo(9.71f, 0f, 5f, 4.71f, 5f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.79f, -2.7f, 4.05f, -4.61f, 3.29f)
                lineToRelative(-0.37f, 0.93f)
                curveToRelative(2.5f, 0.99f, 5.98f, -0.75f, 5.98f, -4.22f)
                verticalLineToRelative(-3f)
                curveTo(6f, 5.26f, 10.26f, 1f, 15.5f, 1f)
                curveToRelative(0.55f, 0f, 1.09f, 0.05f, 1.63f, 0.14f)
                curveToRelative(-3.72f, 0.78f, -6.13f, 4.69f, -6.13f, 8.36f)
                curveToRelative(0f, 5.08f, 2.41f, 8.5f, 6f, 8.5f)
                curveToRelative(1.52f, 0f, 2.82f, -0.86f, 3.5f, -2.1f)
                curveToRelative(0.68f, 1.25f, 1.98f, 2.1f, 3.5f, 2.1f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
            }
        }.also { _Wave = it}
