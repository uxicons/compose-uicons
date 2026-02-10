package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pallet: ImageVector? = null

val Icons.Rc.Pallet: ImageVector
    get() = _Pallet ?: UXIcon(name = "Pallet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 13.94f)
                curveToRelative(0.03f, 0.55f, -0.39f, 1.03f, -0.94f, 1.06f)
                curveToRelative(-0.55f, 0.04f, -1.03f, -0.38f, -1.06f, -0.94f)
                curveToRelative(-0.04f, -0.59f, -0.17f, -1.21f, -0.28f, -1.66f)
                curveToRelative(-1.34f, -0.11f, -4.47f, -0.35f, -7.72f, -0.39f)
                verticalLineToRelative(1.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.99f)
                curveToRelative(-3.27f, 0.04f, -6.4f, 0.28f, -7.73f, 0.4f)
                curveToRelative(-0.12f, 0.44f, -0.25f, 1.06f, -0.27f, 1.63f)
                curveToRelative(-0.02f, 0.55f, -0.43f, 0.98f, -1.03f, 0.97f)
                curveToRelative(-0.55f, -0.02f, -0.98f, -0.48f, -0.97f, -1.03f)
                curveToRelative(0.04f, -1.33f, 0.53f, -2.77f, 0.55f, -2.83f)
                curveToRelative(0.13f, -0.37f, 0.46f, -0.63f, 0.85f, -0.67f)
                curveToRelative(0.05f, -0.01f, 4.86f, -0.47f, 9.6f, -0.47f)
                reflectiveCurveToRelative(9.55f, 0.47f, 9.6f, 0.47f)
                curveToRelative(0.4f, 0.04f, 0.73f, 0.31f, 0.85f, 0.69f)
                curveToRelative(0.02f, 0.06f, 0.46f, 1.43f, 0.55f, 2.78f)
                close()
            }
        }.also { _Pallet = it}
