package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Target: ImageVector? = null

val Icons.Ts.Target: ImageVector
    get() = _Target ?: UXIcon(name = "Target") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12.5f, 22.99f)
                verticalLineToRelative(-2.99f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.99f)
                curveToRelative(-5.67f, -0.26f, -10.23f, -4.82f, -10.49f, -10.49f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-1f)
                lineTo(1.01f, 11.5f)
                curveTo(1.27f, 5.83f, 5.83f, 1.27f, 11.5f, 1.01f)
                verticalLineToRelative(2.99f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 1.01f)
                curveToRelative(5.67f, 0.26f, 10.23f, 4.82f, 10.49f, 10.49f)
                horizontalLineToRelative(-2.99f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.99f)
                curveToRelative(-0.26f, 5.67f, -4.82f, 10.23f, -10.49f, 10.49f)
                close()
                moveTo(12.5f, 11.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.also { _Target = it}
