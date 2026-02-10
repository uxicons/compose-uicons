package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Iot: ImageVector? = null

val Icons.Rs.Iot: ImageVector
    get() = _Iot ?: UXIcon(name = "Iot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.66f, 6.34f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
                reflectiveCurveToRelative(-3.11f, 0.62f, -4.24f, 1.76f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.15f, 0.83f, 5.66f, 2.34f)
                close()
                moveTo(6.34f, 17.66f)
                curveToRelative(1.56f, 1.56f, 3.61f, 2.34f, 5.66f, 2.34f)
                reflectiveCurveToRelative(4.1f, -0.78f, 5.66f, -2.34f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-2.34f, 2.34f, -6.15f, 2.34f, -8.48f, 0f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(12.0f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12.0f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(19.07f, 4.93f)
                lineToRelative(1.41f, -1.41f)
                curveTo(15.81f, -1.16f, 8.19f, -1.16f, 3.52f, 3.52f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(3.9f, -3.9f, 10.24f, -3.9f, 14.14f, 0f)
                close()
                moveTo(4.93f, 19.07f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(2.34f, 2.34f, 5.41f, 3.51f, 8.48f, 3.51f)
                reflectiveCurveToRelative(6.15f, -1.17f, 8.48f, -3.51f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-3.9f, 3.9f, -10.24f, 3.9f, -14.14f, 0f)
                close()
                moveTo(17f, 8.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Iot = it}
