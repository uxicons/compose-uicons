package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mug: ImageVector? = null

val Icons.Rc.Mug: ImageVector
    get() = _Mug ?: UXIcon(name = "Mug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.85f, 8.31f)
                horizontalLineToRelative(-0.8f)
                verticalLineToRelative(-2.77f)
                curveToRelative(0.37f, -0.06f, 0.7f, -0.32f, 0.81f, -0.71f)
                curveToRelative(0.15f, -0.53f, -0.15f, -1.08f, -0.68f, -1.24f)
                curveToRelative(-0.15f, -0.04f, -3.65f, -1.05f, -8.8f, -1.05f)
                curveTo(5.09f, 2.55f, 1.83f, 3.56f, 1.7f, 3.6f)
                curveToRelative(-0.53f, 0.17f, -0.82f, 0.73f, -0.65f, 1.25f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.56f, 0.67f, 0.66f)
                verticalLineToRelative(11.47f)
                curveToRelative(0f, 1.88f, 1.2f, 3.53f, 2.98f, 4.1f)
                curveToRelative(0.74f, 0.24f, 3.21f, 0.36f, 5.69f, 0.36f)
                reflectiveCurveToRelative(4.94f, -0.12f, 5.69f, -0.36f)
                curveToRelative(1.78f, -0.57f, 2.98f, -2.22f, 2.98f, -4.1f)
                verticalLineToRelative(-0.72f)
                horizontalLineToRelative(0.8f)
                curveToRelative(1.74f, 0f, 3.15f, -1.42f, 3.15f, -3.17f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0f, -1.75f, -1.41f, -3.17f, -3.15f, -3.17f)
                close()
                moveTo(15.46f, 19.18f)
                curveToRelative(-1.14f, 0.36f, -9.01f, 0.36f, -10.15f, 0f)
                curveToRelative(-0.95f, -0.3f, -1.59f, -1.19f, -1.59f, -2.2f)
                verticalLineToRelative(-6.9f)
                lineTo(12.91f, 10.09f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(3.72f, 8.09f)
                verticalLineToRelative(-2.92f)
                curveToRelative(1.37f, -0.28f, 3.68f, -0.62f, 6.67f, -0.62f)
                curveToRelative(2.87f, 0f, 5.22f, 0.34f, 6.67f, 0.61f)
                verticalLineToRelative(11.82f)
                curveToRelative(0f, 1.01f, -0.64f, 1.89f, -1.59f, 2.2f)
                close()
                moveTo(21f, 13.09f)
                curveToRelative(0f, 0.65f, -0.52f, 1.18f, -1.15f, 1.18f)
                horizontalLineToRelative(-0.8f)
                verticalLineToRelative(-3.95f)
                horizontalLineToRelative(0.8f)
                curveToRelative(0.63f, 0f, 1.15f, 0.53f, 1.15f, 1.18f)
                verticalLineToRelative(1.6f)
                close()
            }
        }.also { _Mug = it}
