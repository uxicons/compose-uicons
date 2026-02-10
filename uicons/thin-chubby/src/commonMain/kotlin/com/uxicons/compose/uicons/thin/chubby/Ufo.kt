package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ufo: ImageVector? = null

val Icons.Tc.Ufo: ImageVector
    get() = _Ufo ?: UXIcon(name = "Ufo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 15f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(6f, 13.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
                moveTo(18f, 13.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
                moveTo(23f, 14.13f)
                curveToRelative(0f, 3.21f, -4.4f, 3.87f, -11f, 3.87f)
                reflectiveCurveToRelative(-11f, -0.66f, -11f, -3.87f)
                curveToRelative(0f, -2.46f, 2.59f, -3.21f, 5.01f, -3.54f)
                curveToRelative(0.11f, -3.96f, 1.87f, -5.59f, 5.99f, -5.59f)
                curveToRelative(4.15f, 0f, 5.9f, 1.63f, 5.99f, 5.59f)
                curveToRelative(2.42f, 0.34f, 5.01f, 1.09f, 5.01f, 3.54f)
                close()
                moveTo(7f, 11.17f)
                curveToRelative(0.49f, 0.26f, 1.93f, 0.83f, 5.02f, 0.83f)
                curveToRelative(3.01f, 0f, 4.43f, -0.59f, 4.98f, -0.92f)
                curveToRelative(0.06f, -3.65f, -1.23f, -5.12f, -5f, -5.08f)
                curveToRelative(-3.82f, -0.04f, -5.06f, 1.41f, -5f, 5.17f)
                close()
                moveTo(22f, 14.13f)
                curveToRelative(0f, -0.91f, -0.48f, -2.01f, -4.07f, -2.54f)
                curveToRelative(0f, 0f, -1.39f, 1.41f, -5.91f, 1.41f)
                reflectiveCurveToRelative(-5.99f, -1.4f, -5.99f, -1.4f)
                curveToRelative(-3.56f, 0.53f, -4.03f, 1.62f, -4.03f, 2.53f)
                curveToRelative(0f, 2.01f, 2.99f, 2.87f, 10f, 2.87f)
                reflectiveCurveToRelative(10f, -0.86f, 10f, -2.87f)
                close()
            }
        }.also { _Ufo = it}
