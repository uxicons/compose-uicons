package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTree: ImageVector? = null

val Icons.Bs.HouseTree: ImageVector
    get() = _HouseTree ?: UXIcon(name = "HouseTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.66f, 12.87f)
                lineToRelative(-4f, -3.13f)
                curveToRelative(-1.27f, -0.99f, -3.04f, -0.99f, -4.31f, 0f)
                lineTo(1.34f, 12.87f)
                curveToRelative(-0.85f, 0.67f, -1.34f, 1.67f, -1.34f, 2.76f)
                verticalLineToRelative(8.37f)
                lineTo(15f, 24f)
                lineTo(15f, 15.63f)
                curveToRelative(0f, -1.08f, -0.49f, -2.09f, -1.34f, -2.76f)
                close()
                moveTo(12f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-5.37f)
                curveToRelative(0f, -0.15f, 0.07f, -0.3f, 0.19f, -0.39f)
                lineToRelative(4f, -3.13f)
                curveToRelative(0.18f, -0.14f, 0.43f, -0.14f, 0.62f, 0f)
                lineToRelative(4.0f, 3.13f)
                curveToRelative(0.12f, 0.1f, 0.19f, 0.24f, 0.19f, 0.4f)
                verticalLineToRelative(5.37f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(2.23f)
                lineToRelative(-3f, -7f)
                horizontalLineToRelative(1.32f)
                lineToRelative(-2.96f, -6f)
                horizontalLineToRelative(1.75f)
                lineToRelative(-2.78f, -5.0f)
                curveToRelative(-0.01f, 0.01f, -0.04f, 0.0f, -0.06f, 0f)
                curveToRelative(-0.02f, 0f, -0.04f, 0.01f, -0.07f, 0.01f)
                lineToRelative(-2.77f, 5f)
                curveToRelative(-0.87f, -0.61f, -1.87f, -0.94f, -2.88f, -0.99f)
                lineTo(10.98f, 1.26f)
                curveToRelative(0.53f, -0.76f, 1.52f, -1.26f, 2.52f, -1.26f)
                reflectiveCurveToRelative(1.99f, 0.49f, 2.52f, 1.26f)
                lineToRelative(5.43f, 9.74f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(2.96f, 6f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(3f, 7f)
                horizontalLineToRelative(-6.78f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _HouseTree = it}
