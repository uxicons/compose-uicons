package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fort: ImageVector? = null

val Icons.Bs.Fort: ImageVector
    get() = _Fort ?: UXIcon(name = "Fort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(14.0f, 4f)
                curveToRelative(0f, 0.88f, 0.38f, 1.68f, 0.99f, 2.22f)
                lineToRelative(0.01f, 4.78f)
                horizontalLineToRelative(-5.99f)
                lineTo(9f, 6.23f)
                curveToRelative(0.61f, -0.55f, 1f, -1.35f, 1f, -2.23f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 4f)
                curveToRelative(0f, 0.89f, 0.39f, 1.68f, 1f, 2.23f)
                lineTo(1f, 24f)
                lineTo(23f, 24f)
                lineTo(23f, 6.23f)
                curveToRelative(0.61f, -0.55f, 1f, -1.35f, 1f, -2.23f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(14f, 21f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                lineTo(4f, 21f)
                lineTo(4f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(12f)
                lineToRelative(-0.01f, -7f)
                horizontalLineToRelative(2.01f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Fort = it}
