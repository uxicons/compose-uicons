package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RazorBarber: ImageVector? = null

val Icons.Rs.RazorBarber: ImageVector
    get() = _RazorBarber ?: UXIcon(name = "RazorBarber") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(4.5f, 2f)
                curveToRelative(-2.02f, 0f, -3.72f, 1.51f, -3.97f, 3.51f)
                lineToRelative(-0.43f, 3.49f)
                horizontalLineToRelative(11.65f)
                curveToRelative(2.03f, 0f, 3.74f, -1.52f, 3.97f, -3.54f)
                lineToRelative(0.17f, -1.46f)
                horizontalLineToRelative(2.09f)
                curveToRelative(-0.2f, 3.7f, -2.63f, 9.67f, -6.97f, 14.04f)
                curveToRelative(-1.35f, 1.37f, -1.34f, 3.59f, 0.03f, 4.95f)
                curveToRelative(0.68f, 0.67f, 1.57f, 1.01f, 2.46f, 1.01f)
                curveToRelative(0.9f, 0f, 1.81f, -0.35f, 2.49f, -1.04f)
                curveToRelative(5.71f, -5.78f, 5.58f, -17.36f, 5.52f, -19.26f)
                curveToRelative(1.46f, -0.6f, 2.49f, -2.03f, 2.49f, -3.7f)
                close()
                moveTo(13.74f, 5.23f)
                curveToRelative(-0.12f, 1.01f, -0.97f, 1.77f, -1.99f, 1.77f)
                lineTo(2.36f, 7f)
                lineToRelative(0.15f, -1.25f)
                curveToRelative(0.12f, -1f, 0.98f, -1.75f, 1.99f, -1.75f)
                horizontalLineToRelative(9.38f)
                lineToRelative(-0.14f, 1.23f)
                close()
                moveTo(14.57f, 21.55f)
                curveToRelative(-0.58f, 0.59f, -1.53f, 0.59f, -2.12f, 0.01f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, -0.02f, -2.12f)
                curveToRelative(3.6f, -3.63f, 5.96f, -8.21f, 6.99f, -12.03f)
                curveToRelative(-0.28f, 4.13f, -1.31f, 10.55f, -4.85f, 14.13f)
                close()
            }
        }.also { _RazorBarber = it}
