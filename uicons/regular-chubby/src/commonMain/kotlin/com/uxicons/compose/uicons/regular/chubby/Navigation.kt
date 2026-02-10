package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Navigation: ImageVector? = null

val Icons.Rc.Navigation: ImageVector
    get() = _Navigation ?: UXIcon(name = "Navigation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                reflectiveCurveTo(6.6f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.6f, 6.63f)
                curveToRelative(-0.24f, -0.04f, -5.94f, -0.86f, -10.91f, 4.1f)
                curveToRelative(-0.61f, 0.61f, -0.49f, 1.21f, -0.41f, 1.44f)
                curveToRelative(0.33f, 0.94f, 1.47f, 1.08f, 3.05f, 1.27f)
                curveToRelative(0.61f, 0.07f, 1.62f, 0.19f, 1.95f, 0.35f)
                curveToRelative(0.16f, 0.33f, 0.28f, 1.34f, 0.36f, 1.96f)
                curveToRelative(0.19f, 1.57f, 0.33f, 2.71f, 1.27f, 3.03f)
                curveToRelative(0.09f, 0.03f, 0.23f, 0.06f, 0.4f, 0.06f)
                curveToRelative(0.28f, 0f, 0.65f, -0.1f, 1.03f, -0.47f)
                curveToRelative(4.97f, -4.97f, 4.14f, -10.67f, 4.1f, -10.91f)
                curveToRelative(-0.07f, -0.43f, -0.4f, -0.77f, -0.83f, -0.83f)
                close()
                moveTo(12.7f, 16.11f)
                curveToRelative(-0.03f, -0.21f, -0.05f, -0.42f, -0.08f, -0.6f)
                curveToRelative(-0.19f, -1.58f, -0.35f, -2.57f, -0.93f, -3.15f)
                curveToRelative(-0.57f, -0.57f, -1.56f, -0.72f, -3.13f, -0.91f)
                curveToRelative(-0.19f, -0.02f, -0.41f, -0.05f, -0.62f, -0.08f)
                curveToRelative(3.02f, -2.55f, 6.13f, -2.82f, 7.56f, -2.82f)
                curveToRelative(0.01f, 1.42f, -0.28f, 4.55f, -2.8f, 7.55f)
                close()
            }
        }.also { _Navigation = it}
