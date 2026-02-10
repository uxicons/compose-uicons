package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketSquareRight: ImageVector? = null

val Icons.Rc.BracketSquareRight: ImageVector
    get() = _BracketSquareRight ?: UXIcon(name = "BracketSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12f)
                curveToRelative(0f, 4.65f, -0.98f, 9.33f, -1.02f, 9.52f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.77f)
                curveToRelative(-0.07f, 0.02f, -1.76f, 0.4f, -4.09f, 0.7f)
                curveToRelative(-0.54f, 0.07f, -1.05f, -0.31f, -1.12f, -0.86f)
                curveToRelative(-0.07f, -0.55f, 0.32f, -1.05f, 0.86f, -1.12f)
                curveToRelative(1.42f, -0.18f, 2.59f, -0.4f, 3.27f, -0.53f)
                curveToRelative(0.26f, -1.42f, 0.85f, -5.01f, 0.85f, -8.47f)
                reflectiveCurveToRelative(-0.59f, -7.05f, -0.85f, -8.47f)
                curveToRelative(-0.68f, -0.14f, -1.86f, -0.35f, -3.27f, -0.53f)
                curveToRelative(-0.55f, -0.07f, -0.94f, -0.57f, -0.86f, -1.12f)
                reflectiveCurveToRelative(0.58f, -0.94f, 1.12f, -0.86f)
                curveToRelative(2.34f, 0.3f, 4.02f, 0.68f, 4.09f, 0.7f)
                curveToRelative(0.38f, 0.09f, 0.68f, 0.39f, 0.76f, 0.77f)
                curveToRelative(0.04f, 0.2f, 1.02f, 4.87f, 1.02f, 9.53f)
                close()
            }
        }.also { _BracketSquareRight = it}
