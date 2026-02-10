package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BringForward: ImageVector? = null

val Icons.Ts.BringForward: ImageVector
    get() = _BringForward ?: UXIcon(name = "BringForward") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 16f)
                lineTo(0f, 16f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(13.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(1f, 15f)
                lineTo(15f, 15f)
                lineTo(15f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 15f)
                close()
                moveTo(24f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                lineTo(9f, 23f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                lineTo(24f, 24f)
                lineTo(24f, 10.5f)
                close()
            }
        }.also { _BringForward = it}
