package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageHeart: ImageVector? = null

val Icons.Bs.MessageHeart: ImageVector
    get() = _MessageHeart ?: UXIcon(name = "MessageHeart") {
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
                moveTo(21f, 17f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(-4.24f, 3.51f)
                lineToRelative(-4.17f, -3.51f)
                lineTo(3f, 17f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(17f, 8.75f)
                curveToRelative(0f, 2.88f, -5f, 6.25f, -5f, 6.25f)
                curveToRelative(0f, 0f, -5f, -3.37f, -5f, -6.25f)
                curveToRelative(0f, -1.52f, 1.12f, -2.75f, 2.5f, -2.75f)
                reflectiveCurveToRelative(2.5f, 1.23f, 2.5f, 2.75f)
                curveToRelative(0f, -1.52f, 1.12f, -2.75f, 2.5f, -2.75f)
                reflectiveCurveToRelative(2.5f, 1.23f, 2.5f, 2.75f)
                close()
            }
        }.also { _MessageHeart = it}
