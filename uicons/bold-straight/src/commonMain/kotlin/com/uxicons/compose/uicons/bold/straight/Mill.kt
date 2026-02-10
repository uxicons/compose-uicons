package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mill: ImageVector? = null

val Icons.Bs.Mill: ImageVector
    get() = _Mill ?: UXIcon(name = "Mill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.95f, 10.5f)
                lineToRelative(2.28f, -2.28f)
                lineToRelative(0.65f, 5.21f)
                lineToRelative(-2.93f, -2.93f)
                close()
                moveTo(4.12f, 13.43f)
                lineToRelative(2.93f, -2.93f)
                lineToRelative(-2.28f, -2.28f)
                lineToRelative(-0.65f, 5.21f)
                close()
                moveTo(21.46f, 17.84f)
                lineToRelative(-0.93f, 0.93f)
                lineToRelative(0.67f, 5.23f)
                lineTo(2.8f, 24f)
                lineToRelative(0.67f, -5.23f)
                lineToRelative(-0.93f, -0.93f)
                lineToRelative(7.34f, -7.34f)
                lineTo(2.54f, 3.16f)
                lineTo(4.66f, 1.04f)
                lineToRelative(2.77f, 2.77f)
                lineTo(12f, 0.06f)
                lineToRelative(4.57f, 3.74f)
                lineToRelative(2.77f, -2.77f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-7.34f, 7.34f)
                lineToRelative(7.34f, 7.34f)
                close()
                moveTo(12f, 8.38f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(-2.44f, -2.0f)
                lineToRelative(-2.44f, 2.0f)
                lineToRelative(2.44f, 2.44f)
                close()
                moveTo(17.8f, 21f)
                lineToRelative(-0.38f, -2.95f)
                lineToRelative(-5.43f, -5.43f)
                lineToRelative(-5.43f, 5.43f)
                lineToRelative(-0.38f, 2.95f)
                horizontalLineToRelative(3.8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.8f)
                close()
            }
        }.also { _Mill = it}
