package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GridDividers: ImageVector? = null

val Icons.Ss.GridDividers: ImageVector
    get() = _GridDividers ?: UXIcon(name = "GridDividers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(24f, 0f)
                lineTo(24f, 2f)
                close()
                moveTo(24f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(2f)
                lineTo(24f, 14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(6f)
                lineTo(6f, 10f)
                lineTo(6f, 4f)
                close()
                moveTo(15f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(15f, 4f)
                close()
                moveTo(24f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(24f, 4f)
                close()
                moveTo(6f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(6f)
                lineTo(6f, 22f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(24f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _GridDividers = it}
