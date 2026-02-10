package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clapperboard: ImageVector? = null

val Icons.Rr.Clapperboard: ImageVector
    get() = _Clapperboard ?: UXIcon(name = "Clapperboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 1f)
                lineTo(5f, 1f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(19f, 3f)
                curveToRelative(0.07f, 0f, 0.14f, 0.0f, 0.2f, 0.01f)
                lineToRelative(-3.99f, 3.99f)
                horizontalLineToRelative(-3.42f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(3.21f)
                close()
                moveTo(12.96f, 3f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(-3.52f)
                lineToRelative(4.09f, -4f)
                horizontalLineToRelative(3.43f)
                close()
                moveTo(2f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1.67f)
                lineTo(2.6f, 7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(9f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(3.1f, -3.1f)
                curveToRelative(0.53f, 0.54f, 0.86f, 1.28f, 0.86f, 2.1f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Clapperboard = it}
