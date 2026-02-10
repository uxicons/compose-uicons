package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightFromSquare: ImageVector? = null

val Icons.Bs.ArrowUpRightFromSquare: ImageVector
    get() = _ArrowUpRightFromSquare ?: UXIcon(name = "ArrowUpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 5.12f)
                lineToRelative(-11.44f, 11.44f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(18.88f, 3f)
                horizontalLineToRelative(-4.88f)
                lineTo(14f, 0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(16f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 8.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.5f)
                lineToRelative(3f, -3f)
                lineTo(3.5f, 5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(19f, 24f)
                lineTo(19f, 10f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _ArrowUpRightFromSquare = it}
