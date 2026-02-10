package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareRight: ImageVector? = null

val Icons.Ts.AngleSquareRight: ImageVector
    get() = _AngleSquareRight ?: UXIcon(name = "AngleSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.85f, 17.95f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.86f, -4.86f)
                curveToRelative(0.21f, -0.21f, 0.21f, -0.55f, 0f, -0.76f)
                lineToRelative(-4.85f, -4.85f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.85f, 4.85f)
                curveToRelative(0.6f, 0.6f, 0.6f, 1.58f, 0f, 2.18f)
                lineToRelative(-4.86f, 4.86f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(2.5f)
                close()
            }
        }.also { _AngleSquareRight = it}
