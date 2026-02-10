package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Rr.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 7f)
                lineTo(22f, 15f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15f, 15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 4f)
                verticalLineToRelative(5f)
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
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5f, 4f)
                lineTo(5f, 15f)
                lineTo(2f, 15f)
                lineTo(2f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(5f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(11f, 17f)
                verticalLineToRelative(3f)
                lineTo(5f, 20f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
