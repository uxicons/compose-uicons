package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBulk: ImageVector? = null

val Icons.Sr.EnvelopeBulk: ImageVector
    get() = _EnvelopeBulk ?: UXIcon(name = "EnvelopeBulk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 10f)
                lineTo(3f, 10f)
                lineTo(3f, 4f)
                curveTo(3f, 1.79f, 4.79f, 0f, 7f, 0f)
                lineTo(15f, 0f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(21f, 10f)
                curveToRelative(-0.01f, -1.31f, -1.99f, -1.31f, -2f, 0f)
                curveToRelative(0.01f, 1.31f, 1.99f, 1.31f, 2f, 0f)
                close()
                moveTo(9.0f, 18.59f)
                lineToRelative(5.91f, -5.91f)
                curveToRelative(-0.52f, -0.43f, -1.18f, -0.68f, -1.9f, -0.68f)
                lineTo(3f, 12f)
                curveToRelative(-0.72f, 0f, -1.38f, 0.25f, -1.89f, 0.68f)
                lineToRelative(5.92f, 5.92f)
                curveToRelative(0.53f, 0.53f, 1.45f, 0.53f, 1.98f, 0f)
                close()
                moveTo(10.41f, 20.0f)
                curveToRelative(-0.79f, 0.79f, -1.9f, 1.14f, -3.04f, 0.94f)
                curveToRelative(-0.71f, -0.13f, -1.34f, -0.52f, -1.85f, -1.03f)
                lineTo(0f, 14.4f)
                verticalLineToRelative(5.6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                lineTo(12f, 24f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-5.52f)
                lineToRelative(-0.05f, -0.02f)
                lineToRelative(-5.54f, 5.54f)
                close()
            }
        }.also { _EnvelopeBulk = it}
