package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Rs.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.86f, 18.44f)
                curveToRelative(1.42f, -1.93f, 2.15f, -4.11f, 2.15f, -6.48f)
                verticalLineToRelative(-5.75f)
                curveToRelative(0f, -1.73f, -1.1f, -3.25f, -2.74f, -3.8f)
                lineTo(12f, 0.01f)
                lineToRelative(-7.26f, 2.41f)
                curveToRelative(-0.22f, 0.07f, -0.43f, 0.17f, -0.64f, 0.28f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.1f, -4.1f)
                close()
                moveTo(12f, 2.11f)
                lineToRelative(6.63f, 2.2f)
                curveToRelative(0.82f, 0.27f, 1.37f, 1.03f, 1.37f, 1.9f)
                verticalLineToRelative(5.75f)
                curveToRelative(0f, 1.83f, -0.53f, 3.52f, -1.58f, 5.04f)
                lineTo(5.64f, 4.22f)
                lineToRelative(6.36f, -2.11f)
                close()
                moveTo(15.6f, 19.84f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(-1.71f, 1.3f, -3.41f, 2.08f, -4.24f, 2.41f)
                lineToRelative(-0.84f, 0.34f)
                lineToRelative(-0.81f, -0.4f)
                curveToRelative(-2.15f, -1.07f, -9.15f, -5.08f, -9.15f, -11.65f)
                verticalLineToRelative(-5.72f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(3.72f)
                curveToRelative(0f, 5.42f, 6.16f, 8.92f, 8.05f, 9.86f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.7f, -0.28f, 2.12f, -0.92f, 3.55f, -1.98f)
                close()
            }
        }.also { _ShieldSlash = it}
