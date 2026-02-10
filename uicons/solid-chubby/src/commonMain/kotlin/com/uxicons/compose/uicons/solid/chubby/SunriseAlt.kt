package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunriseAlt: ImageVector? = null

val Icons.Sc.SunriseAlt: ImageVector
    get() = _SunriseAlt ?: UXIcon(name = "SunriseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.39f, 20f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(-0.12f, -1.05f, -0.39f, -1.95f, -0.8f, -2.7f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
                curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
                lineToRelative(-0.69f, 0.69f)
                curveToRelative(-0.75f, -0.41f, -1.64f, -0.67f, -2.68f, -0.8f)
                verticalLineToRelative(-1.31f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.31f)
                curveToRelative(-1.04f, 0.12f, -1.93f, 0.39f, -2.68f, 0.8f)
                lineToRelative(-0.69f, -0.69f)
                curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
                lineToRelative(0.7f, 0.7f)
                curveToRelative(-0.41f, 0.76f, -0.67f, 1.66f, -0.8f, 2.7f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(20.39f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.21f, 7.18f)
                curveToRelative(0.76f, 0.34f, 1.64f, -0.0f, 1.98f, -0.76f)
                curveToRelative(0.09f, -0.2f, 0.2f, -0.39f, 0.31f, -0.57f)
                verticalLineToRelative(2.36f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.36f)
                curveToRelative(0.11f, 0.18f, 0.2f, 0.38f, 0.31f, 0.57f)
                curveToRelative(0.72f, 1.23f, 1.78f, 0.85f, 1.98f, 0.76f)
                curveToRelative(0.76f, -0.34f, 1.1f, -1.22f, 0.76f, -1.98f)
                curveToRelative(-1.18f, -2.66f, -3.76f, -3.99f, -3.87f, -4.04f)
                curveToRelative(-0.43f, -0.22f, -0.93f, -0.22f, -1.35f, 0f)
                curveToRelative(-0.11f, 0.06f, -2.69f, 1.39f, -3.87f, 4.04f)
                curveToRelative(-0.34f, 0.76f, 0.0f, 1.64f, 0.76f, 1.98f)
                close()
            }
        }.also { _SunriseAlt = it}
