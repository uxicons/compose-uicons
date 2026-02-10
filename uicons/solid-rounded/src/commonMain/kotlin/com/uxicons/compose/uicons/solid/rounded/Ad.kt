package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Sr.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.5f)
                curveToRelative(-0.04f, 1.97f, -2.96f, 1.97f, -3f, 0f)
                curveToRelative(0.04f, -1.97f, 2.96f, -1.97f, 3f, 0f)
                close()
                moveTo(6.94f, 14f)
                horizontalLineToRelative(2.11f)
                lineToRelative(-1.06f, -3.52f)
                lineToRelative(-1.06f, 3.52f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(11.96f, 16.71f)
                lineToRelative(-3f, -10f)
                curveToRelative(-0.25f, -0.93f, -1.67f, -0.93f, -1.92f, 0f)
                lineToRelative(-3f, 10f)
                curveToRelative(-0.37f, 1.25f, 1.53f, 1.83f, 1.92f, 0.57f)
                lineToRelative(0.39f, -1.29f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.39f, 1.29f)
                curveToRelative(0.16f, 0.53f, 0.73f, 0.83f, 1.25f, 0.67f)
                curveToRelative(0.53f, -0.16f, 0.83f, -0.72f, 0.67f, -1.25f)
                close()
                moveTo(20f, 7f)
                curveToRelative(-0.01f, -1.31f, -1.99f, -1.31f, -2f, 0f)
                verticalLineToRelative(4.35f)
                curveToRelative(-2.22f, -1.15f, -5.06f, 0.64f, -5f, 3.15f)
                curveToRelative(-0.07f, 2.6f, 2.97f, 4.38f, 5.19f, 3.05f)
                curveToRelative(0.49f, 0.82f, 1.85f, 0.41f, 1.81f, -0.55f)
                lineTo(20f, 7f)
                close()
            }
        }.also { _Ad = it}
