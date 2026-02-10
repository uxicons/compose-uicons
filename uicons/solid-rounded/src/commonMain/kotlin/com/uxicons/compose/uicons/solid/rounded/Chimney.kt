package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chimney: ImageVector? = null

val Icons.Sr.Chimney: ImageVector
    get() = _Chimney ?: UXIcon(name = "Chimney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 16f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(6f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(14f, 18f)
                lineTo(3f, 18f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-6f)
                close()
                moveTo(8f, 10f)
                lineTo(3f, 10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Chimney = it}
