package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fish: ImageVector? = null

val Icons.Ts.Fish: ImageVector
    get() = _Fish ?: UXIcon(name = "Fish") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 6.5f)
                curveToRelative(0f, 0.91f, -0.55f, 1.5f, -1.4f, 1.5f)
                horizontalLineToRelative(-5.6f)
                curveToRelative(-0.01f, 1.86f, -0.11f, 3.52f, -0.31f, 5f)
                horizontalLineToRelative(3.31f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.99f, -0.09f, 1.87f, -0.28f, 2.85f)
                curveToRelative(-0.19f, 0.96f, -1.04f, 1.65f, -2.03f, 1.65f)
                horizontalLineToRelative(-2.37f)
                curveToRelative(-2.15f, 4.47f, -6.61f, 6f, -14.83f, 6f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.99f, 0.56f, -8.59f, 2.0f, -11.13f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.97f, 0.54f, -1.85f, 1.4f, -2.3f)
                curveToRelative(1.82f, -0.95f, 5.03f, -2.06f, 8.09f, -2.06f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3.2f)
                curveToRelative(1.22f, -0.12f, 2.55f, -0.18f, 4f, -0.19f)
                lineTo(16f, 1.4f)
                curveToRelative(0f, -0.85f, 0.59f, -1.4f, 1.5f, -1.4f)
                curveToRelative(1.31f, 0f, 3.22f, 0.97f, 3.47f, 3.03f)
                curveToRelative(2.06f, 0.25f, 3.03f, 2.16f, 3.03f, 3.47f)
                close()
                moveTo(3.0f, 10.93f)
                curveToRelative(1.72f, -2.01f, 4.3f, -3.13f, 8.0f, -3.62f)
                verticalLineToRelative(-2.3f)
                curveToRelative(-3.59f, 0.14f, -6.76f, 1.75f, -7.13f, 1.94f)
                curveToRelative(-0.53f, 0.28f, -0.87f, 0.82f, -0.87f, 1.42f)
                verticalLineToRelative(2.57f)
                close()
                moveTo(9.36f, 21.95f)
                curveToRelative(-0.79f, -3.62f, -3.69f, -6.51f, -7.31f, -7.3f)
                curveToRelative(-0.72f, 2.12f, -1.02f, 4.86f, -1.04f, 8.35f)
                curveToRelative(3.5f, -0.03f, 6.23f, -0.33f, 8.35f, -1.04f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(-7.7f, 0.06f, -11.71f, 1.44f, -13.59f, 5.7f)
                curveToRelative(3.87f, 0.91f, 6.98f, 4.0f, 7.89f, 7.88f)
                curveToRelative(4.26f, -1.88f, 5.64f, -5.89f, 5.7f, -13.59f)
                close()
                moveTo(16.54f, 14f)
                curveToRelative(-0.19f, 1.11f, -0.45f, 2.1f, -0.79f, 3f)
                horizontalLineToRelative(1.94f)
                curveToRelative(0.51f, 0f, 0.95f, -0.36f, 1.05f, -0.85f)
                curveToRelative(0.15f, -0.74f, 0.23f, -1.43f, 0.25f, -2.15f)
                horizontalLineToRelative(-2.46f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, -0.78f, -0.63f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.87f, -1.72f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.5f, 0f, -0.5f, 0.25f, -0.5f, 0.4f)
                verticalLineToRelative(5.6f)
                horizontalLineToRelative(5.6f)
                curveToRelative(0.15f, 0f, 0.4f, 0f, 0.4f, -0.5f)
                close()
            }
        }.also { _Fish = it}
