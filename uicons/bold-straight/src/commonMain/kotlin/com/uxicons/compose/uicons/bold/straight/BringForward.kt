package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BringForward: ImageVector? = null

val Icons.Bs.BringForward: ImageVector
    get() = _BringForward ?: UXIcon(name = "BringForward") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 16f)
                lineTo(0f, 16f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(12.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(3f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 13f)
                close()
                moveTo(24f, 11.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                lineTo(11f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                lineTo(24f, 24f)
                lineTo(24f, 11.5f)
                close()
            }
        }.also { _BringForward = it}
