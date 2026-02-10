package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseHand: ImageVector? = null

val Icons.Sr.HouseHand: ImageVector
    get() = _HouseHand ?: UXIcon(name = "HouseHand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.89f, 2.1f)
                lineToRelative(-2.48f, -1.67f)
                curveToRelative(-0.86f, -0.58f, -1.97f, -0.58f, -2.82f, 0f)
                lineToRelative(-2.48f, 1.67f)
                curveToRelative(-0.7f, 0.47f, -1.11f, 1.25f, -1.11f, 2.09f)
                verticalLineToRelative(3.28f)
                curveToRelative(0f, 1.39f, 1.13f, 2.52f, 2.52f, 2.52f)
                horizontalLineToRelative(4.95f)
                curveToRelative(1.39f, 0f, 2.52f, -1.13f, 2.52f, -2.52f)
                verticalLineToRelative(-3.28f)
                curveToRelative(0f, -0.84f, -0.42f, -1.62f, -1.11f, -2.09f)
                close()
                moveTo(9f, 6f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(23.34f, 13.35f)
                lineTo(16.47f, 20.79f)
                curveToRelative(-1.89f, 2.05f, -4.56f, 3.21f, -7.35f, 3.21f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(7.79f)
                curveToRelative(1.37f, 0f, 2.46f, 1.26f, 2.16f, 2.69f)
                curveToRelative(-0.19f, 0.93f, -1.0f, 1.6f, -1.94f, 1.73f)
                lineToRelative(-4.16f, 0.58f)
                curveToRelative(-0.55f, 0.08f, -0.93f, 0.58f, -0.85f, 1.13f)
                curveToRelative(0.08f, 0.55f, 0.58f, 0.93f, 1.13f, 0.85f)
                lineToRelative(4.25f, -0.6f)
                curveToRelative(2.06f, -0.29f, 3.62f, -2.09f, 3.62f, -4.17f)
                curveToRelative(0f, -0.22f, -0.03f, -0.43f, -0.07f, -0.64f)
                lineToRelative(3.54f, -3.74f)
                curveToRelative(0.46f, -0.5f, 1.1f, -0.8f, 1.79f, -0.83f)
                curveToRelative(0.69f, -0.03f, 1.36f, 0.21f, 1.88f, 0.68f)
                curveToRelative(1.05f, 0.96f, 1.14f, 2.6f, 0.19f, 3.67f)
                close()
            }
        }.also { _HouseHand = it}
