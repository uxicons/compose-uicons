package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUp: ImageVector? = null

val Icons.Sr.ChartLineUp: ImageVector
    get() = _ChartLineUp ?: UXIcon(name = "ChartLineUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 1f)
                curveTo(0.01f, -0.31f, 1.99f, -0.31f, 2f, 1f)
                lineTo(2f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 1.99f, 0f, 2f)
                horizontalLineToRelative(3.56f)
                lineToRelative(-4.86f, 4.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                curveToRelative(-0.04f, -0.04f, -1.24f, -0.89f, -1.24f, -0.89f)
                curveToRelative(-1.14f, -1.07f, -3.08f, -1.03f, -4.16f, 0.05f)
                lineToRelative(-4.59f, 4.41f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.03f, 1.41f)
                curveToRelative(0.38f, 0.4f, 1.02f, 0.41f, 1.41f, 0.03f)
                lineToRelative(4.6f, -4.43f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                curveToRelative(0.04f, 0.04f, 1.24f, 0.89f, 1.24f, 0.89f)
                curveToRelative(1.14f, 1.07f, 3.08f, 1.04f, 4.16f, -0.05f)
                lineToRelative(4.89f, -4.74f)
                verticalLineToRelative(3.61f)
                curveToRelative(0.01f, 1.31f, 1.99f, 1.31f, 2f, 0f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ChartLineUp = it}
