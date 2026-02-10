package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Sc.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(4.33f, 0f, 7.61f, -0.47f, 9.35f, -0.8f)
                curveToRelative(-0.84f, 7.74f, -5.28f, 9.2f, -7.53f, 9.93f)
                curveToRelative(-0.33f, 0.1f, -0.76f, 0.25f, -0.93f, 0.34f)
                curveToRelative(-0.17f, 0.32f, -0.51f, 0.52f, -0.88f, 0.52f)
                reflectiveCurveToRelative(-0.71f, -0.2f, -0.88f, -0.52f)
                curveToRelative(-0.17f, -0.1f, -0.61f, -0.24f, -0.93f, -0.34f)
                curveToRelative(-2.25f, -0.73f, -6.69f, -2.19f, -7.53f, -9.93f)
                curveToRelative(1.74f, 0.33f, 5.02f, 0.8f, 9.35f, 0.8f)
                close()
                moveTo(22.97f, 8.76f)
                curveToRelative(-0.69f, -2.83f, -3.01f, -4.95f, -5.91f, -5.39f)
                curveToRelative(-1.13f, -0.17f, -2.34f, -0.26f, -3.56f, -0.31f)
                verticalLineToRelative(-0.56f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.56f)
                curveToRelative(-1.22f, 0.05f, -2.43f, 0.14f, -3.56f, 0.31f)
                curveToRelative(-2.9f, 0.45f, -5.22f, 2.56f, -5.91f, 5.39f)
                curveToRelative(-0.13f, 0.53f, 0.19f, 1.07f, 0.72f, 1.21f)
                curveToRelative(0.16f, 0.04f, 4.08f, 1.03f, 10.25f, 1.03f)
                reflectiveCurveToRelative(10.09f, -0.99f, 10.25f, -1.03f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.67f, 0.72f, -1.21f)
                close()
            }
        }.also { _Acorn = it}
