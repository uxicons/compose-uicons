package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopCode: ImageVector? = null

val Icons.Bs.LaptopCode: ImageVector
    get() = _LaptopCode ?: UXIcon(name = "LaptopCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.21f, 11.04f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.26f, -2.26f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.09f, -0.73f, -1.76f)
                reflectiveCurveToRelative(0.26f, -1.29f, 0.73f, -1.76f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.89f, 1.89f)
                close()
                moveTo(17.27f, 9.28f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.26f, -2.26f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.09f, 0.73f, -1.76f)
                reflectiveCurveToRelative(-0.26f, -1.29f, -0.73f, -1.76f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 21f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                lineTo(2f, 16f)
                lineTo(2f, 3f)
                lineTo(22f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15.69f, 16f)
                horizontalLineToRelative(3.31f)
                lineTo(19f, 6f)
                lineTo(5f, 6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(5.54f)
                lineToRelative(0.92f, -1f)
                close()
            }
        }.also { _LaptopCode = it}
