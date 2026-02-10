package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramPredecessor: ImageVector? = null

val Icons.Sr.DiagramPredecessor: ImageVector
    get() = _DiagramPredecessor ?: UXIcon(name = "DiagramPredecessor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                lineTo(20f, 14f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(0f, 6f)
                verticalLineToRelative(-2f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(1.86f, 0f, 3.43f, 1.28f, 3.87f, 3f)
                horizontalLineToRelative(3.13f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.45f)
                curveToRelative(0.69f, 0f, 1.04f, 0.83f, 0.55f, 1.32f)
                lineToRelative(-2.45f, 2.45f)
                curveToRelative(-0.3f, 0.3f, -0.79f, 0.3f, -1.1f, 0f)
                lineToRelative(-2.45f, -2.45f)
                curveToRelative(-0.49f, -0.49f, -0.14f, -1.32f, 0.55f, -1.32f)
                horizontalLineToRelative(1.45f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(4f, 10f)
                curveTo(1.79f, 10f, 0f, 8.21f, 0f, 6f)
                close()
                moveTo(12f, 6f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-3.59f, 3.59f)
                horizontalLineToRelative(1.59f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(10f, 2f)
                horizontalLineToRelative(-1.59f)
                lineTo(2.81f, 7.61f)
                curveToRelative(0.33f, 0.25f, 0.75f, 0.39f, 1.19f, 0.39f)
                horizontalLineToRelative(1.59f)
                lineTo(11.19f, 2.39f)
                curveToRelative(-0.33f, -0.25f, -0.75f, -0.39f, -1.19f, -0.39f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(1.59f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _DiagramPredecessor = it}
