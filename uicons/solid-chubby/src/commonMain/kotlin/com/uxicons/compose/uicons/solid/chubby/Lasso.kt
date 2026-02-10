package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lasso: ImageVector? = null

val Icons.Sc.Lasso: ImageVector
    get() = _Lasso ?: UXIcon(name = "Lasso") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(9.14f, 1f, 1.54f, 1f, 1.54f, 9.04f)
                curveToRelative(0f, 1.96f, 0.46f, 3.57f, 1.36f, 4.82f)
                curveToRelative(-0.77f, 0.79f, -1.36f, 1.99f, -1.36f, 3.79f)
                curveToRelative(0f, 2.03f, 0.76f, 4.6f, 4.4f, 5.32f)
                curveToRelative(0.1f, 0.02f, 0.2f, 0.03f, 0.29f, 0.03f)
                curveToRelative(0.7f, 0f, 1.33f, -0.49f, 1.47f, -1.21f)
                curveToRelative(0.16f, -0.81f, -0.37f, -1.6f, -1.18f, -1.76f)
                curveToRelative(-1.48f, -0.29f, -1.98f, -0.9f, -1.98f, -2.38f)
                curveToRelative(0f, -0.88f, 0.19f, -1.39f, 0.52f, -1.72f)
                curveToRelative(0.41f, 0.79f, 1.11f, 1.38f, 1.98f, 1.64f)
                curveToRelative(0.34f, 0.1f, 0.69f, 0.15f, 1.05f, 0.15f)
                curveToRelative(0.97f, 0f, 1.97f, -0.33f, 2.72f, -0.65f)
                curveToRelative(0.56f, 0f, 1.2f, 0f, 1.2f, 0f)
                curveToRelative(2.86f, 0f, 10.46f, 0f, 10.46f, -8.04f)
                reflectiveCurveTo(14.86f, 1f, 12f, 1f)
                close()
                moveTo(11.93f, 14.07f)
                curveToRelative(-0.56f, -1.02f, -1.55f, -2.41f, -2.89f, -2.83f)
                curveToRelative(-1.33f, -0.41f, -2.73f, 0.04f, -3.57f, 1.03f)
                curveToRelative(-0.51f, -0.61f, -0.93f, -1.59f, -0.93f, -3.24f)
                curveToRelative(0f, -3.11f, 1.25f, -5.04f, 7.46f, -5.04f)
                reflectiveCurveToRelative(7.46f, 1.85f, 7.46f, 5.04f)
                curveToRelative(0f, 3.1f, -1.38f, 5.02f, -7.53f, 5.04f)
                close()
            }
        }.also { _Lasso = it}
