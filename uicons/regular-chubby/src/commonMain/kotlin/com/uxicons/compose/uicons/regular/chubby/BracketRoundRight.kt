package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Rc.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, 5.72f, -1.44f, 9.18f, -4.52f, 10.87f)
                curveToRelative(-0.47f, 0.26f, -1.09f, 0.09f, -1.36f, -0.4f)
                curveToRelative(-0.27f, -0.48f, -0.09f, -1.09f, 0.4f, -1.36f)
                curveToRelative(2.41f, -1.32f, 3.48f, -4.13f, 3.48f, -9.12f)
                reflectiveCurveToRelative(-1.08f, -7.81f, -3.5f, -9.13f)
                curveToRelative(-0.48f, -0.26f, -0.67f, -0.87f, -0.4f, -1.36f)
                reflectiveCurveToRelative(0.87f, -0.67f, 1.36f, -0.4f)
                curveToRelative(3.1f, 1.69f, 4.55f, 5.14f, 4.55f, 10.88f)
                close()
            }
        }.also { _BracketRoundRight = it}
