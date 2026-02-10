package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareC: ImageVector? = null

val Icons.Tr.SquareC: ImageVector
    get() = _SquareC ?: UXIcon(name = "SquareC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(6f, 10.64f)
                verticalLineToRelative(2.73f)
                curveToRelative(0f, 3.11f, 2.5f, 5.64f, 5.57f, 5.64f)
                horizontalLineToRelative(0.68f)
                curveToRelative(1.89f, 0f, 3.64f, -0.94f, 4.69f, -2.5f)
                curveToRelative(0.15f, -0.23f, 0.46f, -0.29f, 0.69f, -0.14f)
                curveToRelative(0.23f, 0.15f, 0.29f, 0.46f, 0.14f, 0.69f)
                curveToRelative(-1.24f, 1.85f, -3.3f, 2.95f, -5.52f, 2.95f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-3.62f, 0f, -6.57f, -2.98f, -6.57f, -6.64f)
                verticalLineToRelative(-2.73f)
                curveToRelative(0f, -3.66f, 2.95f, -6.64f, 6.57f, -6.64f)
                horizontalLineToRelative(0.68f)
                curveToRelative(2.22f, 0f, 4.28f, 1.1f, 5.52f, 2.95f)
                curveToRelative(0.15f, 0.23f, 0.09f, 0.54f, -0.14f, 0.69f)
                curveToRelative(-0.23f, 0.15f, -0.54f, 0.09f, -0.69f, -0.14f)
                curveToRelative(-1.05f, -1.57f, -2.8f, -2.5f, -4.69f, -2.5f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-3.07f, 0f, -5.57f, 2.53f, -5.57f, 5.64f)
                close()
            }
        }.also { _SquareC = it}
