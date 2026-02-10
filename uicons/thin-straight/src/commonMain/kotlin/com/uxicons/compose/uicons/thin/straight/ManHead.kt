package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManHead: ImageVector? = null

val Icons.Ts.ManHead: ImageVector
    get() = _ManHead ?: UXIcon(name = "ManHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-0.76f, 1.83f, -2.39f, 3.71f, -4.4f, 4.86f)
                verticalLineToRelative(5.14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.64f)
                curveToRelative(-0.95f, 0.41f, -1.97f, 0.64f, -3f, 0.64f)
                reflectiveCurveToRelative(-2.05f, -0.24f, -3f, -0.64f)
                verticalLineToRelative(4.64f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.14f)
                curveToRelative(-2.01f, -1.16f, -3.63f, -3.03f, -4.39f, -4.86f)
                horizontalLineToRelative(1.09f)
                curveToRelative(1.22f, 2.52f, 4.16f, 5.0f, 7.3f, 5.0f)
                curveToRelative(3.42f, 0f, 6.61f, -2.94f, 7.59f, -5.67f)
                lineToRelative(0.12f, -0.33f)
                horizontalLineToRelative(1.29f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-0.45f)
                lineToRelative(-0.11f, -0.44f)
                curveToRelative(-0.47f, -4.31f, -4.1f, -7.56f, -8.45f, -7.56f)
                curveTo(7.2f, 1f, 4.0f, 4.17f, 3.21f, 9.69f)
                lineToRelative(-0.16f, 1.35f)
                curveToRelative(1.77f, 0.06f, 7.72f, -0.29f, 10.99f, -7.25f)
                lineToRelative(0.9f, 0.43f)
                curveToRelative(-1.43f, 3.03f, -3.36f, 4.9f, -5.29f, 6.04f)
                curveToRelative(0.2f, 0.18f, 0.33f, 0.45f, 0.33f, 0.74f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-0.53f, 0f, -0.95f, -0.4f, -1.0f, -0.92f)
                curveToRelative(-2f, 0.81f, -3.81f, 0.95f, -4.79f, 0.95f)
                curveToRelative(-0.48f, 0f, -0.76f, -0.03f, -0.77f, -0.03f)
                lineToRelative(-0.49f, -0.06f)
                lineToRelative(0.28f, -2.38f)
                curveTo(3.07f, 3.57f, 6.72f, 0f, 12f, 0f)
                curveToRelative(4.71f, 0f, 8.67f, 3.43f, 9.38f, 8.04f)
                curveToRelative(1.5f, 0.2f, 2.62f, 1.46f, 2.62f, 2.96f)
                close()
                moveTo(16f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ManHead = it}
