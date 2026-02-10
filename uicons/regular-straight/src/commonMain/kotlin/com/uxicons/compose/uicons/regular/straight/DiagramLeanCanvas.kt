package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Rs.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 5f)
                lineTo(22f, 15f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                lineTo(13f, 15f)
                close()
                moveTo(9f, 9f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(2f)
                lineTo(5f, 15f)
                lineTo(2f, 15f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 17f)
                lineTo(11f, 17f)
                verticalLineToRelative(3f)
                lineTo(2f, 20f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                lineTo(13f, 20f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
