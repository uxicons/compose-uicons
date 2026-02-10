package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boot: ImageVector? = null

val Icons.Bs.Boot: ImageVector
    get() = _Boot ?: UXIcon(name = "Boot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.66f, 9.87f)
                lineToRelative(-3.65f, -1.14f)
                verticalLineToRelative(-2.73f)
                reflectiveCurveToRelative(1.0f, 0f, 1.0f, 0f)
                lineTo(16f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.53f)
                curveToRelative(0f, -3.18f, -2.24f, -5.94f, -5.34f, -6.6f)
                close()
                moveTo(4f, 19f)
                lineTo(4f, 6f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2f)
                reflectiveCurveToRelative(-3.0f, 0f, -3.0f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.19f)
                lineToRelative(5.79f, 1.79f)
                curveToRelative(1.75f, 0.35f, 3.02f, 1.9f, 3.02f, 3.68f)
                verticalLineToRelative(2.53f)
                lineTo(4f, 19f)
                close()
            }
        }.also { _Boot = it}
