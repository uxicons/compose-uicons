package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketSquare: ImageVector? = null

val Icons.Sc.BracketSquare: ImageVector
    get() = _BracketSquare ?: UXIcon(name = "BracketSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.99f, 21.68f)
                curveToRelative(-0.1f, 0.83f, -0.87f, 1.41f, -1.67f, 1.31f)
                curveToRelative(-2.36f, -0.29f, -4.06f, -0.66f, -4.13f, -0.67f)
                curveToRelative(-0.57f, -0.12f, -1.02f, -0.57f, -1.15f, -1.14f)
                curveToRelative(-0.04f, -0.19f, -1.04f, -4.69f, -1.04f, -9.18f)
                reflectiveCurveToRelative(0.99f, -8.99f, 1.04f, -9.18f)
                curveToRelative(0.13f, -0.57f, 0.57f, -1.02f, 1.15f, -1.14f)
                curveToRelative(0.07f, -0.01f, 1.78f, -0.38f, 4.13f, -0.67f)
                curveToRelative(0.82f, -0.1f, 1.57f, 0.48f, 1.67f, 1.31f)
                curveToRelative(0.1f, 0.82f, -0.48f, 1.57f, -1.31f, 1.67f)
                curveToRelative(-1.19f, 0.15f, -2.21f, 0.32f, -2.91f, 0.44f)
                curveToRelative(-0.28f, 1.51f, -0.77f, 4.59f, -0.77f, 7.57f)
                reflectiveCurveToRelative(0.49f, 6.06f, 0.77f, 7.57f)
                curveToRelative(0.69f, 0.12f, 1.72f, 0.29f, 2.91f, 0.44f)
                curveToRelative(0.82f, 0.1f, 1.41f, 0.85f, 1.31f, 1.67f)
                close()
            }
        }.also { _BracketSquare = it}
