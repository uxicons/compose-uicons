package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileHand: ImageVector? = null

val Icons.Rs.MobileHand: ImageVector
    get() = _MobileHand ?: UXIcon(name = "MobileHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8.67f)
                lineTo(2f, 13.42f)
                verticalLineToRelative(10.58f)
                lineTo(0f, 24f)
                lineTo(0f, 12.5f)
                lineTo(7f, 6f)
                verticalLineToRelative(2.67f)
                close()
                moveTo(24f, 0f)
                lineTo(24f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(12f, 22f)
                curveToRelative(-0.53f, 0f, -1.05f, -0.14f, -1.5f, -0.4f)
                lineToRelative(-0.5f, 0.71f)
                verticalLineToRelative(1.69f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.31f)
                lineToRelative(4.67f, -6.76f)
                curveToRelative(0.47f, -0.56f, 0.41f, -1.28f, -0.07f, -1.69f)
                curveToRelative(-0.43f, -0.36f, -1.07f, -0.36f, -1.5f, 0.02f)
                lineToRelative(-4.43f, 3.99f)
                lineToRelative(-1.34f, -1.49f)
                lineToRelative(4.44f, -4f)
                curveToRelative(1.17f, -1.03f, 2.94f, -1.05f, 4.12f, -0.05f)
                curveToRelative(0.7f, 0.59f, 1.06f, 1.43f, 1.09f, 2.28f)
                horizontalLineToRelative(7.01f)
                lineTo(22f, 2f)
                lineTo(11f, 2f)
                verticalLineToRelative(7.06f)
                curveToRelative(-0.7f, 0.12f, -1.38f, 0.39f, -2f, 0.8f)
                lineTo(9f, 0f)
                horizontalLineToRelative(15f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-7.65f)
                curveToRelative(-0.04f, 0.05f, -2.71f, 3.93f, -2.71f, 3.93f)
                curveToRelative(0.11f, 0.04f, 0.23f, 0.07f, 0.35f, 0.07f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _MobileHand = it}
