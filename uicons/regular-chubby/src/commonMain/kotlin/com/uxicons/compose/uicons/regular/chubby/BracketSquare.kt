package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketSquare: ImageVector? = null

val Icons.Rc.BracketSquare: ImageVector
    get() = _BracketSquare ?: UXIcon(name = "BracketSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.99f, 22.13f)
                curveToRelative(-0.07f, 0.55f, -0.58f, 0.94f, -1.12f, 0.86f)
                curveToRelative(-2.34f, -0.3f, -4.02f, -0.68f, -4.09f, -0.7f)
                curveToRelative(-0.38f, -0.09f, -0.68f, -0.39f, -0.76f, -0.77f)
                curveToRelative(-0.04f, -0.2f, -1.02f, -4.87f, -1.02f, -9.52f)
                reflectiveCurveToRelative(0.98f, -9.33f, 1.02f, -9.53f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.77f)
                curveToRelative(0.07f, -0.02f, 1.76f, -0.4f, 4.09f, -0.7f)
                curveToRelative(0.55f, -0.08f, 1.05f, 0.32f, 1.12f, 0.86f)
                curveToRelative(0.07f, 0.55f, -0.32f, 1.05f, -0.86f, 1.12f)
                curveToRelative(-1.41f, 0.18f, -2.59f, 0.4f, -3.27f, 0.53f)
                curveToRelative(-0.26f, 1.42f, -0.85f, 5.01f, -0.85f, 8.47f)
                reflectiveCurveToRelative(0.59f, 7.05f, 0.85f, 8.47f)
                curveToRelative(0.68f, 0.14f, 1.86f, 0.35f, 3.27f, 0.53f)
                curveToRelative(0.55f, 0.07f, 0.94f, 0.57f, 0.86f, 1.12f)
                close()
            }
        }.also { _BracketSquare = it}
