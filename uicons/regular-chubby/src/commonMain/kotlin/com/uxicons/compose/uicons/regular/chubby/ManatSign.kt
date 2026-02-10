package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManatSign: ImageVector? = null

val Icons.Rc.ManatSign: ImageVector
    get() = _ManatSign ?: UXIcon(name = "ManatSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 15f)
                curveToRelative(0f, 0.15f, -0.01f, 3.61f, -0.51f, 7.14f)
                curveToRelative(-0.07f, 0.5f, -0.5f, 0.86f, -0.99f, 0.86f)
                curveToRelative(-0.6f, 0.01f, -1.08f, -0.55f, -0.99f, -1.14f)
                curveToRelative(0.48f, -3.38f, 0.49f, -6.82f, 0.49f, -6.86f)
                curveToRelative(0f, -6.21f, -2.19f, -8.73f, -8f, -8.97f)
                verticalLineToRelative(15.97f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-15.97f)
                curveToRelative(-5.8f, 0.25f, -8f, 2.76f, -8f, 8.97f)
                curveToRelative(0f, 0.03f, 0.01f, 3.47f, 0.49f, 6.86f)
                curveToRelative(0.08f, 0.55f, -0.3f, 1.05f, -0.85f, 1.13f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                curveToRelative(-0.5f, -3.53f, -0.51f, -7.0f, -0.51f, -7.14f)
                curveToRelative(-0.0f, -7.36f, 3.01f, -10.69f, 10.0f, -10.97f)
                verticalLineToRelative(-2.03f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.03f)
                curveToRelative(6.99f, 0.28f, 10f, 3.61f, 10f, 10.97f)
                close()
            }
        }.also { _ManatSign = it}
