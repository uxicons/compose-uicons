package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LockOpenAlt: ImageVector? = null

val Icons.Rc.LockOpenAlt: ImageVector
    get() = _LockOpenAlt ?: UXIcon(name = "LockOpenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 13.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(23f, 6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.3f, -0.7f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 0.7f, -3f, 3f)
                verticalLineToRelative(2.36f)
                curveToRelative(1.61f, 0.25f, 2.48f, 0.55f, 2.54f, 0.57f)
                curveToRelative(0.28f, 0.1f, 0.5f, 0.32f, 0.6f, 0.59f)
                curveToRelative(0.04f, 0.1f, 0.86f, 2.38f, 0.86f, 5.98f)
                reflectiveCurveToRelative(-0.83f, 5.88f, -0.86f, 5.98f)
                curveToRelative(-0.1f, 0.28f, -0.32f, 0.49f, -0.6f, 0.59f)
                curveToRelative(-0.1f, 0.04f, -2.62f, 0.93f, -7.54f, 0.93f)
                reflectiveCurveToRelative(-7.43f, -0.89f, -7.54f, -0.93f)
                curveToRelative(-0.28f, -0.1f, -0.5f, -0.32f, -0.6f, -0.59f)
                curveToRelative(-0.04f, -0.1f, -0.86f, -2.38f, -0.86f, -5.98f)
                reflectiveCurveToRelative(0.83f, -5.88f, 0.86f, -5.98f)
                curveToRelative(0.1f, -0.28f, 0.32f, -0.49f, 0.6f, -0.59f)
                curveToRelative(0.1f, -0.04f, 2.62f, -0.93f, 7.54f, -0.93f)
                curveToRelative(1.13f, 0f, 2.12f, 0.05f, 3f, 0.12f)
                verticalLineToRelative(-2.12f)
                curveToRelative(0f, -3.41f, 1.59f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.59f, 5f, 5f)
                close()
                moveTo(16.4f, 10.67f)
                curveToRelative(-0.88f, -0.23f, -3.03f, -0.67f, -6.4f, -0.67f)
                reflectiveCurveToRelative(-5.52f, 0.44f, -6.4f, 0.67f)
                curveToRelative(-0.21f, 0.78f, -0.6f, 2.5f, -0.6f, 4.83f)
                reflectiveCurveToRelative(0.38f, 4.05f, 0.6f, 4.83f)
                curveToRelative(0.88f, 0.23f, 3.03f, 0.67f, 6.4f, 0.67f)
                reflectiveCurveToRelative(5.52f, -0.44f, 6.4f, -0.68f)
                curveToRelative(0.21f, -0.78f, 0.6f, -2.5f, 0.6f, -4.83f)
                reflectiveCurveToRelative(-0.38f, -4.05f, -0.6f, -4.83f)
                close()
            }
        }.also { _LockOpenAlt = it}
