package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareC: ImageVector? = null

val Icons.Rs.SquareC: ImageVector
    get() = _SquareC ?: UXIcon(name = "SquareC") {
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
                moveTo(8f, 10.91f)
                verticalLineToRelative(2.18f)
                curveToRelative(0f, 2.16f, 1.73f, 3.91f, 3.86f, 3.91f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.47f, 0f, 2.8f, -0.81f, 3.48f, -2.12f)
                lineToRelative(1.78f, 0.92f)
                curveToRelative(-1.02f, 1.97f, -3.03f, 3.2f, -5.25f, 3.2f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-3.23f, 0f, -5.86f, -2.65f, -5.86f, -5.91f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -3.26f, 2.63f, -5.91f, 5.86f, -5.91f)
                horizontalLineToRelative(0.55f)
                curveToRelative(2.26f, 0f, 4.29f, 1.26f, 5.29f, 3.28f)
                lineToRelative(-1.79f, 0.89f)
                curveToRelative(-0.67f, -1.34f, -2.01f, -2.17f, -3.5f, -2.17f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-2.13f, 0f, -3.86f, 1.75f, -3.86f, 3.91f)
                close()
            }
        }.also { _SquareC = it}
