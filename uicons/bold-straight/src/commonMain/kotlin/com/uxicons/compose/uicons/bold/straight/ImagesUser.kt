package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImagesUser: ImageVector? = null

val Icons.Bs.ImagesUser: ImageVector
    get() = _ImagesUser ?: UXIcon(name = "ImagesUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(19f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(13.95f)
                close()
                moveTo(17f, 8.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _ImagesUser = it}
