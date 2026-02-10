package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseHand: ImageVector? = null

val Icons.Ts.HouseHand: ImageVector
    get() = _HouseHand ?: UXIcon(name = "HouseHand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-5.65f)
                curveToRelative(0f, -0.62f, 0.28f, -1.19f, 0.77f, -1.57f)
                lineToRelative(3f, -2.35f)
                curveToRelative(0.7f, -0.55f, 1.76f, -0.55f, 2.46f, 0f)
                lineToRelative(3f, 2.35f)
                curveToRelative(0.49f, 0.38f, 0.77f, 0.96f, 0.77f, 1.57f)
                verticalLineToRelative(5.65f)
                close()
                moveTo(12f, 4.35f)
                curveToRelative(0f, -0.31f, -0.14f, -0.6f, -0.38f, -0.79f)
                lineToRelative(-3f, -2.35f)
                curveToRelative(-0.35f, -0.28f, -0.88f, -0.28f, -1.23f, 0f)
                lineToRelative(-3f, 2.35f)
                curveToRelative(-0.24f, 0.19f, -0.38f, 0.48f, -0.38f, 0.79f)
                verticalLineToRelative(4.65f)
                horizontalLineToRelative(8f)
                close()
                moveTo(23.36f, 13.18f)
                lineTo(13.72f, 24f)
                horizontalLineToRelative(-11.22f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.86f)
                curveToRelative(1.21f, 0f, 2.23f, 0.81f, 2.54f, 1.92f)
                lineToRelative(3.73f, -4.1f)
                curveToRelative(0.89f, -1.02f, 2.57f, -1.09f, 3.55f, -0.17f)
                curveToRelative(1.01f, 0.92f, 1.09f, 2.51f, 0.18f, 3.53f)
                close()
                moveTo(22.51f, 10.39f)
                curveToRelative(-0.59f, -0.56f, -1.6f, -0.51f, -2.13f, 0.1f)
                lineToRelative(-4.5f, 4.94f)
                curveToRelative(-0.3f, 0.94f, -1.12f, 1.68f, -2.15f, 1.82f)
                lineToRelative(-5.67f, 0.74f)
                lineToRelative(-0.13f, -0.99f)
                lineToRelative(5.66f, -0.74f)
                curveToRelative(0.8f, -0.11f, 1.4f, -0.81f, 1.4f, -1.62f)
                curveToRelative(0f, -0.91f, -0.74f, -1.64f, -1.64f, -1.64f)
                horizontalLineToRelative(-10.86f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.78f)
                lineToRelative(9.34f, -10.48f)
                curveToRelative(0.55f, -0.61f, 0.5f, -1.57f, -0.11f, -2.12f)
                close()
            }
        }.also { _HouseHand = it}
