package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarOil: ImageVector? = null

val Icons.Bs.CarOil: ImageVector
    get() = _CarOil ?: UXIcon(name = "CarOil") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 12.88f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(-0.59f, 0.59f, -1.35f, 0.88f, -2.12f, 0.88f)
                curveToRelative(-0.77f, 0f, -1.54f, -0.29f, -2.12f, -0.88f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                lineToRelative(2.12f, -2.11f)
                close()
                moveTo(20.37f, 5.63f)
                lineTo(22f, 7.26f)
                verticalLineToRelative(16.74f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9.24f)
                lineToRelative(2.13f, 2.13f)
                lineToRelative(1.69f, -1.69f)
                lineToRelative(3.5f, 3.5f)
                close()
                moveTo(5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
                moveTo(19f, 8.51f)
                lineTo(15.0f, 4.5f)
                curveToRelative(-0.0f, 1.93f, -1.57f, 3.49f, -3.5f, 3.49f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _CarOil = it}
