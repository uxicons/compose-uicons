package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DormRoom: ImageVector? = null

val Icons.Bs.DormRoom: ImageVector
    get() = _DormRoom ?: UXIcon(name = "DormRoom") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.16f)
                verticalLineToRelative(13.84f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-13.84f)
                curveToRelative(0f, -0.15f, -0.07f, -0.3f, -0.19f, -0.39f)
                lineTo(12.31f, 3.12f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.62f, 0f)
                lineTo(3.19f, 9.77f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(13.84f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.84f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(9.84f, 0.76f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(8.5f, 6.65f)
                curveToRelative(0.85f, 0.67f, 1.34f, 1.67f, 1.34f, 2.76f)
                close()
                moveTo(19f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(12f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(12f, 18.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _DormRoom = it}
