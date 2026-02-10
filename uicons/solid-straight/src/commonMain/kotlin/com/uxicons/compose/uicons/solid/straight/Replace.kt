package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Replace: ImageVector? = null

val Icons.Ss.Replace: ImageVector
    get() = _Replace ?: UXIcon(name = "Replace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                lineTo(11f, 11f)
                lineTo(0f, 11f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 13f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16.88f, 9.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.29f, -2.29f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(3.29f, 3.29f)
                close()
                moveTo(7.12f, 14.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.29f, 2.29f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                lineTo(1f, 12.99f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(3f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(-3.29f, -3.29f)
                close()
            }
        }.also { _Replace = it}
