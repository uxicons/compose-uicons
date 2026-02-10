package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meditation: ImageVector? = null

val Icons.Rs.Meditation: ImageVector
    get() = _Meditation ?: UXIcon(name = "Meditation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10.8f)
                verticalLineToRelative(7.66f)
                lineToRelative(6f, 3.92f)
                verticalLineToRelative(1.62f)
                lineTo(10f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.76f)
                lineToRelative(-3.76f, -2.46f)
                lineTo(14f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(9.54f)
                lineToRelative(-3.76f, 2.46f)
                horizontalLineToRelative(1.76f)
                verticalLineToRelative(2f)
                lineTo(2f, 24f)
                verticalLineToRelative(-1.62f)
                lineToRelative(6f, -3.92f)
                verticalLineToRelative(-7.66f)
                lineToRelative(-2.28f, 3.42f)
                lineToRelative(-4.17f, 2.73f)
                lineToRelative(-1.09f, -1.67f)
                lineToRelative(3.83f, -2.5f)
                lineToRelative(2.29f, -3.44f)
                curveToRelative(0.56f, -0.84f, 1.49f, -1.34f, 2.5f, -1.34f)
                horizontalLineToRelative(5.86f)
                curveToRelative(1.0f, 0f, 1.94f, 0.5f, 2.5f, 1.34f)
                lineToRelative(2.29f, 3.44f)
                lineToRelative(3.83f, 2.5f)
                lineToRelative(-1.09f, 1.67f)
                lineToRelative(-4.17f, -2.73f)
                lineToRelative(-2.28f, -3.42f)
                close()
                moveTo(12.0f, 6f)
                curveToRelative(1.69f, 0f, 2.95f, -1.34f, 2.95f, -3f)
                reflectiveCurveToRelative(-1.26f, -3f, -2.95f, -3f)
                reflectiveCurveToRelative(-3.05f, 1.34f, -3.05f, 3f)
                reflectiveCurveToRelative(1.37f, 3f, 3.05f, 3f)
                close()
            }
        }.also { _Meditation = it}
