package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sigma: ImageVector? = null

val Icons.Br.Sigma: ImageVector
    get() = _Sigma ?: UXIcon(name = "Sigma") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 24f)
            horizontalLineTo(5.29f)
            curveToRelative(-1.32f, 0f, -2.47f, -0.75f, -3.0f, -1.95f)
            curveToRelative(-0.53f, -1.2f, -0.32f, -2.56f, 0.57f, -3.53f)
            curveToRelative(0.04f, -0.04f, 7.38f, -6.39f, 7.38f, -6.39f)
            lineTo(2.56f, 5.74f)
            curveToRelative(-0.17f, -0.14f, -0.3f, -0.32f, -0.4f, -0.51f)
            curveToRelative(-0.53f, -1.13f, -0.43f, -2.51f, 0.27f, -3.61f)
            curveToRelative(0.65f, -1.02f, 1.69f, -1.61f, 2.86f, -1.61f)
            horizontalLineToRelative(12.21f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(5.29f)
            curveToRelative(-0.05f, 0f, -0.19f, 0f, -0.33f, 0.21f)
            curveToRelative(-0.1f, 0.15f, -0.14f, 0.34f, -0.14f, 0.5f)
            lineToRelative(8.69f, 7.23f)
            curveToRelative(0.34f, 0.28f, 0.54f, 0.7f, 0.54f, 1.14f)
            curveToRelative(0.0f, 0.44f, -0.19f, 0.86f, -0.52f, 1.15f)
            lineToRelative(-8.49f, 7.34f)
            curveToRelative(-0.03f, 0.05f, -0.07f, 0.14f, -0.01f, 0.26f)
            curveToRelative(0.07f, 0.17f, 0.21f, 0.17f, 0.26f, 0.17f)
            horizontalLineToRelative(12.21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            close()
        }
    }.also { _Sigma = it }
