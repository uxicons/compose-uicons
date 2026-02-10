package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Tc.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.96f, 7.47f)
                curveToRelative(-0.35f, -4.47f, -2.67f, -6.47f, -7.46f, -6.47f)
                curveToRelative(-5.33f, 0f, -7.5f, 2.17f, -7.5f, 7.5f)
                curveToRelative(0f, 5.98f, 0.5f, 13.95f, 0.5f, 14.03f)
                curveToRelative(0.02f, 0.28f, 0.26f, 0.49f, 0.53f, 0.47f)
                curveToRelative(0.28f, -0.02f, 0.48f, -0.26f, 0.47f, -0.53f)
                curveToRelative(-0.01f, -0.08f, -0.5f, -8.02f, -0.5f, -13.97f)
                curveToRelative(0f, -4.8f, 1.7f, -6.5f, 6.5f, -6.5f)
                curveToRelative(4.29f, 0f, 6.14f, 1.55f, 6.46f, 5.48f)
                curveToRelative(-4.87f, 0.15f, -6.96f, 2.41f, -6.96f, 7.49f)
                curveToRelative(0f, 0.24f, 0.17f, 0.44f, 0.4f, 0.49f)
                curveToRelative(0.09f, 0.02f, 1.79f, 0.35f, 4.63f, 0.49f)
                curveToRelative(0.13f, 1.4f, 0.92f, 2.06f, 2.47f, 2.06f)
                reflectiveCurveToRelative(2.34f, -0.66f, 2.47f, -2.06f)
                curveToRelative(2.84f, -0.14f, 4.54f, -0.47f, 4.63f, -0.49f)
                curveToRelative(0.23f, -0.05f, 0.4f, -0.25f, 0.4f, -0.49f)
                curveToRelative(0f, -5.1f, -2.12f, -7.35f, -7.04f, -7.49f)
                close()
                moveTo(15.5f, 17f)
                curveToRelative(-0.97f, 0f, -1.37f, -0.26f, -1.47f, -1.02f)
                curveToRelative(0.47f, 0.01f, 0.95f, 0.02f, 1.47f, 0.02f)
                reflectiveCurveToRelative(1.0f, -0.01f, 1.47f, -0.02f)
                curveToRelative(-0.1f, 0.77f, -0.5f, 1.02f, -1.47f, 1.02f)
                close()
                moveTo(15.5f, 15f)
                curveToRelative(-3.25f, 0f, -5.59f, -0.31f, -6.5f, -0.46f)
                curveToRelative(0.1f, -4.42f, 1.9f, -6.08f, 6.5f, -6.08f)
                reflectiveCurveToRelative(6.39f, 1.66f, 6.5f, 6.08f)
                curveToRelative(-0.9f, 0.14f, -3.24f, 0.46f, -6.5f, 0.46f)
                close()
            }
        }.also { _LampStreet = it}
