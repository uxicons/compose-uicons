package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireExtinguisher: ImageVector? = null

val Icons.Ss.FireExtinguisher: ImageVector
    get() = _FireExtinguisher ?: UXIcon(name = "FireExtinguisher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2.09f)
                curveToRelative(2.83f, 0.48f, 5f, 2.94f, 5f, 5.91f)
                verticalLineToRelative(11f)
                lineTo(0f, 24f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.97f, 2.17f, -5.43f, 5f, -5.91f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-1.41f, 0.16f, -2.76f, 0.62f, -3.95f, 1.41f)
                lineTo(-0.05f, 4.81f)
                curveToRelative(1.52f, -1.0f, 3.25f, -1.6f, 5.05f, -1.76f)
                lineTo(5f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 2.73f)
                verticalLineToRelative(2.54f)
                lineToRelative(9f, 2.7f)
                lineTo(24f, 0.03f)
                lineToRelative(-9f, 2.7f)
                close()
            }
        }.also { _FireExtinguisher = it}
