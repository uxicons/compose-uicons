package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marketplace: ImageVector? = null

val Icons.Bs.Marketplace: ImageVector
    get() = _Marketplace ?: UXIcon(name = "Marketplace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(-0.07f, -0.23f, -0.14f, -0.46f, -0.17f, -0.7f)
                lineToRelative(-0.34f, -2.3f)
                lineTo(3f, 19f)
                lineTo(3f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(4.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17f, 9f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(1.03f, 7.01f)
                curveToRelative(0.25f, 1.71f, 1.74f, 2.99f, 3.46f, 2.99f)
                horizontalLineToRelative(4.94f)
                curveToRelative(1.72f, 0f, 3.21f, -1.29f, 3.46f, -2.99f)
                lineToRelative(1.03f, -7.01f)
                horizontalLineToRelative(-1.97f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17f, 12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(19.97f, 20.57f)
                curveToRelative(-0.04f, 0.24f, -0.25f, 0.43f, -0.49f, 0.43f)
                horizontalLineToRelative(-4.94f)
                curveToRelative(-0.25f, 0f, -0.46f, -0.18f, -0.49f, -0.43f)
                lineToRelative(-0.52f, -3.57f)
                horizontalLineToRelative(6.98f)
                lineToRelative(-0.53f, 3.57f)
                close()
            }
        }.also { _Marketplace = it}
