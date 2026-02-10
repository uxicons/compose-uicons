package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneRotary: ImageVector? = null

val Icons.Sc.PhoneRotary: ImageVector
    get() = _PhoneRotary ?: UXIcon(name = "PhoneRotary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 0.41f, -0.26f, 0.79f, -0.64f, 0.93f)
                curveToRelative(-0.08f, 0.03f, -0.53f, 0.2f, -1.1f, 0.34f)
                curveToRelative(-0.68f, -3.55f, -2.2f, -6.24f, -2.87f, -7.24f)
                curveToRelative(-0.14f, -0.23f, -0.36f, -0.4f, -0.62f, -0.47f)
                curveToRelative(-0.09f, -0.02f, -2.3f, -0.57f, -5.76f, -0.57f)
                reflectiveCurveToRelative(-5.67f, 0.55f, -5.76f, 0.57f)
                curveToRelative(-0.26f, 0.07f, -0.48f, 0.23f, -0.62f, 0.47f)
                curveToRelative(-0.67f, 0.99f, -2.2f, 3.7f, -2.87f, 7.24f)
                curveToRelative(-0.57f, -0.14f, -1.02f, -0.31f, -1.1f, -0.34f)
                curveToRelative(-0.39f, -0.15f, -0.64f, -0.52f, -0.64f, -0.93f)
                curveToRelative(0.0f, -8.36f, 4.04f, -10f, 11.0f, -10f)
                reflectiveCurveToRelative(11f, 1.64f, 11f, 10f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-1.59f, 0f, -2f, 0.41f, -2f, 2f)
                reflectiveCurveToRelative(0.41f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.41f, 2f, -2f)
                reflectiveCurveToRelative(-0.41f, -2f, -2f, -2f)
                close()
                moveTo(20.0f, 20.03f)
                curveToRelative(0.01f, 0.42f, -0.24f, 0.81f, -0.63f, 0.96f)
                curveToRelative(-0.1f, 0.04f, -2.57f, 1.0f, -7.37f, 1.0f)
                reflectiveCurveToRelative(-7.27f, -0.96f, -7.37f, -1.0f)
                curveToRelative(-0.37f, -0.15f, -0.61f, -0.5f, -0.63f, -0.9f)
                curveToRelative(0.01f, -1.75f, 0.07f, -3.43f, 0.81f, -6.92f)
                curveToRelative(0.7f, -3.11f, 1.78f, -4.92f, 2.3f, -5.75f)
                curveToRelative(0.73f, -0.14f, 2.48f, -0.43f, 4.89f, -0.43f)
                curveToRelative(2.39f, 0f, 4.15f, 0.28f, 4.89f, 0.43f)
                curveToRelative(0.52f, 0.83f, 1.59f, 2.64f, 2.3f, 5.75f)
                curveToRelative(0.77f, 3.54f, 0.81f, 5.52f, 0.81f, 6.86f)
                close()
                moveTo(16f, 15f)
                curveToRelative(0f, -2.69f, -1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                close()
            }
        }.also { _PhoneRotary = it}
