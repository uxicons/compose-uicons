package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUpRight: ImageVector? = null

val Icons.Rs.MessageArrowUpRight: ImageVector
    get() = _MessageArrowUpRight ?: UXIcon(name = "MessageArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(6.85f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-5.57f)
                lineToRelative(-4.45f, 3.65f)
                lineToRelative(-4.33f, -3.65f)
                lineTo(2f, 18f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(17f, 8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.58f)
                lineToRelative(-5.29f, 5.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.3f, -5.3f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(0.01f, -2f)
                lineToRelative(5.01f, 0.01f)
                curveToRelative(1.09f, 0f, 1.99f, 0.89f, 1.99f, 1.99f)
                close()
            }
        }.also { _MessageArrowUpRight = it}
