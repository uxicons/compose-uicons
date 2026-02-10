package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Ts.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 4.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-4f)
                lineTo(19f, 3f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 17f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(9f, 10f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(14f)
                lineTo(1f, 17f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 18f)
                lineTo(11.5f, 18f)
                verticalLineToRelative(3f)
                lineTo(1f, 21f)
                verticalLineToRelative(-3f)
                close()
                moveTo(12.5f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3f)
                lineTo(12.5f, 21f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
