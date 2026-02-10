package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GridDividers: ImageVector? = null

val Icons.Bs.GridDividers: ImageVector
    get() = _GridDividers ?: UXIcon(name = "GridDividers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 0f)
                lineTo(24f, 0f)
                lineTo(24f, 3f)
                close()
                moveTo(24f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(3f)
                lineTo(24f, 16f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6f, 5f)
                lineTo(0f, 5f)
                verticalLineToRelative(6f)
                lineTo(6f, 11f)
                lineTo(6f, 5f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(15f, 5f)
                close()
                moveTo(24f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(24f, 5f)
                close()
                moveTo(6f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                lineTo(6f, 24f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(24f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _GridDividers = it}
