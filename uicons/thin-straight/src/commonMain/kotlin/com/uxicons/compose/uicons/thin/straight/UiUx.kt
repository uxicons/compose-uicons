package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UiUx: ImageVector? = null

val Icons.Ts.UiUx: ImageVector
    get() = _UiUx ?: UXIcon(name = "UiUx") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(0f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(24f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9f)
                close()
                moveTo(13f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(14.66f, 9f)
                lineToRelative(2.09f, -3.52f)
                lineToRelative(2.09f, 3.52f)
                horizontalLineToRelative(1.16f)
                lineToRelative(-2.67f, -4.5f)
                lineToRelative(2.67f, -4.5f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-2.09f, 3.52f)
                lineToRelative(-2.09f, -3.52f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(2.67f, 4.5f)
                lineToRelative(-2.67f, 4.5f)
                horizontalLineToRelative(1.16f)
                close()
            }
        }.also { _UiUx = it}
