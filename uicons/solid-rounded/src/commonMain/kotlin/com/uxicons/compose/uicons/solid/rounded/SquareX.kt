package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareX: ImageVector? = null

val Icons.Sr.SquareX: ImageVector
    get() = _SquareX ?: UXIcon(name = "SquareX") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17.77f, 6.64f)
                lineToRelative(-4.47f, 5.36f)
                lineToRelative(4.47f, 5.36f)
                curveToRelative(0.35f, 0.42f, 0.3f, 1.06f, -0.13f, 1.41f)
                curveToRelative(-0.19f, 0.15f, -0.41f, 0.23f, -0.64f, 0.23f)
                curveToRelative(-0.29f, 0f, -0.57f, -0.12f, -0.77f, -0.36f)
                lineToRelative(-4.23f, -5.08f)
                lineToRelative(-4.23f, 5.08f)
                curveToRelative(-0.2f, 0.24f, -0.48f, 0.36f, -0.77f, 0.36f)
                curveToRelative(-0.23f, 0f, -0.45f, -0.08f, -0.64f, -0.23f)
                curveToRelative(-0.42f, -0.35f, -0.48f, -0.98f, -0.13f, -1.41f)
                lineToRelative(4.47f, -5.36f)
                lineToRelative(-4.47f, -5.36f)
                curveToRelative(-0.35f, -0.42f, -0.3f, -1.06f, 0.13f, -1.41f)
                curveToRelative(0.43f, -0.35f, 1.06f, -0.3f, 1.41f, 0.13f)
                lineToRelative(4.23f, 5.08f)
                lineToRelative(4.23f, -5.08f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
                curveToRelative(0.42f, 0.35f, 0.48f, 0.98f, 0.13f, 1.41f)
                close()
            }
        }.also { _SquareX = it}
