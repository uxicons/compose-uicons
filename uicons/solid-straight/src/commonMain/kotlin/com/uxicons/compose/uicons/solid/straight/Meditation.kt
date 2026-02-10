package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meditation: ImageVector? = null

val Icons.Ss.Meditation: ImageVector
    get() = _Meditation ?: UXIcon(name = "Meditation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.95f, 3f)
                curveToRelative(0f, -1.66f, 1.37f, -3f, 3.05f, -3f)
                reflectiveCurveToRelative(2.95f, 1.34f, 2.95f, 3f)
                reflectiveCurveToRelative(-1.26f, 3f, -2.95f, 3f)
                reflectiveCurveToRelative(-3.05f, -1.34f, -3.05f, -3f)
                close()
                moveTo(18.28f, 14.22f)
                lineToRelative(4.17f, 2.73f)
                lineToRelative(1.09f, -1.67f)
                lineToRelative(-3.83f, -2.5f)
                lineToRelative(-2.29f, -3.44f)
                curveToRelative(-0.56f, -0.84f, -1.49f, -1.34f, -2.5f, -1.34f)
                horizontalLineToRelative(-5.86f)
                curveToRelative(-1.0f, 0f, -1.94f, 0.5f, -2.5f, 1.34f)
                lineToRelative(-2.29f, 3.44f)
                lineTo(0.45f, 15.28f)
                lineToRelative(1.09f, 1.67f)
                lineToRelative(4.17f, -2.73f)
                lineToRelative(2.28f, -3.42f)
                verticalLineToRelative(7.66f)
                lineToRelative(-6f, 3.81f)
                verticalLineToRelative(1.73f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                reflectiveCurveToRelative(5.7f, 0f, 5.7f, 0f)
                lineToRelative(3.06f, 2f)
                horizontalLineToRelative(-6.76f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1.62f)
                lineToRelative(-6f, -3.92f)
                verticalLineToRelative(-7.66f)
                lineToRelative(2.28f, 3.42f)
                close()
            }
        }.also { _Meditation = it}
