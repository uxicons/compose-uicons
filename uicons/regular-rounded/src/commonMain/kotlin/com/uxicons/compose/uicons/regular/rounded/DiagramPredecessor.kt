package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramPredecessor: ImageVector? = null

val Icons.Rr.DiagramPredecessor: ImageVector
    get() = _DiagramPredecessor ?: UXIcon(name = "DiagramPredecessor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                lineTo(4f, 14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                lineTo(20f, 24f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(4f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineTo(20f, 16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.45f)
                curveToRelative(-0.69f, 0f, -1.04f, 0.83f, -0.55f, 1.32f)
                lineToRelative(2.45f, 2.45f)
                curveToRelative(0.3f, 0.3f, 0.79f, 0.3f, 1.1f, 0f)
                lineToRelative(2.45f, -2.45f)
                curveToRelative(0.49f, -0.49f, 0.14f, -1.32f, -0.55f, -1.32f)
                horizontalLineToRelative(-1.45f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(-0.45f, -1.72f, -2.01f, -3f, -3.87f, -3f)
                lineTo(4f, -0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveTo(10f, 8f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(3.59f, -3.59f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(11.19f, 2.39f)
                lineToRelative(-5.61f, 5.61f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.45f, 0f, -0.86f, -0.15f, -1.19f, -0.39f)
                lineTo(8.41f, 2f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.45f, 0f, 0.86f, 0.15f, 1.19f, 0.39f)
                close()
                moveTo(4f, 2f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
            }
        }.also { _DiagramPredecessor = it}
