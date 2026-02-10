package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cauldron: ImageVector? = null

val Icons.Sc.Cauldron: ImageVector
    get() = _Cauldron ?: UXIcon(name = "Cauldron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(14.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.49f, -0.18f, -0.91f, -0.47f, -1.24f)
                curveToRelative(-1.88f, 1.75f, -4.77f, 2.23f, -8.53f, 2.23f)
                reflectiveCurveToRelative(-6.65f, -0.49f, -8.53f, -2.23f)
                curveToRelative(-0.3f, 0.32f, -0.47f, 0.75f, -0.47f, 1.24f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.11f, 0.46f, -2.13f, 1.24f, -2.83f)
                curveToRelative(-0.81f, -1.47f, -1.24f, -3.46f, -1.24f, -6.17f)
                curveToRelative(0f, -1.69f, 0.5f, -3.33f, 1.48f, -4.89f)
                curveToRelative(-0.24f, -0.04f, -0.47f, -0.09f, -0.67f, -0.13f)
                curveToRelative(-0.54f, -0.11f, -0.9f, -0.63f, -0.79f, -1.17f)
                curveToRelative(0.11f, -0.54f, 0.63f, -0.9f, 1.17f, -0.79f)
                curveToRelative(1.86f, 0.37f, 5.6f, 0.98f, 9.81f, 0.98f)
                reflectiveCurveToRelative(7.95f, -0.61f, 9.81f, -0.98f)
                curveToRelative(0.54f, -0.11f, 1.07f, 0.24f, 1.18f, 0.79f)
                curveToRelative(0.11f, 0.54f, -0.25f, 1.07f, -0.79f, 1.17f)
                curveToRelative(-0.2f, 0.04f, -0.43f, 0.08f, -0.67f, 0.13f)
                curveToRelative(0.98f, 1.56f, 1.48f, 3.2f, 1.48f, 4.89f)
                curveToRelative(0f, 2.71f, -0.43f, 4.7f, -1.24f, 6.17f)
                curveToRelative(0.78f, 0.7f, 1.24f, 1.72f, 1.24f, 2.83f)
                close()
            }
        }.also { _Cauldron = it}
