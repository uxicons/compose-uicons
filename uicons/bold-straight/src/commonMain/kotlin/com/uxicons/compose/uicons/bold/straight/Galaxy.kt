package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Bs.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 19.86f)
                lineToRelative(-2.63f, -2.98f)
                curveToRelative(-0.68f, -0.77f, -1.48f, -1.4f, -2.38f, -1.88f)
                curveToRelative(0f, 0.72f, -0.09f, 1.45f, -0.27f, 2.17f)
                curveToRelative(-0.99f, 4.02f, -4.68f, 6.82f, -8.96f, 6.82f)
                horizontalLineToRelative(-5.63f)
                reflectiveCurveToRelative(2.98f, -2.62f, 2.98f, -2.62f)
                curveToRelative(0.77f, -0.68f, 1.4f, -1.48f, 1.88f, -2.38f)
                curveToRelative(-0.72f, 0f, -1.45f, -0.09f, -2.17f, -0.27f)
                curveTo(2.81f, 17.74f, 0f, 14.06f, 0f, 9.77f)
                verticalLineToRelative(-5.63f)
                reflectiveCurveToRelative(2.62f, 2.98f, 2.62f, 2.98f)
                curveToRelative(0.68f, 0.77f, 1.48f, 1.4f, 2.38f, 1.88f)
                curveToRelative(0f, -0.72f, 0.09f, -1.45f, 0.27f, -2.17f)
                curveTo(6.26f, 2.81f, 9.94f, 0f, 14.23f, 0f)
                horizontalLineToRelative(5.63f)
                reflectiveCurveToRelative(-2.98f, 2.62f, -2.98f, 2.62f)
                curveToRelative(-0.77f, 0.68f, -1.4f, 1.48f, -1.88f, 2.38f)
                curveToRelative(0.72f, 0f, 1.45f, 0.09f, 2.17f, 0.27f)
                curveToRelative(4.02f, 0.99f, 6.82f, 4.68f, 6.82f, 8.96f)
                verticalLineToRelative(5.63f)
                close()
                moveTo(20.78f, 12.56f)
                curveToRelative(-0.57f, -2.13f, -2.22f, -3.86f, -4.32f, -4.38f)
                curveToRelative(-0.88f, -0.22f, -1.76f, -0.24f, -2.63f, -0.06f)
                curveToRelative(-0.7f, 0.14f, -1.39f, -0.09f, -1.87f, -0.62f)
                curveToRelative(-0.47f, -0.53f, -0.64f, -1.28f, -0.42f, -1.96f)
                curveToRelative(0.26f, -0.81f, 0.6f, -1.59f, 1.02f, -2.32f)
                curveToRelative(-2.13f, 0.57f, -3.86f, 2.22f, -4.38f, 4.32f)
                curveToRelative(-0.22f, 0.88f, -0.24f, 1.76f, -0.06f, 2.63f)
                curveToRelative(0.14f, 0.69f, -0.09f, 1.39f, -0.62f, 1.87f)
                curveToRelative(-0.53f, 0.47f, -1.27f, 0.64f, -1.96f, 0.42f)
                curveToRelative(-0.81f, -0.26f, -1.59f, -0.6f, -2.32f, -1.02f)
                curveToRelative(0.57f, 2.13f, 2.22f, 3.86f, 4.32f, 4.38f)
                curveToRelative(0.88f, 0.22f, 1.76f, 0.24f, 2.63f, 0.06f)
                curveToRelative(0.13f, -0.03f, 0.27f, -0.04f, 0.4f, -0.04f)
                curveToRelative(0.56f, 0f, 1.08f, 0.23f, 1.47f, 0.66f)
                curveToRelative(0.47f, 0.53f, 0.64f, 1.28f, 0.42f, 1.96f)
                curveToRelative(-0.26f, 0.81f, -0.6f, 1.59f, -1.02f, 2.32f)
                curveToRelative(2.13f, -0.57f, 3.86f, -2.22f, 4.38f, -4.32f)
                curveToRelative(0.22f, -0.88f, 0.24f, -1.76f, 0.06f, -2.63f)
                curveToRelative(-0.14f, -0.69f, 0.09f, -1.39f, 0.62f, -1.87f)
                reflectiveCurveToRelative(1.27f, -0.64f, 1.96f, -0.42f)
                curveToRelative(0.81f, 0.26f, 1.59f, 0.6f, 2.32f, 1.02f)
                close()
            }
        }.also { _Galaxy = it}
