package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Category: ImageVector? = null

val Icons.Ts.Category: ImageVector
    get() = _Category ?: UXIcon(name = "Category") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(10f)
                lineTo(10f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                close()
                moveTo(9f, 9f)
                lineTo(1f, 9f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(8f)
                close()
                moveTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                lineTo(22f, 2.5f)
                close()
                moveTo(21f, 9f)
                horizontalLineToRelative(-8f)
                lineTo(13f, 1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(0f, 19.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-10f)
                lineTo(0f, 12f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(1f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                lineTo(2.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(23.61f, 22.9f)
                lineToRelative(-3.6f, -3.6f)
                curveToRelative(0.62f, -0.77f, 1f, -1.73f, 1f, -2.79f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(1.06f, 0f, 2.02f, -0.38f, 2.79f, -1f)
                lineToRelative(3.6f, 3.6f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(16.5f, 20f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Category = it}
