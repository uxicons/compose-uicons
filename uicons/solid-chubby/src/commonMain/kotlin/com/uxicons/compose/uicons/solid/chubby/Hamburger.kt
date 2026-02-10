package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Sc.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.02f, 18.09f)
                curveToRelative(-0.83f, 1.55f, -2.48f, 2.58f, -4.34f, 2.58f)
                reflectiveCurveToRelative(-3.51f, -1.03f, -4.34f, -2.58f)
                horizontalLineToRelative(-0.51f)
                curveToRelative(-0.37f, 0f, -0.72f, -0.04f, -1.07f, -0.12f)
                curveToRelative(1.61f, 4.13f, 5.93f, 4.67f, 9.24f, 4.67f)
                curveToRelative(3.6f, 0f, 7.73f, -0.58f, 9.26f, -4.67f)
                curveToRelative(-0.35f, 0.08f, -0.71f, 0.12f, -1.09f, 0.12f)
                horizontalLineToRelative(-7.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.17f, 10.48f)
                horizontalLineTo(3.83f)
                curveToRelative(-1.56f, 0f, -2.83f, 1.26f, -2.83f, 2.8f)
                reflectiveCurveToRelative(1.27f, 2.8f, 2.83f, 2.8f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.16f, 1.45f, 1.4f, 2.58f, 2.91f, 2.58f)
                reflectiveCurveToRelative(2.75f, -1.13f, 2.91f, -2.58f)
                horizontalLineToRelative(8.59f)
                curveToRelative(1.56f, 0f, 2.83f, -1.26f, 2.83f, -2.8f)
                reflectiveCurveToRelative(-1.27f, -2.8f, -2.83f, -2.8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.17f, 8.48f)
                curveToRelative(0.41f, 0f, 0.81f, 0.05f, 1.19f, 0.15f)
                curveToRelative(-1.28f, -4.47f, -4.8f, -7.27f, -9.36f, -7.27f)
                reflectiveCurveTo(3.92f, 4.16f, 2.64f, 8.63f)
                curveToRelative(0.38f, -0.1f, 0.78f, -0.15f, 1.19f, -0.15f)
                lineTo(20.17f, 8.48f)
                close()
                moveTo(11.87f, 2.41f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7.91f, 4.38f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _Hamburger = it}
