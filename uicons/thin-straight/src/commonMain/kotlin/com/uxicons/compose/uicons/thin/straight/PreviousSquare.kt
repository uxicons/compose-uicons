package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PreviousSquare: ImageVector? = null

val Icons.Ts.PreviousSquare: ImageVector
    get() = _PreviousSquare ?: UXIcon(name = "PreviousSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.14f)
                lineToRelative(8f, 4.5f)
                lineTo(17f, 6.64f)
                lineToRelative(-8f, 4.5f)
                lineTo(9f, 7f)
                close()
                moveTo(16f, 8.36f)
                verticalLineToRelative(7.29f)
                lineToRelative(-6.48f, -3.65f)
                lineToRelative(6.48f, -3.65f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(-1f)
                lineTo(7f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _PreviousSquare = it}
