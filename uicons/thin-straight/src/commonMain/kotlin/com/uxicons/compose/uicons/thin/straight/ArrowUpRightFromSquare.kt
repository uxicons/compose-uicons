package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightFromSquare: ImageVector? = null

val Icons.Ts.ArrowUpRightFromSquare: ImageVector
    get() = _ArrowUpRightFromSquare ?: UXIcon(name = "ArrowUpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1.5f)
                lineTo(24f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 1.71f)
                lineTo(8.85f, 15.85f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(22.29f, 1f)
                lineTo(14f, 1f)
                lineTo(14f, 0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(19f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(15.46f, 5f)
                lineToRelative(1f, -1f)
                lineTo(2.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(0f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 7.54f)
                lineToRelative(-1f, 1f)
                verticalLineToRelative(14.46f)
                close()
            }
        }.also { _ArrowUpRightFromSquare = it}
