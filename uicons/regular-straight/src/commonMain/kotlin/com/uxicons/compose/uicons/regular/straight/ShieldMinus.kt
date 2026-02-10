package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldMinus: ImageVector? = null

val Icons.Rs.ShieldMinus: ImageVector
    get() = _ShieldMinus ?: UXIcon(name = "ShieldMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.26f, 2.41f)
                lineTo(12f, 0.01f)
                lineToRelative(-7.26f, 2.41f)
                curveToRelative(-1.64f, 0.54f, -2.74f, 2.07f, -2.74f, 3.8f)
                verticalLineToRelative(5.75f)
                curveToRelative(0f, 6.57f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.84f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-5.75f)
                curveToRelative(0f, -1.73f, -1.1f, -3.25f, -2.74f, -3.8f)
                close()
                moveTo(20f, 11.96f)
                curveToRelative(0f, 6.18f, -6.08f, 9.11f, -7.95f, 9.86f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-1.89f, -0.94f, -8.05f, -4.44f, -8.05f, -9.86f)
                verticalLineToRelative(-5.75f)
                curveToRelative(0f, -0.86f, 0.55f, -1.63f, 1.37f, -1.9f)
                lineToRelative(6.63f, -2.2f)
                lineToRelative(6.63f, 2.2f)
                curveToRelative(0.82f, 0.27f, 1.37f, 1.03f, 1.37f, 1.9f)
                verticalLineToRelative(5.75f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ShieldMinus = it}
