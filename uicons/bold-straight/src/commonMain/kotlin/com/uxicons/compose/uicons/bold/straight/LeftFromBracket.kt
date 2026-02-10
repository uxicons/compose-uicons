package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeftFromBracket: ImageVector? = null

val Icons.Bs.LeftFromBracket: ImageVector
    get() = _LeftFromBracket ?: UXIcon(name = "LeftFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7.01f)
                horizontalLineToRelative(-7f)
                lineTo(11f, -0.03f)
                lineTo(0.97f, 9.68f)
                curveTo(0.34f, 10.3f, 0f, 11.13f, 0f, 12.01f)
                curveToRelative(0f, 0.88f, 0.35f, 1.71f, 0.97f, 2.33f)
                lineToRelative(10.03f, 9.68f)
                verticalLineToRelative(-7.03f)
                horizontalLineToRelative(7f)
                lineTo(18f, 7.01f)
                close()
                moveTo(15f, 14.01f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2.95f)
                lineTo(3.08f, 12.21f)
                curveToRelative(-0.07f, -0.07f, -0.08f, -0.15f, -0.08f, -0.2f)
                curveToRelative(0f, -0.06f, 0.01f, -0.14f, 0.07f, -0.19f)
                lineToRelative(4.93f, -4.77f)
                verticalLineToRelative(2.95f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4.01f)
                close()
                moveTo(24f, 3.5f)
                lineTo(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(15f, 0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _LeftFromBracket = it}
