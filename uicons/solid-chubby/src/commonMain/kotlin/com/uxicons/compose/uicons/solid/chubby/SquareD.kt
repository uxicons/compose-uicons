package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareD: ImageVector? = null

val Icons.Sc.SquareD: ImageVector
    get() = _SquareD ?: UXIcon(name = "SquareD") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, 3.38f, -1.01f, 4f, -3f, 4f)
                curveToRelative(-0.54f, 0f, -1.19f, -0.06f, -1.67f, -0.11f)
                curveToRelative(-0.14f, -0.74f, -0.33f, -2.09f, -0.33f, -3.89f)
                reflectiveCurveToRelative(0.19f, -3.16f, 0.33f, -3.9f)
                curveToRelative(0.48f, -0.05f, 1.14f, -0.1f, 1.67f, -0.1f)
                curveToRelative(1.99f, 0f, 3f, 0.62f, 3f, 4f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.5f, -0.98f, 9.02f, -1.02f, 9.21f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.19f, 0.04f, -4.71f, 1.02f, -9.21f, 1.02f)
                reflectiveCurveToRelative(-9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.04f, -0.19f, -1.02f, -4.71f, -1.02f, -9.21f)
                reflectiveCurveToRelative(0.98f, -9.02f, 1.02f, -9.21f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                reflectiveCurveToRelative(9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, -2.58f, -0.52f, -6f, -5f, -6f)
                curveToRelative(-1.11f, 0f, -2.56f, 0.18f, -2.62f, 0.19f)
                curveToRelative(-0.4f, 0.05f, -0.73f, 0.34f, -0.84f, 0.73f)
                curveToRelative(-0.02f, 0.08f, -0.54f, 1.99f, -0.54f, 5.08f)
                reflectiveCurveToRelative(0.52f, 4.98f, 0.54f, 5.06f)
                curveToRelative(0.11f, 0.38f, 0.43f, 0.67f, 0.82f, 0.72f)
                curveToRelative(0.06f, 0.01f, 1.52f, 0.21f, 2.64f, 0.21f)
                curveToRelative(4.48f, 0f, 5f, -3.42f, 5f, -6f)
                close()
            }
        }.also { _SquareD = it}
