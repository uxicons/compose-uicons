package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Ss.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.46f)
                lineToRelative(-4f, 2.54f)
                verticalLineToRelative(6.5f)
                lineToRelative(-6f, 6f)
                verticalLineToRelative(6.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(8.14f)
                lineToRelative(5.36f, -4.47f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 2.46f)
                close()
                moveTo(15f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.81f)
                curveToRelative(-1.04f, -1.79f, -2.98f, -3f, -5.19f, -3f)
                curveTo(4.03f, 0f, 1.56f, 2.17f, 1.08f, 5f)
                horizontalLineToRelative(13.92f)
                close()
                moveTo(7f, 12f)
                curveToRelative(2.97f, 0f, 5.44f, -2.17f, 5.92f, -5f)
                lineTo(1.08f, 7f)
                curveToRelative(0.48f, 2.83f, 2.95f, 5f, 5.92f, 5f)
                close()
            }
        }.also { _Guide = it}
