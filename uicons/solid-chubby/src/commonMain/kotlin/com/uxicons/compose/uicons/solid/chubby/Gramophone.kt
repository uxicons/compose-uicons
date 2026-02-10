package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gramophone: ImageVector? = null

val Icons.Sc.Gramophone: ImageVector
    get() = _Gramophone ?: UXIcon(name = "Gramophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 20.5f)
                curveToRelative(0f, 0.42f, -0.04f, 0.82f, -0.13f, 1.24f)
                reflectiveCurveToRelative(-0.44f, 0.73f, -0.86f, 0.78f)
                curveToRelative(-1.2f, 0.14f, -4.58f, 0.48f, -10.01f, 0.48f)
                reflectiveCurveToRelative(-8.81f, -0.33f, -10.01f, -0.48f)
                curveToRelative(-0.42f, -0.05f, -0.77f, -0.36f, -0.86f, -0.78f)
                reflectiveCurveToRelative(-0.13f, -0.82f, -0.13f, -1.24f)
                curveToRelative(0.01f, -1.67f, 1.27f, -3.02f, 2.93f, -3.18f)
                curveToRelative(1.59f, -0.15f, 4.27f, -0.32f, 8.07f, -0.32f)
                curveToRelative(0.71f, 0f, 1.37f, 0.01f, 2.0f, 0.02f)
                curveToRelative(0f, -0.01f, -0.0f, -0.01f, -0.0f, -0.02f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.99f, 1.51f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.95f, 0f, 1f, -0.05f, 1f, -1f)
                reflectiveCurveToRelative(-0.05f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.27f)
                curveToRelative(-4.55f, 1.4f, -10.24f, 5.27f, -10.31f, 5.31f)
                curveToRelative(-0.51f, 0.36f, -1.28f, 0.13f, -1.5f, -0.46f)
                curveToRelative(-0.09f, -0.23f, -0.91f, -2.4f, -0.92f, -6.36f)
                curveToRelative(0.01f, -3.97f, 0.83f, -6.14f, 0.92f, -6.37f)
                curveToRelative(0.21f, -0.56f, 0.94f, -0.81f, 1.45f, -0.48f)
                curveToRelative(2.11f, 1.29f, 7.28f, 4.2f, 10.78f, 5.37f)
                horizontalLineToRelative(2.85f)
                curveToRelative(2.62f, 0f, 4f, 1.38f, 4f, 4f)
                reflectiveCurveToRelative(-1.38f, 4f, -4f, 4f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.32f, 0f, -1.5f, 0.18f, -1.5f, 1.5f)
                curveToRelative(0f, 0.07f, 0.01f, 1.08f, -0.01f, 1.11f)
                curveToRelative(1.28f, 0.06f, 2.31f, 0.14f, 3.08f, 0.21f)
                curveToRelative(1.66f, 0.16f, 2.92f, 1.55f, 2.93f, 3.18f)
                close()
            }
        }.also { _Gramophone = it}
