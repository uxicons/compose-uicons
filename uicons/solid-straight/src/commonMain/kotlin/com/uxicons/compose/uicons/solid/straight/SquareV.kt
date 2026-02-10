package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareV: ImageVector? = null

val Icons.Ss.SquareV: ImageVector
    get() = _SquareV ?: UXIcon(name = "SquareV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(15f, 17f)
                curveToRelative(-0.67f, 1.53f, -1.64f, 2f, -3f, 2f)
                curveToRelative(-1.36f, 0f, -2.33f, -0.47f, -3f, -2f)
                lineTo(5f, 5f)
                horizontalLineToRelative(2.15f)
                lineToRelative(3.72f, 11.27f)
                curveToRelative(0.32f, 0.69f, 0.55f, 0.73f, 1.14f, 0.73f)
                curveToRelative(0.58f, 0f, 0.82f, -0.04f, 1.13f, -0.73f)
                lineToRelative(3.88f, -11.27f)
                horizontalLineToRelative(1.99f)
                lineToRelative(-4f, 12f)
                close()
            }
        }.also { _SquareV = it}
