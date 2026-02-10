package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugTeaSaucer: ImageVector? = null

val Icons.Ts.MugTeaSaucer: ImageVector
    get() = _MugTeaSaucer ?: UXIcon(name = "MugTeaSaucer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                lineTo(2.04f, 2f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11.96f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(11.0f, 9.25f)
                lineToRelative(-0.0f, 2.79f)
                horizontalLineToRelative(-3f)
                lineToRelative(0.0f, -2.79f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.5f, 1.5f)
                close()
                moveTo(18f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.54f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(3.04f, 3f)
                horizontalLineToRelative(5.96f)
                verticalLineToRelative(3.83f)
                reflectiveCurveToRelative(-2.0f, 2f, -2.0f, 2f)
                lineToRelative(-0.0f, 4.21f)
                horizontalLineToRelative(5f)
                lineToRelative(0.0f, -4.21f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-3.83f)
                reflectiveCurveToRelative(8.0f, 0f, 8.0f, 0f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(23f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(0.01f, 21f)
                horizontalLineToRelative(20.99f)
                verticalLineToRelative(1f)
                lineTo(0.01f, 22f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _MugTeaSaucer = it}
