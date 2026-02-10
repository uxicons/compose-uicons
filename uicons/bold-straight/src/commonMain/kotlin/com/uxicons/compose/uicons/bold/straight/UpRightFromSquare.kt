package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRightFromSquare: ImageVector? = null

val Icons.Bs.UpRightFromSquare: ImageVector
    get() = _UpRightFromSquare ?: UXIcon(name = "UpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.88f)
                lineToRelative(-11.44f, 11.44f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(18.88f, 3f)
                horizontalLineToRelative(-5.88f)
                lineTo(13f, 0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.5f)
                lineTo(10f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _UpRightFromSquare = it}
