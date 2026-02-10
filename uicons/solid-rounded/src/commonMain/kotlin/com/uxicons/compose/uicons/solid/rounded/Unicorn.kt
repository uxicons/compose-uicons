package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unicorn: ImageVector? = null

val Icons.Sr.Unicorn: ImageVector
    get() = _Unicorn ?: UXIcon(name = "Unicorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.14f, 6.91f)
                curveToRelative(-1.52f, -0.61f, -2.75f, -1.61f, -3.5f, -2.84f)
                lineToRelative(4.09f, -3.38f)
                curveToRelative(0.35f, -0.33f, 0.01f, -0.9f, -0.45f, -0.75f)
                lineToRelative(-4.28f, 1.56f)
                verticalLineToRelative(-0.81f)
                curveToRelative(0f, -0.46f, -0.45f, -0.81f, -0.89f, -0.67f)
                curveToRelative(-1.01f, 0.31f, -1.8f, 1.27f, -2.03f, 2.31f)
                curveToRelative(-2.9f, 0.95f, -3.91f, 3.76f, -4.06f, 5.66f)
                curveToRelative(-0.01f, 0.18f, -0.02f, 1f, -1.02f, 1f)
                reflectiveCurveToRelative(-3.01f, 0.0f, -3.01f, 0.0f)
                curveToRelative(-1.25f, 0f, -2.58f, 0.65f, -3.31f, 1.55f)
                curveToRelative(-2.14f, 0.72f, -4.68f, 2.77f, -4.68f, 8.45f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.79f, 0.68f, -4.73f, 2.0f, -5.81f)
                curveToRelative(0.05f, 1.59f, 0.64f, 3.32f, 1.13f, 4.72f)
                curveToRelative(0.15f, 0.42f, 0.28f, 0.81f, 0.4f, 1.17f)
                lineToRelative(-0.37f, 2.65f)
                curveToRelative(-0.17f, 1.2f, 0.58f, 2.27f, 1.79f, 2.27f)
                curveToRelative(1.37f, 0f, 2.13f, -0.75f, 2.25f, -1.75f)
                lineToRelative(0.4f, -3.25f)
                horizontalLineToRelative(4.38f)
                verticalLineToRelative(2.89f)
                curveToRelative(0f, 1.0f, 0.68f, 1.92f, 1.66f, 2.08f)
                curveToRelative(1.25f, 0.2f, 2.34f, -0.76f, 2.34f, -1.97f)
                verticalLineToRelative(-3.4f)
                lineToRelative(0.39f, -1.81f)
                curveToRelative(0.42f, -1.46f, 0.61f, -2.42f, 0.61f, -3.9f)
                verticalLineToRelative(-1.99f)
                curveToRelative(0f, -0.51f, 0.39f, -0.94f, 0.9f, -0.99f)
                lineToRelative(2.82f, -0.28f)
                curveToRelative(0.73f, -0.07f, 1.28f, -0.69f, 1.28f, -1.42f)
                curveToRelative(0f, -0.57f, -0.34f, -1.09f, -0.86f, -1.3f)
                close()
            }
        }.also { _Unicorn = it}
