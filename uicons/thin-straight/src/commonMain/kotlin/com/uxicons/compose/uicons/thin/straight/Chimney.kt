package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chimney: ImageVector? = null

val Icons.Ts.Chimney: ImageVector
    get() = _Chimney ?: UXIcon(name = "Chimney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(3f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9f, 23f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
                moveTo(14f, 14f)
                verticalLineToRelative(4f)
                lineTo(4f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                close()
                moveTo(4f, 13f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(20f, 23f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                close()
                moveTo(23f, 8f)
                lineTo(1f, 8f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _Chimney = it}
