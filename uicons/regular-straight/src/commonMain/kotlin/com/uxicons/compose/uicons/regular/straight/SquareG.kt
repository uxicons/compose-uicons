package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareG: ImageVector? = null

val Icons.Rs.SquareG: ImageVector
    get() = _SquareG ?: UXIcon(name = "SquareG") {
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
                moveTo(18f, 12.96f)
                curveToRelative(0.07f, 1.88f, -0.76f, 3.63f, -2.27f, 4.8f)
                curveToRelative(-1.08f, 0.84f, -2.41f, 1.28f, -3.75f, 1.28f)
                curveToRelative(-0.58f, 0f, -1.16f, -0.08f, -1.72f, -0.25f)
                curveToRelative(-2.5f, -0.73f, -4.25f, -3.12f, -4.25f, -5.81f)
                verticalLineToRelative(-1.86f)
                curveToRelative(0f, -1.66f, 0.69f, -3.28f, 1.9f, -4.45f)
                curveToRelative(1.18f, -1.14f, 2.73f, -1.73f, 4.32f, -1.69f)
                curveToRelative(1.94f, 0.06f, 3.74f, 1.06f, 4.82f, 2.65f)
                lineToRelative(-1.66f, 1.12f)
                curveToRelative(-0.72f, -1.07f, -1.93f, -1.74f, -3.23f, -1.78f)
                curveToRelative(-1.05f, -0.04f, -2.07f, 0.36f, -2.86f, 1.13f)
                curveToRelative(-0.82f, 0.79f, -1.29f, 1.89f, -1.29f, 3.01f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 1.8f, 1.16f, 3.4f, 2.81f, 3.89f)
                curveToRelative(1.29f, 0.38f, 2.63f, 0.12f, 3.68f, -0.7f)
                curveToRelative(0.73f, -0.57f, 1.22f, -1.34f, 1.42f, -2.19f)
                horizontalLineToRelative(-3.91f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.96f)
                lineToRelative(0.04f, 0.96f)
                close()
            }
        }.also { _SquareG = it}
