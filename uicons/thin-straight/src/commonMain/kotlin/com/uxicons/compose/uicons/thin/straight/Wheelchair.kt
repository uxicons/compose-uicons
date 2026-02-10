package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wheelchair: ImageVector? = null

val Icons.Ts.Wheelchair: ImageVector
    get() = _Wheelchair ?: UXIcon(name = "Wheelchair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.36f, 22f)
                lineToRelative(-2f, -6f)
                horizontalLineToRelative(-6.86f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4.04f)
                curveToRelative(1.69f, -0.24f, 3f, -1.7f, 3f, -3.46f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.76f, 1.31f, 3.22f, 3f, 3.46f)
                verticalLineToRelative(7.54f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.43f)
                curveToRelative(-0.49f, 3.39f, -3.41f, 6f, -6.93f, 6f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                verticalLineToRelative(-1f)
                curveTo(3.59f, 8f, 0f, 11.59f, 0f, 16f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(4.07f, 0f, 7.44f, -3.06f, 7.94f, -7f)
                horizontalLineToRelative(2.7f)
                lineToRelative(2f, 6f)
                horizontalLineToRelative(3.36f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.64f)
                close()
                moveTo(8f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _Wheelchair = it}
