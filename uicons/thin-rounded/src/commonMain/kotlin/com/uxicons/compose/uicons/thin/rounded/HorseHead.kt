package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Tr.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(23.98f, 17.18f)
                curveToRelative(-0.1f, -1.13f, -0.68f, -2.19f, -1.59f, -2.91f)
                curveToRelative(-2.75f, -2.16f, -3.86f, -4.38f, -4.92f, -6.53f)
                curveToRelative(-0.71f, -1.43f, -1.38f, -2.78f, -2.46f, -3.97f)
                curveToRelative(0f, 0f, 0.01f, -1.88f, 0.01f, -2.88f)
                reflectiveCurveTo(14.15f, -0.02f, 14.01f, 0.02f)
                curveToRelative(-1.43f, 0.38f, -2.58f, 1.64f, -2.91f, 3.1f)
                horizontalLineToRelative(0f)
                curveTo(4.15f, 3.93f, 0f, 8.93f, 0f, 16.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -7.01f, 3.82f, -11.64f, 10.21f, -12.39f)
                curveToRelative(0.54f, -0.03f, 0.79f, -0.33f, 0.86f, -0.77f)
                curveToRelative(0.23f, -1.0f, 0.98f, -1.93f, 1.93f, -2.27f)
                lineToRelative(-0.01f, 3.09f)
                lineToRelative(0.26f, 0.29f)
                curveToRelative(0.99f, 1.09f, 1.63f, 2.38f, 2.31f, 3.75f)
                curveToRelative(1.12f, 2.25f, 2.27f, 4.57f, 5.2f, 6.87f)
                curveToRelative(0.69f, 0.55f, 1.14f, 1.35f, 1.22f, 2.21f)
                curveToRelative(0.08f, 0.85f, -0.2f, 1.71f, -0.77f, 2.35f)
                curveToRelative(-0.71f, 0.8f, -1.89f, 0.97f, -2.79f, 0.41f)
                lineToRelative(-5.15f, -3.21f)
                curveToRelative(-1.03f, -0.64f, -2.27f, 0.43f, -1.78f, 1.54f)
                lineToRelative(0.47f, 1.08f)
                curveToRelative(0.56f, 1.28f, 1.16f, 2.47f, 1.78f, 3.54f)
                lineToRelative(0.41f, 0.75f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.26f, 0.44f, 0.26f)
                curveToRelative(0.38f, 0f, 0.62f, -0.41f, 0.44f, -0.74f)
                lineToRelative(-0.42f, -0.77f)
                curveToRelative(-0.61f, -1.04f, -1.19f, -2.2f, -1.73f, -3.44f)
                lineToRelative(-0.45f, -1.03f)
                curveToRelative(-0.1f, -0.23f, 0.15f, -0.44f, 0.36f, -0.31f)
                lineToRelative(5.1f, 3.18f)
                curveToRelative(1.32f, 0.82f, 3.04f, 0.57f, 4.07f, -0.6f)
                curveToRelative(0.75f, -0.84f, 1.12f, -1.98f, 1.02f, -3.1f)
                close()
            }
        }.also { _HorseHead = it}
