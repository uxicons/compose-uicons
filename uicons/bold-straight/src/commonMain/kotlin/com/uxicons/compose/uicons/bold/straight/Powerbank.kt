package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Powerbank: ImageVector? = null

val Icons.Bs.Powerbank: ImageVector
    get() = _Powerbank ?: UXIcon(name = "Powerbank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.7f, 9.88f)
                curveToRelative(0.35f, 0.55f, 0.4f, 1.23f, 0.12f, 1.82f)
                lineToRelative(-2.58f, 4.54f)
                lineToRelative(-2.6f, -1.49f)
                lineToRelative(1.57f, -2.76f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-0.66f, 0f, -1.27f, -0.34f, -1.62f, -0.9f)
                reflectiveCurveToRelative(-0.38f, -1.25f, -0.08f, -1.85f)
                lineToRelative(2.57f, -4.5f)
                lineToRelative(2.6f, 1.49f)
                lineToRelative(-1.58f, 2.75f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.65f, 0f, 1.25f, 0.33f, 1.6f, 0.88f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.81f, -0.4f, 1.53f, -1f, 1.99f)
                verticalLineToRelative(8.01f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-19.5f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(10f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-8.01f)
                curveToRelative(-0.6f, -0.46f, -1f, -1.17f, -1f, -1.99f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 18f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
                moveTo(10.0f, 20.01f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }.also { _Powerbank = it}
