package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RightFromBracket: ImageVector? = null

val Icons.Bs.RightFromBracket: ImageVector
    get() = _RightFromBracket ?: UXIcon(name = "RightFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 21f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(5.5f)
                lineTo(9f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(24f, 11.99f)
                curveToRelative(0f, 0.88f, -0.34f, 1.71f, -0.97f, 2.33f)
                lineToRelative(-10.03f, 9.7f)
                verticalLineToRelative(-7.04f)
                lineTo(6f, 16.99f)
                lineTo(6f, 7f)
                horizontalLineToRelative(7f)
                lineTo(13f, -0.03f)
                lineToRelative(10.03f, 9.68f)
                curveToRelative(0.63f, 0.62f, 0.97f, 1.45f, 0.97f, 2.33f)
                close()
                moveTo(21f, 11.99f)
                curveToRelative(0f, -0.05f, -0.01f, -0.13f, -0.08f, -0.2f)
                lineToRelative(-4.92f, -4.75f)
                verticalLineToRelative(2.95f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2.95f)
                lineToRelative(4.93f, -4.77f)
                curveToRelative(0.06f, -0.06f, 0.07f, -0.14f, 0.07f, -0.19f)
                close()
            }
        }.also { _RightFromBracket = it}
