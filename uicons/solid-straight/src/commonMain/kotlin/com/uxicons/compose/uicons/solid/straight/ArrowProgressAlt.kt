package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowProgressAlt: ImageVector? = null

val Icons.Ss.ArrowProgressAlt: ImageVector
    get() = _ArrowProgressAlt ?: UXIcon(name = "ArrowProgressAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(16.89f)
                lineToRelative(-2.01f, -1.8f)
                lineToRelative(1.34f, -1.49f)
                lineToRelative(3.12f, 2.81f)
                curveToRelative(0.42f, 0.38f, 0.66f, 0.92f, 0.66f, 1.48f)
                reflectiveCurveToRelative(-0.24f, 1.1f, -0.66f, 1.48f)
                lineToRelative(-3.12f, 2.81f)
                lineToRelative(-1.34f, -1.49f)
                lineToRelative(2.0f, -1.8f)
                lineTo(4f, 6.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(4f, 12.0f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(12.22f, 14.71f)
                lineToRelative(-1.34f, 1.49f)
                lineToRelative(2.03f, 1.8f)
                horizontalLineToRelative(-4.91f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.85f)
                lineToRelative(-2.0f, 1.75f)
                lineToRelative(1.31f, 1.51f)
                lineToRelative(3.18f, -2.77f)
                curveToRelative(0.42f, -0.38f, 0.66f, -0.92f, 0.66f, -1.48f)
                reflectiveCurveToRelative(-0.24f, -1.1f, -0.66f, -1.48f)
                lineToRelative(-3.12f, -2.81f)
                close()
                moveTo(0f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                lineTo(0f, 22f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _ArrowProgressAlt = it}
