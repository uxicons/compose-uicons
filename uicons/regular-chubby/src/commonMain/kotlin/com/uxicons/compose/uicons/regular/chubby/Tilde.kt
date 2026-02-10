package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tilde: ImageVector? = null

val Icons.Rc.Tilde: ImageVector
    get() = _Tilde ?: UXIcon(name = "Tilde") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 19f)
                curveToRelative(-3.68f, 0f, -4.72f, -3.11f, -5.48f, -5.38f)
                curveToRelative(-0.3f, -0.94f, -0.65f, -1.73f, -0.95f, -2.67f)
                curveToRelative(-0.82f, -2.45f, -1.44f, -3.95f, -3.56f, -3.95f)
                curveToRelative(-3.03f, 0f, -4f, 0.97f, -4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -4.15f, 1.85f, -6f, 6f, -6f)
                curveToRelative(3.67f, 0f, 4.7f, 3.07f, 5.46f, 5.31f)
                curveToRelative(0.3f, 0.94f, 0.65f, 1.73f, 0.95f, 2.67f)
                curveToRelative(0.84f, 2.5f, 1.5f, 4.01f, 3.59f, 4.01f)
                curveToRelative(3.03f, 0f, 4f, -0.97f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 4.15f, -1.85f, 6f, -6f, 6f)
                close()
            }
        }.also { _Tilde = it}
