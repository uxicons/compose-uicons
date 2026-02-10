package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Faucet: ImageVector? = null

val Icons.Ts.Faucet: ImageVector
    get() = _Faucet ?: UXIcon(name = "Faucet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 18f)
                lineToRelative(-1.77f, 1.73f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.29f, 0.73f, 1.77f)
                reflectiveCurveToRelative(1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                horizontalLineToRelative(0f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.74f, -1.77f)
                lineToRelative(-1.76f, -1.73f)
                close()
                moveTo(21.56f, 22.56f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.56f, 0.56f, -1.55f, 0.57f, -2.12f, 0f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineToRelative(1.06f, -1.04f)
                lineToRelative(1.06f, 1.04f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
                moveTo(15.5f, 5f)
                horizontalLineToRelative(-4.5f)
                lineTo(11f, 1f)
                horizontalLineToRelative(6f)
                lineTo(17f, 0f)
                lineTo(4f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                lineTo(0f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                lineTo(0f, 11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -4.69f, -3.81f, -8.5f, -8.5f, -8.5f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _Faucet = it}
