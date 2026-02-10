package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Powerbank: ImageVector? = null

val Icons.Ts.Powerbank: ImageVector
    get() = _Powerbank ?: UXIcon(name = "Powerbank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(19.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-8.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(15f, 23f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(21f, 6.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(23f, 11f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(6.0f, 20f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.84f, 10.67f)
                curveToRelative(0.23f, 0.43f, 0.21f, 0.94f, -0.05f, 1.33f)
                lineToRelative(-2.35f, 4.24f)
                lineToRelative(-0.88f, -0.48f)
                lineToRelative(2.37f, -4.27f)
                curveToRelative(0.12f, -0.23f, 0.07f, -0.48f, -0.19f, -0.48f)
                horizontalLineToRelative(-3.47f)
                curveToRelative(-0.42f, 0f, -0.8f, -0.18f, -1.03f, -0.51f)
                curveToRelative(-0.23f, -0.31f, -0.29f, -0.7f, -0.18f, -1.08f)
                lineToRelative(2.51f, -4.65f)
                lineToRelative(0.88f, 0.48f)
                lineToRelative(-2.44f, 4.5f)
                curveToRelative(-0.08f, 0.15f, 0.03f, 0.26f, 0.18f, 0.26f)
                horizontalLineToRelative(3.56f)
                curveToRelative(0.46f, 0f, 0.87f, 0.25f, 1.1f, 0.67f)
                close()
            }
        }.also { _Powerbank = it}
