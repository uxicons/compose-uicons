package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chimney: ImageVector? = null

val Icons.Tr.Chimney: ImageVector
    get() = _Chimney ?: UXIcon(name = "Chimney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(9f, 9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(20f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(14f, 18f)
                lineTo(4f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                close()
                moveTo(4f, 20.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _Chimney = it}
