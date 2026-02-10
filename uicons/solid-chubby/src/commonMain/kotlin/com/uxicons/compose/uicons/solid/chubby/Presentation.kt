package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Presentation: ImageVector? = null

val Icons.Sc.Presentation: ImageVector
    get() = _Presentation ?: UXIcon(name = "Presentation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 13.72f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(1.1f)
                curveToRelative(-0.67f, 0.04f, -1.34f, 0.12f, -2.0f, 0.22f)
                curveToRelative(-0.56f, 0.09f, -1.03f, 0.49f, -1.2f, 1.03f)
                lineToRelative(-0.07f, 0.21f)
                curveToRelative(-0.23f, 0.73f, -0.38f, 1.22f, -0.36f, 2.22f)
                curveToRelative(0.02f, 0.83f, 0.74f, 1.5f, 1.53f, 1.47f)
                curveToRelative(0.83f, -0.02f, 1.48f, -0.71f, 1.47f, -1.53f)
                curveToRelative(-0.01f, -0.23f, 0f, -0.39f, 0.03f, -0.55f)
                curveToRelative(1.4f, -0.15f, 2.81f, -0.15f, 4.2f, 0f)
                curveToRelative(0.03f, 0.16f, 0.03f, 0.31f, 0.03f, 0.55f)
                curveToRelative(-0.02f, 0.83f, 0.64f, 1.51f, 1.47f, 1.53f)
                curveToRelative(0.01f, 0f, 0.02f, 0f, 0.04f, 0f)
                curveToRelative(0.81f, 0f, 1.48f, -0.65f, 1.5f, -1.47f)
                curveToRelative(0.02f, -1f, -0.13f, -1.48f, -0.36f, -2.22f)
                lineToRelative(-0.07f, -0.21f)
                curveToRelative(-0.17f, -0.55f, -0.64f, -0.95f, -1.2f, -1.03f)
                curveToRelative(-0.67f, -0.1f, -1.33f, -0.18f, -2.0f, -0.22f)
                verticalLineToRelative(-1.1f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.96f, 11.72f)
                curveToRelative(0.39f, -2.64f, 0.27f, -5.29f, -0.35f, -7.92f)
                curveToRelative(-0.28f, -1.21f, -1.27f, -2.12f, -2.46f, -2.28f)
                curveToRelative(-4.74f, -0.64f, -9.55f, -0.64f, -14.29f, 0f)
                curveToRelative(-1.19f, 0.16f, -2.18f, 1.08f, -2.46f, 2.28f)
                curveToRelative(-0.62f, 2.63f, -0.74f, 5.28f, -0.35f, 7.92f)
                horizontalLineTo(21.96f)
                close()
            }
        }.also { _Presentation = it}
