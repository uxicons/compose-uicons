package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lamp: ImageVector? = null

val Icons.Bs.Lamp: ImageVector
    get() = _Lamp ?: UXIcon(name = "Lamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 19f)
                reflectiveCurveToRelative(-2f, 0f, -2f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(10.49f)
                lineToRelative(-2.01f, -12.07f)
                curveToRelative(-0.28f, -1.7f, -1.73f, -2.93f, -3.45f, -2.93f)
                horizontalLineTo(5.48f)
                curveToRelative(-1.72f, 0f, -3.17f, 1.23f, -3.45f, 2.92f)
                lineTo(0.01f, 15f)
                horizontalLineToRelative(10.49f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.5f, -2f, 1.5f, -2f, 1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.98f, 3.42f)
                curveToRelative(0.04f, -0.24f, 0.25f, -0.42f, 0.49f, -0.42f)
                horizontalLineToRelative(13.05f)
                curveToRelative(0.24f, 0f, 0.45f, 0.17f, 0.49f, 0.42f)
                lineToRelative(1.43f, 8.58f)
                horizontalLineTo(3.55f)
                lineToRelative(1.43f, -8.58f)
                close()
            }
        }.also { _Lamp = it}
