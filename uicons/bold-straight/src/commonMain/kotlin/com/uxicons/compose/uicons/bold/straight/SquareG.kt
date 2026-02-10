package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareG: ImageVector? = null

val Icons.Bs.SquareG: ImageVector
    get() = _SquareG ?: UXIcon(name = "SquareG") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(18.01f, 11f)
                lineToRelative(-0.01f, 2.06f)
                curveToRelative(0.07f, 1.78f, -0.75f, 3.5f, -2.24f, 4.66f)
                curveToRelative(-1.08f, 0.84f, -2.41f, 1.28f, -3.76f, 1.28f)
                curveToRelative(-0.58f, 0f, -1.17f, -0.08f, -1.74f, -0.25f)
                curveToRelative(-2.51f, -0.73f, -4.26f, -3.12f, -4.26f, -5.8f)
                verticalLineToRelative(-1.82f)
                curveToRelative(0f, -1.66f, 0.69f, -3.27f, 1.89f, -4.43f)
                curveToRelative(1.18f, -1.14f, 2.72f, -1.74f, 4.32f, -1.69f)
                curveToRelative(1.94f, 0.06f, 3.74f, 1.05f, 4.82f, 2.65f)
                lineToRelative(-2.48f, 1.68f)
                curveToRelative(-0.55f, -0.81f, -1.46f, -1.3f, -2.43f, -1.34f)
                curveToRelative(-0.79f, -0.03f, -1.55f, 0.27f, -2.14f, 0.85f)
                curveToRelative(-0.62f, 0.6f, -0.97f, 1.43f, -0.97f, 2.28f)
                verticalLineToRelative(1.82f)
                curveToRelative(0f, 1.36f, 0.86f, 2.56f, 2.1f, 2.92f)
                curveToRelative(0.99f, 0.29f, 2.02f, 0.1f, 2.81f, -0.52f)
                curveToRelative(0.47f, -0.36f, 0.79f, -0.83f, 0.96f, -1.35f)
                horizontalLineToRelative(-2.88f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.01f)
                close()
            }
        }.also { _SquareG = it}
