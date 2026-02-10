package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Sr.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                close()
                moveTo(16f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 16f)
                horizontalLineToRelative(4f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.41f, -1.72f, -4.43f, -4f, -4.9f)
                verticalLineToRelative(13.9f)
                close()
                moveTo(6f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4f, 16f)
                lineTo(4f, 2.1f)
                curveTo(1.72f, 2.57f, 0f, 4.59f, 0f, 7f)
                verticalLineToRelative(9f)
                lineTo(4f, 16f)
                close()
                moveTo(11.01f, 18f)
                lineTo(0.1f, 18f)
                curveToRelative(0.46f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                close()
                moveTo(13.02f, 18f)
                verticalLineToRelative(4f)
                reflectiveCurveToRelative(5.99f, 0f, 5.99f, 0f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                lineTo(13.01f, 18f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 7f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 7f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
