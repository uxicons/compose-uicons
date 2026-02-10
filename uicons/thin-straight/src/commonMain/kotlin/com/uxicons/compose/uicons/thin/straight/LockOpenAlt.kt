package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LockOpenAlt: ImageVector? = null

val Icons.Ts.LockOpenAlt: ImageVector
    get() = _LockOpenAlt ?: UXIcon(name = "LockOpenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(16f, 10f)
                lineTo(1f, 10f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-11.5f)
                close()
            }
        }.also { _LockOpenAlt = it}
