package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRightFromSquare: ImageVector? = null

val Icons.Ss.UpRightFromSquare: ImageVector
    get() = _UpRightFromSquare ?: UXIcon(name = "UpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 3.41f)
                lineToRelative(-12.79f, 12.79f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(20.59f, 2f)
                horizontalLineToRelative(-7.59f)
                lineTo(13f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(20f, 8.24f)
                lineToRelative(-10.79f, 10.79f)
                lineToRelative(-4.24f, -4.24f)
                lineTo(15.76f, 4f)
                horizontalLineToRelative(-4.76f)
                lineTo(11f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4.76f)
                close()
            }
        }.also { _UpRightFromSquare = it}
