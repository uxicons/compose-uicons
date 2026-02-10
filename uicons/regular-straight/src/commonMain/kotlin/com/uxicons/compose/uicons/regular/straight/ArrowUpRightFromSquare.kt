package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightFromSquare: ImageVector? = null

val Icons.Rs.ArrowUpRightFromSquare: ImageVector
    get() = _ArrowUpRightFromSquare ?: UXIcon(name = "ArrowUpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                lineTo(24f, 10f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 3.41f)
                lineToRelative(-12.79f, 12.79f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(20.59f, 2f)
                horizontalLineToRelative(-6.59f)
                lineTo(14f, 0f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(18f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(13.76f, 6f)
                lineToRelative(2f, -2f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(0f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 8.24f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(11.76f)
                close()
            }
        }.also { _ArrowUpRightFromSquare = it}
