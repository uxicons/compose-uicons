package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareC: ImageVector? = null

val Icons.Sc.SquareC: ImageVector
    get() = _SquareC ?: UXIcon(name = "SquareC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 2.79f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.19f, -0.04f, -4.71f, -1.02f, -9.21f, -1.02f)
                reflectiveCurveToRelative(-9.02f, 0.98f, -9.21f, 1.02f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.04f, 0.19f, -1.02f, 4.71f, -1.02f, 9.21f)
                reflectiveCurveToRelative(0.98f, 9.02f, 1.02f, 9.21f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.19f, 0.04f, 4.71f, 1.02f, 9.21f, 1.02f)
                reflectiveCurveToRelative(9.02f, -0.98f, 9.21f, -1.02f)
                curveToRelative(0.38f, -0.08f, 0.68f, -0.38f, 0.76f, -0.76f)
                curveToRelative(0.04f, -0.19f, 1.02f, -4.71f, 1.02f, -9.21f)
                reflectiveCurveToRelative(-0.98f, -9.02f, -1.02f, -9.21f)
                close()
                moveTo(12f, 16f)
                curveToRelative(0.87f, 0f, 1.5f, -0.15f, 1.93f, -0.45f)
                curveToRelative(0.46f, -0.32f, 1.08f, -0.2f, 1.39f, 0.25f)
                curveToRelative(0.32f, 0.45f, 0.2f, 1.08f, -0.25f, 1.39f)
                curveToRelative(-0.78f, 0.54f, -1.78f, 0.81f, -3.07f, 0.81f)
                curveToRelative(-4.48f, 0f, -5f, -3.42f, -5f, -6f)
                reflectiveCurveToRelative(0.52f, -6f, 5f, -6f)
                curveToRelative(1.29f, 0f, 2.29f, 0.26f, 3.07f, 0.81f)
                curveToRelative(0.45f, 0.32f, 0.56f, 0.94f, 0.25f, 1.39f)
                reflectiveCurveToRelative(-0.94f, 0.56f, -1.39f, 0.25f)
                curveToRelative(-0.43f, -0.3f, -1.06f, -0.45f, -1.93f, -0.45f)
                curveToRelative(-1.99f, 0f, -3f, 0.62f, -3f, 4f)
                reflectiveCurveToRelative(1.01f, 4f, 3f, 4f)
                close()
            }
        }.also { _SquareC = it}
