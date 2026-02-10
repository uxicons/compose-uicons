package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mill: ImageVector? = null

val Icons.Ss.Mill: ImageVector
    get() = _Mill ?: UXIcon(name = "Mill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.71f, 21.42f)
                lineToRelative(0.29f, 2.58f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                lineToRelative(0.29f, -2.58f)
                lineToRelative(1.55f, 1.55f)
                lineToRelative(7.16f, -7.16f)
                lineToRelative(7.16f, 7.16f)
                lineToRelative(1.55f, -1.55f)
                close()
                moveTo(15.64f, 11.67f)
                lineToRelative(-0.53f, 0.53f)
                lineToRelative(-1.7f, -1.7f)
                lineToRelative(1.74f, -1.74f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(5.96f, -5.96f)
                lineToRelative(-2.48f, -2.48f)
                lineToRelative(-5.96f, 5.96f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(-1.74f, 1.74f)
                lineToRelative(-1.74f, -1.74f)
                lineToRelative(0.53f, -0.53f)
                lineTo(4.84f, 0.86f)
                lineTo(2.36f, 3.34f)
                lineToRelative(5.96f, 5.96f)
                lineToRelative(0.53f, -0.53f)
                lineToRelative(1.74f, 1.74f)
                lineToRelative(-1.7f, 1.7f)
                lineToRelative(-0.53f, -0.53f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(2.48f, 2.48f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(-0.53f, -0.53f)
                lineToRelative(1.7f, -1.7f)
                lineToRelative(1.7f, 1.7f)
                lineToRelative(-0.53f, 0.53f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(2.48f, -2.48f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(14.8f, 2.39f)
                lineTo(12f, -0.02f)
                lineToRelative(-2.81f, 2.41f)
                lineToRelative(2.81f, 2.81f)
                lineToRelative(2.81f, -2.81f)
                close()
                moveTo(19.77f, 12.97f)
                lineToRelative(-0.49f, -4.45f)
                lineToRelative(-1.98f, 1.98f)
                lineToRelative(2.47f, 2.47f)
                close()
                moveTo(4.23f, 12.97f)
                lineToRelative(2.47f, -2.47f)
                lineToRelative(-1.98f, -1.98f)
                lineToRelative(-0.49f, 4.45f)
                close()
            }
        }.also { _Mill = it}
