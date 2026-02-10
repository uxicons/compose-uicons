package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageImage: ImageVector? = null

val Icons.Bs.MessageImage: ImageVector
    get() = _MessageImage ?: UXIcon(name = "MessageImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.74f)
                lineToRelative(3.6f, 3.03f)
                curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.68f, 0.64f)
                curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
                lineToRelative(3.71f, -3.06f)
                horizontalLineToRelative(6.67f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.38f)
                lineToRelative(-6f, 6f)
                lineToRelative(-4f, -4f)
                lineTo(3f, 14.88f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(16.25f, 17f)
                lineToRelative(-4.25f, 3.51f)
                lineToRelative(-4.17f, -3.51f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(5.88f, -5.88f)
                lineToRelative(4f, 4f)
                lineToRelative(6f, -6f)
                verticalLineToRelative(7.88f)
                horizontalLineToRelative(-4.75f)
                close()
                moveTo(5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _MessageImage = it}
