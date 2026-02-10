package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpFromBracket: ImageVector? = null

val Icons.Bs.UpFromBracket: ImageVector
    get() = _UpFromBracket ?: UXIcon(name = "UpFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                lineTo(3f, 15f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(20.5f, 21f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(7f, 11f)
                lineTo(-0.03f, 11f)
                lineTo(9.66f, 0.97f)
                curveTo(10.28f, 0.34f, 11.11f, 0f, 11.99f, 0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.88f, 0f, 1.71f, 0.34f, 2.33f, 0.97f)
                lineToRelative(9.7f, 10.03f)
                horizontalLineToRelative(-7.04f)
                verticalLineToRelative(7f)
                lineTo(7f, 18f)
                verticalLineToRelative(-7f)
                close()
                moveTo(7.04f, 8f)
                horizontalLineToRelative(2.95f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4.01f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2.95f)
                lineTo(12.18f, 3.07f)
                curveToRelative(-0.06f, -0.06f, -0.14f, -0.07f, -0.19f, -0.07f)
                curveToRelative(-0.05f, 0f, -0.13f, 0.01f, -0.2f, 0.08f)
                lineToRelative(-4.75f, 4.92f)
                close()
            }
        }.also { _UpFromBracket = it}
