package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Sc.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.24f, 5.35f)
                curveToRelative(-0.92f, 0.51f, -1.84f, 1.07f, -2.76f, 1.69f)
                curveToRelative(-0.24f, 0.17f, -0.4f, 0.43f, -0.43f, 0.72f)
                curveToRelative(-0.03f, 0.28f, -0.7f, 6.89f, 3.8f, 11.39f)
                curveToRelative(3.41f, 3.41f, 8.04f, 3.85f, 10.2f, 3.85f)
                curveToRelative(0.69f, 0f, 1.13f, -0.04f, 1.19f, -0.05f)
                curveToRelative(0.29f, -0.03f, 0.55f, -0.19f, 0.72f, -0.43f)
                curveToRelative(0.63f, -0.92f, 1.19f, -1.85f, 1.7f, -2.76f)
                curveToRelative(-2.32f, -0.03f, -6.96f, -0.55f, -10.41f, -4f)
                curveToRelative(-3.45f, -3.45f, -3.98f, -8.09f, -4.0f, -10.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 1.96f)
                curveToRelative(-0.04f, -0.48f, -0.42f, -0.86f, -0.9f, -0.9f)
                curveToRelative(-0.35f, -0.03f, -7.48f, -0.65f, -15.78f, 3.26f)
                curveToRelative(-0.07f, 1.04f, -0.22f, 6.42f, 3.39f, 10.03f)
                curveToRelative(3.62f, 3.62f, 8.99f, 3.46f, 10.03f, 3.39f)
                curveToRelative(3.9f, -8.29f, 3.29f, -15.42f, 3.26f, -15.77f)
                close()
                moveTo(11.66f, 11.03f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.48f, 11.98f)
                curveToRelative(-0.83f, 0.13f, -1.7f, -0.12f, -2.34f, -0.76f)
                curveToRelative(-1.06f, -1.06f, -1.06f, -2.77f, -0.0f, -3.83f)
                curveToRelative(0.95f, -0.95f, 2.45f, -1.04f, 3.51f, -0.27f)
                curveToRelative(-0.24f, 1.46f, -0.61f, 3.1f, -1.16f, 4.86f)
                close()
            }
        }.also { _PizzaSlice = it}
