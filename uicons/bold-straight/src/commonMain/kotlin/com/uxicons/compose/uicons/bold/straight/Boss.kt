package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boss: ImageVector? = null

val Icons.Bs.Boss: ImageVector
    get() = _Boss ?: UXIcon(name = "Boss") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(24f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 16.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.43f)
                lineToRelative(-0.67f, -2.34f)
                lineToRelative(1.11f, -1.66f)
                horizontalLineToRelative(0.49f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(7f, 16.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.49f)
                lineToRelative(1.11f, 1.66f)
                lineToRelative(-0.67f, 2.34f)
                horizontalLineToRelative(-3.43f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _Boss = it}
