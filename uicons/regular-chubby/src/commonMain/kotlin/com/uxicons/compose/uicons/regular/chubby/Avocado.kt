package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Rc.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.39f)
                curveToRelative(-2.73f, 0f, -4.11f, 1.38f, -4.11f, 4.09f)
                curveToRelative(0f, 1.86f, 0.71f, 4.08f, 4.11f, 4.08f)
                curveToRelative(2.73f, 0f, 4.11f, -1.37f, 4.11f, -4.08f)
                reflectiveCurveToRelative(-1.38f, -4.09f, -4.11f, -4.09f)
                close()
                moveTo(12f, 16.56f)
                curveToRelative(-1.59f, 0f, -2.11f, -0.51f, -2.11f, -2.08f)
                curveToRelative(0f, -1.78f, 0.65f, -2.09f, 2.11f, -2.09f)
                reflectiveCurveToRelative(2.11f, 0.3f, 2.11f, 2.09f)
                reflectiveCurveToRelative(-0.65f, 2.08f, -2.11f, 2.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.75f, 14.0f)
                curveToRelative(-0.32f, -1.77f, -0.95f, -2.83f, -1.46f, -3.69f)
                curveToRelative(-0.47f, -0.8f, -0.79f, -1.32f, -0.79f, -2.22f)
                curveToRelative(0f, -4.44f, -2.43f, -7.1f, -6.5f, -7.1f)
                reflectiveCurveToRelative(-6.5f, 2.65f, -6.5f, 7.1f)
                curveToRelative(0f, 0.9f, -0.31f, 1.43f, -0.79f, 2.22f)
                curveToRelative(-0.51f, 0.85f, -1.14f, 1.91f, -1.46f, 3.69f)
                curveToRelative(-0.45f, 2.5f, -0.01f, 4.58f, 1.31f, 6.16f)
                curveToRelative(1.53f, 1.83f, 4.17f, 2.84f, 7.44f, 2.84f)
                reflectiveCurveToRelative(5.91f, -1.01f, 7.44f, -2.84f)
                curveToRelative(1.32f, -1.58f, 1.76f, -3.65f, 1.31f, -6.16f)
                close()
                moveTo(17.9f, 18.88f)
                curveToRelative(-1.14f, 1.37f, -3.24f, 2.12f, -5.9f, 2.12f)
                reflectiveCurveToRelative(-4.76f, -0.75f, -5.9f, -2.12f)
                curveToRelative(-0.93f, -1.11f, -1.22f, -2.63f, -0.88f, -4.52f)
                curveToRelative(0.26f, -1.42f, 0.74f, -2.23f, 1.21f, -3.02f)
                curveToRelative(0.53f, -0.88f, 1.07f, -1.79f, 1.07f, -3.25f)
                curveToRelative(0f, -3.33f, 1.56f, -5.1f, 4.5f, -5.1f)
                reflectiveCurveToRelative(4.5f, 1.76f, 4.5f, 5.1f)
                curveToRelative(0f, 1.45f, 0.54f, 2.36f, 1.07f, 3.25f)
                curveToRelative(0.47f, 0.79f, 0.96f, 1.6f, 1.21f, 3.02f)
                curveToRelative(0.34f, 1.89f, 0.04f, 3.42f, -0.88f, 4.52f)
                close()
            }
        }.also { _Avocado = it}
