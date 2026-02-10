package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareK: ImageVector? = null

val Icons.Ts.SquareK: ImageVector
    get() = _SquareK ?: UXIcon(name = "SquareK") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 4f)
                lineToRelative(-5.32f, 7.52f)
                lineToRelative(5.32f, 8.48f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-5.03f, -8f)
                horizontalLineToRelative(-6.31f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6.35f)
                lineToRelative(4.96f, -7f)
                horizontalLineToRelative(1.19f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _SquareK = it}
