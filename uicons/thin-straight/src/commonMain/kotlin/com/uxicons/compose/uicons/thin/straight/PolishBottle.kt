package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBottle: ImageVector? = null

val Icons.Ts.PolishBottle: ImageVector
    get() = _PolishBottle ?: UXIcon(name = "PolishBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.34f, 10.81f)
                curveToRelative(-0.47f, -0.51f, -1.14f, -0.81f, -1.84f, -0.81f)
                horizontalLineToRelative(-2.5f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 10f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.44f, -0.02f, -2.64f, 1.29f, -2.49f, 2.73f)
                lineToRelative(1.55f, 11.27f)
                horizontalLineToRelative(12.87f)
                lineToRelative(1.56f, -11.29f)
                curveToRelative(0.06f, -0.69f, -0.18f, -1.39f, -0.65f, -1.9f)
                close()
                moveTo(10f, 1f)
                horizontalLineToRelative(4f)
                lineTo(14f, 10f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 1f)
                close()
                moveTo(17.56f, 23f)
                lineTo(6.44f, 23f)
                lineToRelative(-1.43f, -10.38f)
                curveToRelative(-0.09f, -0.85f, 0.64f, -1.65f, 1.5f, -1.62f)
                horizontalLineToRelative(11f)
                curveToRelative(0.84f, -0.03f, 1.58f, 0.78f, 1.5f, 1.6f)
                lineToRelative(-1.43f, 10.4f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                lineTo(8f, 14f)
                verticalLineToRelative(5f)
                close()
                moveTo(9f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _PolishBottle = it}
