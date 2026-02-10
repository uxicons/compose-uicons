package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandsHoldingDiamond: ImageVector? = null

val Icons.Bs.HandsHoldingDiamond: ImageVector
    get() = _HandsHoldingDiamond ?: UXIcon(name = "HandsHoldingDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                lineTo(7f, 5f)
                lineTo(12f, 0f)
                lineToRelative(5f, 5f)
                lineToRelative(-5f, 5f)
                close()
                moveTo(21.24f, 4.01f)
                curveToRelative(-1.3f, 0.13f, -2.24f, 1.33f, -2.24f, 2.63f)
                verticalLineToRelative(3.45f)
                curveToRelative(-1.24f, -0.27f, -2.58f, 0.07f, -3.54f, 1.03f)
                lineToRelative(-3.46f, 3.46f)
                lineToRelative(-3.38f, -3.38f)
                curveToRelative(-0.99f, -0.99f, -2.36f, -1.38f, -3.62f, -1.11f)
                verticalLineToRelative(-3.45f)
                curveToRelative(0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f)
                verticalLineToRelative(14.12f)
                lineToRelative(3.38f, 3.38f)
                lineTo(7.62f, 24f)
                lineToRelative(-4.62f, -4.62f)
                verticalLineToRelative(-3.02f)
                lineToRelative(3.33f, 3.32f)
                lineToRelative(2.11f, -2.13f)
                lineToRelative(-3.32f, -3.29f)
                curveToRelative(-0.1f, -0.17f, -0.14f, -0.36f, -0.11f, -0.56f)
                curveToRelative(0.02f, -0.16f, 0.1f, -0.38f, 0.35f, -0.56f)
                curveToRelative(0.31f, -0.22f, 0.82f, -0.14f, 1.14f, 0.18f)
                lineToRelative(3.77f, 3.77f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                verticalLineToRelative(5.14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.14f)
                curveToRelative(0f, -0.6f, -0.1f, -1.19f, -0.28f, -1.75f)
                lineToRelative(3.87f, -3.87f)
                curveToRelative(0.32f, -0.32f, 0.85f, -0.32f, 1.17f, 0f)
                curveToRelative(0.27f, 0.27f, 0.32f, 0.69f, 0.12f, 1.02f)
                lineToRelative(-3.32f, 3.29f)
                lineToRelative(2.11f, 2.13f)
                lineToRelative(3.33f, -3.3f)
                verticalLineToRelative(3.0f)
                lineToRelative(-4.62f, 4.62f)
                horizontalLineToRelative(4.24f)
                lineToRelative(3.38f, -3.38f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0f, -1.47f, -1.26f, -2.64f, -2.76f, -2.49f)
                close()
            }
        }.also { _HandsHoldingDiamond = it}
