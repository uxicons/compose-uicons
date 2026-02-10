package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeatReclined: ImageVector? = null

val Icons.Bs.PersonSeatReclined: ImageVector
    get() = _PersonSeatReclined ?: UXIcon(name = "PersonSeatReclined") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20.95f, 21f)
                lineToRelative(-3.5f, -7f)
                horizontalLineToRelative(-7.22f)
                curveToRelative(-0.23f, 0f, -0.44f, -0.17f, -0.49f, -0.4f)
                lineToRelative(-0.34f, -1.6f)
                horizontalLineToRelative(6.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.23f)
                lineToRelative(-0.42f, -2f)
                horizontalLineToRelative(-3.06f)
                lineToRelative(1.51f, 7.22f)
                curveToRelative(0.34f, 1.61f, 1.78f, 2.78f, 3.43f, 2.78f)
                horizontalLineToRelative(5.37f)
                lineToRelative(3.5f, 7f)
                horizontalLineToRelative(3.93f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.07f)
                close()
                moveTo(10.14f, 19f)
                curveToRelative(-2.57f, 0f, -4.83f, -1.82f, -5.38f, -4.33f)
                lineToRelative(-1.66f, -7.67f)
                lineTo(0.04f, 7f)
                lineToRelative(1.8f, 8.3f)
                curveToRelative(0.84f, 3.88f, 4.33f, 6.7f, 8.31f, 6.7f)
                horizontalLineToRelative(5.71f)
                lineToRelative(-1.5f, -3f)
                horizontalLineToRelative(-4.21f)
                close()
            }
        }.also { _PersonSeatReclined = it}
