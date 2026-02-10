package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Ts.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.45f, 10.2f)
                lineToRelative(-4.44f, -2.96f)
                lineTo(15.01f, 0.01f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(7.23f)
                lineToRelative(-4.44f, 2.96f)
                curveToRelative(-0.98f, 0.65f, -1.56f, 1.74f, -1.56f, 2.91f)
                verticalLineToRelative(10.9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-10.9f)
                curveToRelative(0f, -1.17f, -0.58f, -2.26f, -1.56f, -2.91f)
                close()
                moveTo(14.01f, 1.01f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4f)
                close()
                moveTo(20.01f, 23.01f)
                lineTo(4.01f, 23.01f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                lineTo(4.01f, 14.01f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -0.84f, 0.42f, -1.61f, 1.11f, -2.08f)
                lineToRelative(4.89f, -3.26f)
                verticalLineToRelative(-3.77f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.77f)
                lineToRelative(4.89f, 3.26f)
                curveToRelative(0.7f, 0.46f, 1.11f, 1.24f, 1.11f, 2.08f)
                verticalLineToRelative(9.9f)
                close()
            }
        }.also { _WineBottle = it}
