package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableTree: ImageVector? = null

val Icons.Ss.TableTree: ImageVector
    get() = _TableTree ?: UXIcon(name = "TableTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(5f, 19f)
                lineTo(5f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(13f)
                lineTo(24f, 22f)
                lineTo(24f, 9f)
                lineTo(7f, 9f)
                close()
                moveTo(12f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(0f, 7f)
                close()
            }
        }.also { _TableTree = it}
