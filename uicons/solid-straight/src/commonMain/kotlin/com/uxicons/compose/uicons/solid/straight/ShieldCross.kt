package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCross: ImageVector? = null

val Icons.Ss.ShieldCross: ImageVector
    get() = _ShieldCross ?: UXIcon(name = "ShieldCross") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.95f, 2.58f)
                lineTo(12f, -0.05f)
                lineToRelative(-7.95f, 2.63f)
                curveToRelative(-1.23f, 0.41f, -2.06f, 1.55f, -2.06f, 2.84f)
                verticalLineToRelative(6.53f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.83f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-6.53f)
                curveToRelative(0f, -1.29f, -0.83f, -2.44f, -2.05f, -2.84f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(9.46f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.46f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ShieldCross = it}
