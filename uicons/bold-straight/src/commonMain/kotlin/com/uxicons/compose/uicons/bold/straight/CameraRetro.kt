package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRetro: ImageVector? = null

val Icons.Bs.CameraRetro: ImageVector
    get() = _CameraRetro ?: UXIcon(name = "CameraRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 1f)
                horizontalLineToRelative(-8.12f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-2.38f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 7f)
                horizontalLineToRelative(7.12f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(6.88f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3.88f)
                curveToRelative(-0.8f, -2.05f, -2.8f, -3.5f, -5.12f, -3.5f)
                reflectiveCurveToRelative(-4.32f, 1.45f, -5.12f, 3.5f)
                horizontalLineToRelative(-3.88f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(14.5f, 14f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.59f)
                curveToRelative(0.47f, 2.56f, 2.72f, 4.5f, 5.41f, 4.5f)
                reflectiveCurveToRelative(4.94f, -1.94f, 5.41f, -4.5f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(6f)
                lineTo(3f, 21f)
                close()
            }
        }.also { _CameraRetro = it}
