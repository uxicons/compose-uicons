package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ufo: ImageVector? = null

val Icons.Sc.Ufo: ImageVector
    get() = _Ufo ?: UXIcon(name = "Ufo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.03f, 9.55f)
                curveToRelative(0.13f, -3.77f, 1.98f, -5.56f, 5.97f, -5.55f)
                curveToRelative(4.0f, -0.01f, 5.82f, 1.77f, 5.98f, 5.54f)
                curveToRelative(-0.88f, 0.61f, -2.69f, 1.46f, -5.98f, 1.46f)
                reflectiveCurveToRelative(-5.09f, -0.84f, -5.97f, -1.45f)
                close()
                moveTo(23f, 14f)
                curveToRelative(0f, 4.4f, -5.29f, 5f, -11f, 5f)
                reflectiveCurveToRelative(-11f, -0.6f, -11f, -4.97f)
                curveToRelative(0f, -2.1f, 1.21f, -3.25f, 2.72f, -3.9f)
                curveToRelative(0.37f, 0.51f, 2.42f, 2.88f, 8.28f, 2.88f)
                reflectiveCurveToRelative(7.92f, -2.37f, 8.28f, -2.88f)
                curveToRelative(1.51f, 0.66f, 2.72f, 1.79f, 2.72f, 3.88f)
                close()
                moveTo(6.5f, 14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(13.5f, 16f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Ufo = it}
