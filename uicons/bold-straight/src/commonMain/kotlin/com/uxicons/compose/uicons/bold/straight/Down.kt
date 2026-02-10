package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Bs.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.88f, 0f, -1.71f, -0.35f, -2.33f, -0.97f)
                horizontalLineToRelative(-0.01f)
                reflectiveCurveTo(-0.01f, 13f, -0.01f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 0f)
                horizontalLineToRelative(10f)
                lineTo(17f, 13f)
                horizontalLineToRelative(7.04f)
                lineToRelative(-9.69f, 10.02f)
                curveToRelative(-0.64f, 0.64f, -1.47f, 0.98f, -2.35f, 0.98f)
                close()
                moveTo(11.8f, 20.92f)
                curveToRelative(0.07f, 0.07f, 0.15f, 0.08f, 0.2f, 0.08f)
                horizontalLineToRelative(0f)
                curveToRelative(0.05f, 0f, 0.13f, -0.01f, 0.21f, -0.09f)
                lineToRelative(4.75f, -4.91f)
                horizontalLineToRelative(-2.96f)
                lineTo(14f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2.95f)
                lineToRelative(4.75f, 4.92f)
                close()
            }
        }.also { _Down = it}
