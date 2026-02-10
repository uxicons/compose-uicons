package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lasso: ImageVector? = null

val Icons.Rc.Lasso: ImageVector
    get() = _Lasso ?: UXIcon(name = "Lasso") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(7.11f, 1f, 1.49f, 1.9f, 1.49f, 8.88f)
                curveToRelative(0f, 2.15f, 0.55f, 3.87f, 1.65f, 5.13f)
                curveToRelative(-1.09f, 0.88f, -1.65f, 2.19f, -1.65f, 3.94f)
                curveToRelative(0f, 2.79f, 1.41f, 4.49f, 4.19f, 5.03f)
                curveToRelative(0.07f, 0.01f, 0.13f, 0.02f, 0.19f, 0.02f)
                curveToRelative(0.47f, 0f, 0.89f, -0.33f, 0.98f, -0.81f)
                curveToRelative(0.11f, -0.54f, -0.25f, -1.07f, -0.79f, -1.17f)
                curveToRelative(-1.85f, -0.37f, -2.58f, -1.23f, -2.58f, -3.07f)
                curveToRelative(0f, -1.34f, 0.42f, -2.02f, 0.95f, -2.42f)
                curveToRelative(0.06f, 0.2f, 0.14f, 0.39f, 0.24f, 0.58f)
                curveToRelative(0.43f, 0.83f, 1.17f, 1.44f, 2.07f, 1.71f)
                curveToRelative(0.35f, 0.11f, 0.73f, 0.15f, 1.1f, 0.15f)
                curveToRelative(1.61f, 0f, 3.29f, -0.85f, 3.94f, -1.22f)
                horizontalLineToRelative(0.22f)
                curveToRelative(4.89f, 0f, 10.51f, -0.9f, 10.51f, -7.88f)
                reflectiveCurveTo(16.89f, 1f, 12f, 1f)
                close()
                moveTo(7.33f, 15.91f)
                curveToRelative(-0.39f, -0.12f, -0.7f, -0.38f, -0.88f, -0.73f)
                curveToRelative(-0.17f, -0.33f, -0.21f, -0.71f, -0.09f, -1.07f)
                curveToRelative(0.25f, -0.77f, 1.09f, -1.19f, 1.89f, -0.95f)
                curveToRelative(0.73f, 0.23f, 1.47f, 1.25f, 1.96f, 2.16f)
                curveToRelative(-0.89f, 0.41f, -2.11f, 0.82f, -2.87f, 0.58f)
                close()
                moveTo(12.16f, 14.76f)
                curveToRelative(-0.51f, -1.04f, -1.65f, -2.99f, -3.33f, -3.51f)
                curveToRelative(-1.59f, -0.49f, -3.28f, 0.2f, -4.08f, 1.57f)
                curveToRelative(-0.86f, -0.91f, -1.27f, -2.19f, -1.27f, -3.94f)
                curveToRelative(0f, -4.23f, 2.39f, -5.88f, 8.51f, -5.88f)
                reflectiveCurveToRelative(8.51f, 1.65f, 8.51f, 5.88f)
                curveToRelative(0f, 4.2f, -2.35f, 5.85f, -8.36f, 5.88f)
                close()
            }
        }.also { _Lasso = it}
