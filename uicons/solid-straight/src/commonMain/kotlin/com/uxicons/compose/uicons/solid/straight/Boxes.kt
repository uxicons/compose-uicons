package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boxes: ImageVector? = null

val Icons.Ss.Boxes: ImageVector
    get() = _Boxes ?: UXIcon(name = "Boxes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                lineTo(3f, 13f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(8f)
                lineTo(11f, 24f)
                lineTo(11f, 13f)
                close()
                moveTo(3.5f, 18f)
                verticalLineToRelative(-2f)
                lineTo(7.5f, 16f)
                verticalLineToRelative(2f)
                lineTo(3.5f, 18f)
                close()
                moveTo(21f, 13f)
                lineTo(13f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(20.5f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(6f, 11f)
                horizontalLineToRelative(12f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Boxes = it}
