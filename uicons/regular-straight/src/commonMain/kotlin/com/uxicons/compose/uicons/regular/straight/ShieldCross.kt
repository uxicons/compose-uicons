package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCross: ImageVector? = null

val Icons.Rs.ShieldCross: ImageVector
    get() = _ShieldCross ?: UXIcon(name = "ShieldCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, 9.46f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -9.46f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, -4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.94f, 2.58f)
                lineTo(12f, 0f)
                lineToRelative(-7.95f, 2.58f)
                curveToRelative(-1.23f, 0.41f, -2.06f, 1.55f, -2.06f, 2.84f)
                verticalLineToRelative(6.53f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.83f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-6.53f)
                curveToRelative(0f, -1.29f, -0.83f, -2.44f, -2.06f, -2.84f)
                close()
                moveTo(20f, 11.95f)
                curveToRelative(0f, 6.18f, -6.09f, 9.11f, -7.95f, 9.86f)
                curveToRelative(-1.89f, -0.94f, -8.05f, -4.45f, -8.05f, -9.86f)
                verticalLineToRelative(-6.53f)
                curveToRelative(0f, -0.43f, 0.27f, -0.81f, 0.68f, -0.94f)
                lineToRelative(7.32f, -2.38f)
                lineToRelative(7.32f, 2.38f)
                curveToRelative(0.41f, 0.14f, 0.68f, 0.52f, 0.68f, 0.94f)
                verticalLineToRelative(6.53f)
                close()
            }
        }.also { _ShieldCross = it}
