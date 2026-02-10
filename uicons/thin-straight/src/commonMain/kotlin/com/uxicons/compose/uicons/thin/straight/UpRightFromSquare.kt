package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRightFromSquare: ImageVector? = null

val Icons.Ts.UpRightFromSquare: ImageVector
    get() = _UpRightFromSquare ?: UXIcon(name = "UpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 1.71f)
                lineToRelative(-14.65f, 14.65f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(22.29f, 1f)
                horizontalLineToRelative(-9.29f)
                lineTo(13f, 0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.5f)
                lineTo(10f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _UpRightFromSquare = it}
