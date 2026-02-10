package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Ts.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
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
                moveTo(18f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.19f)
                curveToRelative(-1.06f, -1.84f, -3.02f, -3f, -5.19f, -3f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(2.49f, 0f, 4.75f, 1.3f, 6f, 3.4f)
                verticalLineToRelative(-3.4f)
                close()
                moveTo(18f, 12f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                curveToRelative(-2.49f, 0f, -4.75f, -1.3f, -6f, -3.4f)
                verticalLineToRelative(3.4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.19f)
                curveToRelative(1.06f, 1.84f, 3.02f, 3f, 5.19f, 3f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                close()
            }
        }.also { _RotateSquare = it}
