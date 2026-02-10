package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRightFromSquare: ImageVector? = null

val Icons.Sr.UpRightFromSquare: ImageVector
    get() = _UpRightFromSquare ?: UXIcon(name = "UpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 13f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(1.76f)
                lineTo(7.09f, 12.67f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                horizontalLineToRelative(0f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(8.67f, -8.67f)
                verticalLineToRelative(1.76f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.59f)
                lineToRelative(-12.09f, 12.09f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(22f, 3.41f)
                verticalLineToRelative(6.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _UpRightFromSquare = it}
