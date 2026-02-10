package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Bs.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 24f)
                lineTo(7f, 24f)
                lineTo(7f, 11f)
                lineTo(-0.01f, 11f)
                lineTo(9.67f, 0.97f)
                curveTo(10.29f, 0.35f, 11.12f, 0f, 12f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.88f, 0f, 1.71f, 0.34f, 2.33f, 0.97f)
                lineToRelative(9.7f, 10.03f)
                horizontalLineToRelative(-7.04f)
                verticalLineToRelative(13f)
                close()
                moveTo(10f, 21f)
                horizontalLineToRelative(4f)
                lineTo(14f, 8f)
                horizontalLineToRelative(2.96f)
                lineTo(12.19f, 3.07f)
                curveToRelative(-0.06f, -0.06f, -0.14f, -0.07f, -0.19f, -0.07f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.05f, 0f, -0.13f, 0.01f, -0.2f, 0.08f)
                lineToRelative(-4.75f, 4.92f)
                horizontalLineToRelative(2.95f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Up = it}
