package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareN: ImageVector? = null

val Icons.Ts.SquareN: ImageVector
    get() = _SquareN ?: UXIcon(name = "SquareN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(18f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14.63f)
                curveToRelative(0f, 0.61f, -0.39f, 1.14f, -0.98f, 1.31f)
                curveToRelative(-0.59f, 0.18f, -1.2f, -0.06f, -1.53f, -0.57f)
                lineTo(6.68f, 5.18f)
                curveToRelative(-0.15f, -0.23f, -0.36f, -0.18f, -0.42f, -0.17f)
                curveToRelative(-0.06f, 0.02f, -0.26f, 0.1f, -0.26f, 0.35f)
                verticalLineToRelative(14.63f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 5.37f)
                curveToRelative(0f, -0.61f, 0.39f, -1.14f, 0.98f, -1.31f)
                curveToRelative(0.59f, -0.17f, 1.2f, 0.06f, 1.53f, 0.57f)
                lineToRelative(9.8f, 14.19f)
                curveToRelative(0.15f, 0.23f, 0.36f, 0.18f, 0.42f, 0.17f)
                curveToRelative(0.06f, -0.02f, 0.26f, -0.1f, 0.26f, -0.35f)
                lineTo(18.0f, 4f)
                close()
            }
        }.also { _SquareN = it}
