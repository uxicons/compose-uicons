package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Bs.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 15f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 4f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(7f, 11.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(15f, 11.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(17f, 4f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 4f)
                lineTo(13f, 15f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 4f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3.5f, 4f)
                horizontalLineToRelative(1.5f)
                lineTo(5f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 20f)
                verticalLineToRelative(-2f)
                lineTo(11f, 18f)
                verticalLineToRelative(2f)
                lineTo(3f, 20f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(13f, 20f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
