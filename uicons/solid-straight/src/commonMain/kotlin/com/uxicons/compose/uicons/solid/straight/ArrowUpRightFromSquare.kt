package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightFromSquare: ImageVector? = null

val Icons.Ss.ArrowUpRightFromSquare: ImageVector
    get() = _ArrowUpRightFromSquare ?: UXIcon(name = "ArrowUpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineTo(10f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3.41f)
                lineToRelative(-12.79f, 12.79f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(20.59f, 2f)
                horizontalLineToRelative(-6.59f)
                verticalLineTo(0f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(5.13f, 14.63f)
                lineTo(15.76f, 4f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(20f)
                verticalLineTo(8.24f)
                lineToRelative(-10.63f, 10.63f)
                lineToRelative(-4.24f, -4.24f)
                close()
            }
        }.also { _ArrowUpRightFromSquare = it}
