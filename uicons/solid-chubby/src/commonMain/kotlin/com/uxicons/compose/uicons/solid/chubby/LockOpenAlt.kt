package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LockOpenAlt: ImageVector? = null

val Icons.Sc.LockOpenAlt: ImageVector
    get() = _LockOpenAlt ?: UXIcon(name = "LockOpenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 1f)
                curveToRelative(-3.7f, 0f, -5.5f, 1.8f, -5.5f, 5.5f)
                verticalLineToRelative(1.56f)
                curveToRelative(-0.62f, -0.03f, -1.28f, -0.06f, -2f, -0.06f)
                curveToRelative(-4.92f, 0f, -7.43f, 0.89f, -7.54f, 0.93f)
                curveToRelative(-0.28f, 0.1f, -0.5f, 0.32f, -0.6f, 0.59f)
                curveToRelative(-0.04f, 0.1f, -0.86f, 2.38f, -0.86f, 5.98f)
                reflectiveCurveToRelative(0.83f, 5.88f, 0.86f, 5.98f)
                curveToRelative(0.1f, 0.28f, 0.32f, 0.49f, 0.6f, 0.59f)
                curveToRelative(0.1f, 0.04f, 2.62f, 0.93f, 7.54f, 0.93f)
                reflectiveCurveToRelative(7.43f, -0.89f, 7.54f, -0.93f)
                curveToRelative(0.28f, -0.1f, 0.5f, -0.32f, 0.6f, -0.59f)
                curveToRelative(0.04f, -0.1f, 0.86f, -2.38f, 0.86f, -5.98f)
                reflectiveCurveToRelative(-0.83f, -5.88f, -0.86f, -5.98f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.49f, -0.6f, -0.59f)
                curveToRelative(-0.06f, -0.02f, -0.93f, -0.32f, -2.54f, -0.57f)
                verticalLineToRelative(-1.86f)
                curveToRelative(0f, -2.03f, 0.47f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 0.47f, 2.5f, 2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -3.7f, -1.8f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(11f, 16.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _LockOpenAlt = it}
