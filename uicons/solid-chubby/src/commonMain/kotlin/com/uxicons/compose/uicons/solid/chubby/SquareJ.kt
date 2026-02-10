package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareJ: ImageVector? = null

val Icons.Sc.SquareJ: ImageVector
    get() = _SquareJ ?: UXIcon(name = "SquareJ") {
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
                moveTo(11.61f, 18f)
                curveToRelative(-2.15f, 0f, -3.48f, -0.88f, -4.06f, -2.7f)
                curveToRelative(-0.17f, -0.53f, 0.12f, -1.09f, 0.65f, -1.26f)
                curveToRelative(0.53f, -0.17f, 1.09f, 0.12f, 1.26f, 0.65f)
                curveToRelative(0.26f, 0.81f, 0.7f, 1.3f, 2.15f, 1.3f)
                curveToRelative(1.31f, 0f, 2.4f, -0.26f, 2.4f, -3.5f)
                curveToRelative(0f, -2.41f, -0.35f, -5.35f, -0.36f, -5.38f)
                curveToRelative(-0.07f, -0.55f, 0.32f, -1.05f, 0.87f, -1.11f)
                curveToRelative(0.55f, -0.07f, 1.05f, 0.32f, 1.11f, 0.87f)
                curveToRelative(0.01f, 0.12f, 0.37f, 3.09f, 0.37f, 5.62f)
                curveToRelative(0f, 1.36f, 0f, 5.5f, -4.4f, 5.5f)
                close()
            }
        }.also { _SquareJ = it}
