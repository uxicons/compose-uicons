package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownFromBracket: ImageVector? = null

val Icons.Bs.DownFromBracket: ImageVector
    get() = _DownFromBracket ?: UXIcon(name = "DownFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(24.03f, 13f)
                lineToRelative(-9.69f, 10.02f)
                curveToRelative(-0.64f, 0.64f, -1.47f, 0.98f, -2.35f, 0.98f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.88f, 0f, -1.71f, -0.35f, -2.33f, -0.97f)
                lineToRelative(-0.01f, -0.02f)
                lineTo(-0.03f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 6f)
                horizontalLineToRelative(9.99f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7.04f)
                close()
                moveTo(16.95f, 16f)
                horizontalLineToRelative(-2.95f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-4.01f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2.95f)
                lineToRelative(4.75f, 4.92f)
                curveToRelative(0.07f, 0.07f, 0.15f, 0.08f, 0.2f, 0.08f)
                curveToRelative(0.06f, 0f, 0.14f, -0.01f, 0.21f, -0.09f)
                lineToRelative(4.75f, -4.91f)
                close()
            }
        }.also { _DownFromBracket = it}
