package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Total: ImageVector? = null

val Icons.Tc.Total: ImageVector
    get() = _Total ?: UXIcon(name = "Total") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-5.02f, 0f, -8.5f, -1.03f, -8.64f, -1.07f)
                curveToRelative(-0.28f, -0.08f, -0.44f, -0.42f, -0.31f, -0.69f)
                curveToRelative(1.39f, -3.06f, 3.91f, -5.92f, 8.14f, -9.24f)
                curveToRelative(-4.23f, -3.32f, -6.75f, -6.19f, -8.14f, -9.24f)
                curveToRelative(-0.13f, -0.27f, 0.03f, -0.61f, 0.31f, -0.69f)
                curveToRelative(0.15f, -0.04f, 3.63f, -1.07f, 8.64f, -1.07f)
                reflectiveCurveToRelative(8.04f, 1.03f, 8.17f, 1.08f)
                reflectiveCurveToRelative(0.23f, 0.14f, 0.29f, 0.26f)
                curveToRelative(0.02f, 0.04f, 0.52f, 1.1f, 0.55f, 3.16f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.49f, 0.51f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.27f, 0f, -0.5f, -0.22f, -0.5f, -0.49f)
                curveToRelative(-0.02f, -1.34f, -0.26f, -2.19f, -0.38f, -2.55f)
                curveToRelative(-0.76f, -0.23f, -3.52f, -0.95f, -7.62f, -0.95f)
                curveToRelative(-3.71f, 0f, -6.61f, 0.59f, -7.79f, 0.88f)
                curveToRelative(1.43f, 2.83f, 3.95f, 5.54f, 8.09f, 8.72f)
                curveToRelative(0.12f, 0.1f, 0.2f, 0.24f, 0.2f, 0.4f)
                reflectiveCurveToRelative(-0.07f, 0.3f, -0.2f, 0.4f)
                curveToRelative(-4.14f, 3.18f, -6.66f, 5.9f, -8.09f, 8.72f)
                curveToRelative(1.18f, 0.28f, 4.07f, 0.88f, 7.79f, 0.88f)
                curveToRelative(4.1f, 0f, 6.86f, -0.73f, 7.62f, -0.95f)
                curveToRelative(0.12f, -0.36f, 0.36f, -1.21f, 0.38f, -2.55f)
                curveToRelative(0.0f, -0.27f, 0.23f, -0.49f, 0.5f, -0.49f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.23f, 0.49f, 0.51f)
                curveToRelative(-0.03f, 2.05f, -0.53f, 3.11f, -0.55f, 3.16f)
                curveToRelative(-0.06f, 0.12f, -0.16f, 0.21f, -0.29f, 0.26f)
                reflectiveCurveToRelative(-3.14f, 1.08f, -8.17f, 1.08f)
                close()
            }
        }.also { _Total = it}
