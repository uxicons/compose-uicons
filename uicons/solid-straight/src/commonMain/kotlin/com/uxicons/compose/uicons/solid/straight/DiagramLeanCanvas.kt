package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Ss.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 2f)
                close()
                moveTo(16f, 8f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
                moveTo(14f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(4f)
                lineTo(14f, 2f)
                close()
                moveTo(20f, 16f)
                horizontalLineToRelative(4f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(14f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 18f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-4f)
                lineTo(13f, 18f)
                close()
                moveTo(11f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(4f)
                lineTo(11f, 22f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(4f, 16f)
                lineTo(4f, 2f)
                horizontalLineToRelative(-1f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                verticalLineToRelative(11f)
                lineTo(4f, 16f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
