package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseHand: ImageVector? = null

val Icons.Bs.HouseHand: ImageVector
    get() = _HouseHand ?: UXIcon(name = "HouseHand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 3.85f)
                curveToRelative(0f, -0.46f, -0.21f, -0.9f, -0.58f, -1.18f)
                lineToRelative(-3f, -2.35f)
                curveToRelative(-0.54f, -0.42f, -1.31f, -0.42f, -1.85f, 0f)
                lineToRelative(-3f, 2.35f)
                curveToRelative(-0.36f, 0.28f, -0.58f, 0.72f, -0.58f, 1.18f)
                verticalLineToRelative(5.15f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(9.5f, 6.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22.73f, 9.01f)
                curveToRelative(-0.77f, -0.7f, -1.76f, -1.06f, -2.8f, -1.01f)
                curveToRelative(-1.04f, 0.05f, -1.99f, 0.5f, -2.69f, 1.26f)
                lineToRelative(-2.44f, 2.68f)
                curveToRelative(-0.65f, -0.59f, -1.51f, -0.95f, -2.45f, -0.95f)
                horizontalLineToRelative(-8.86f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.18f)
                lineToRelative(8.34f, -9.53f)
                curveToRelative(1.41f, -1.58f, 1.28f, -4.03f, -0.28f, -5.46f)
                close()
                moveTo(20.77f, 12.48f)
                lineTo(13.32f, 21.0f)
                horizontalLineToRelative(-9.82f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.86f)
                curveToRelative(0.35f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                curveToRelative(0f, 0.32f, -0.24f, 0.59f, -0.55f, 0.64f)
                lineToRelative(-5.16f, 0.74f)
                lineToRelative(0.42f, 2.97f)
                lineToRelative(5.16f, -0.74f)
                curveToRelative(1.62f, -0.23f, 2.88f, -1.53f, 3.1f, -3.12f)
                lineToRelative(3.5f, -3.84f)
                curveToRelative(0.31f, -0.36f, 0.9f, -0.39f, 1.25f, -0.06f)
                curveToRelative(0.36f, 0.33f, 0.39f, 0.88f, 0.06f, 1.25f)
                close()
            }
        }.also { _HouseHand = it}
