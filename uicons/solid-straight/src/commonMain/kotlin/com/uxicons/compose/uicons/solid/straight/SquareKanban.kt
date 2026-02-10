package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareKanban: ImageVector? = null

val Icons.Ss.SquareKanban: ImageVector
    get() = _SquareKanban ?: UXIcon(name = "SquareKanban") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 15f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 5f)
                horizontalLineToRelative(2f)
                lineTo(7f, 15f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                close()
                moveTo(15f, 19f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                close()
                moveTo(19f, 9f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _SquareKanban = it}
