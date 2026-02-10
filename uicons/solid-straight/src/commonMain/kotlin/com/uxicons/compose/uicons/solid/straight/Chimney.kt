package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chimney: ImageVector? = null

val Icons.Ss.Chimney: ImageVector
    get() = _Chimney ?: UXIcon(name = "Chimney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 16f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(6f)
                close()
                moveTo(24f, 8f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(24f)
                close()
                moveTo(14f, 18f)
                lineTo(3f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
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
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Chimney = it}
