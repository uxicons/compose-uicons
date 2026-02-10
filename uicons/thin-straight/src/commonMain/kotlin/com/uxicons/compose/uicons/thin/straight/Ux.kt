package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ux: ImageVector? = null

val Icons.Ts.Ux: ImageVector
    get() = _Ux ?: UXIcon(name = "Ux") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 7f)
                lineToRelative(-2.67f, 5f)
                lineToRelative(2.67f, 5f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-2.09f, -3.92f)
                lineToRelative(-2.09f, 3.92f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(2.67f, -5f)
                lineToRelative(-2.67f, -5f)
                horizontalLineToRelative(1.16f)
                lineToRelative(2.09f, 3.92f)
                lineToRelative(2.09f, -3.92f)
                horizontalLineToRelative(1.16f)
                close()
            }
        }.also { _Ux = it}
