package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareN: ImageVector? = null

val Icons.Rs.SquareN: ImageVector
    get() = _SquareN ?: UXIcon(name = "SquareN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(16f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12.31f)
                curveToRelative(0f, 0.76f, -0.49f, 1.41f, -1.22f, 1.62f)
                curveToRelative(-0.16f, 0.05f, -0.32f, 0.07f, -0.48f, 0.07f)
                curveToRelative(-0.56f, 0f, -1.1f, -0.28f, -1.42f, -0.78f)
                lineToRelative(-6.88f, -10.5f)
                verticalLineToRelative(11.28f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 6.69f)
                curveToRelative(0f, -0.76f, 0.49f, -1.41f, 1.22f, -1.62f)
                curveToRelative(0.73f, -0.21f, 1.49f, 0.07f, 1.9f, 0.71f)
                lineToRelative(6.88f, 10.5f)
                lineTo(16f, 5f)
                close()
            }
        }.also { _SquareN = it}
