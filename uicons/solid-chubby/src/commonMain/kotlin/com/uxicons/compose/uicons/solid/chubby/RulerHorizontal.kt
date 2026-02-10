package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerHorizontal: ImageVector? = null

val Icons.Sc.RulerHorizontal: ImageVector
    get() = _RulerHorizontal ?: UXIcon(name = "RulerHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.83f, 7.94f)
                curveToRelative(-0.16f, -0.23f, -0.41f, -0.39f, -0.69f, -0.43f)
                curveToRelative(-0.15f, -0.02f, -3.63f, -0.51f, -9.14f, -0.51f)
                reflectiveCurveToRelative(-9.0f, 0.49f, -9.14f, 0.51f)
                curveToRelative(-0.28f, 0.04f, -0.53f, 0.2f, -0.69f, 0.43f)
                curveToRelative(-0.05f, 0.07f, -1.17f, 1.76f, -1.17f, 4.06f)
                curveToRelative(0f, 2.32f, 1.13f, 3.99f, 1.17f, 4.06f)
                curveToRelative(0.16f, 0.23f, 0.41f, 0.39f, 0.69f, 0.43f)
                curveToRelative(0.07f, 0.01f, 0.82f, 0.12f, 2.14f, 0.23f)
                verticalLineToRelative(-3.72f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.86f)
                curveToRelative(0.61f, 0.04f, 1.28f, 0.07f, 2f, 0.09f)
                verticalLineToRelative(-3.95f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.33f, 0.0f, 0.66f, 0.01f, 1f, 0.01f)
                reflectiveCurveToRelative(0.68f, -0.0f, 1f, -0.01f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.95f)
                curveToRelative(0.72f, -0.02f, 1.39f, -0.06f, 2f, -0.09f)
                verticalLineToRelative(-3.86f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.72f)
                curveToRelative(1.32f, -0.11f, 2.08f, -0.22f, 2.14f, -0.23f)
                curveToRelative(0.28f, -0.04f, 0.53f, -0.2f, 0.69f, -0.43f)
                curveToRelative(0.05f, -0.07f, 1.17f, -1.76f, 1.17f, -4.06f)
                curveToRelative(0f, -2.32f, -1.13f, -3.99f, -1.17f, -4.06f)
                close()
            }
        }.also { _RulerHorizontal = it}
