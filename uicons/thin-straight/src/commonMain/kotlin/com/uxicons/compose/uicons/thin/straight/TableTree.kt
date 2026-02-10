package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableTree: ImageVector? = null

val Icons.Ts.TableTree: ImageVector
    get() = _TableTree ?: UXIcon(name = "TableTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                lineTo(1f, 7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 21f)
                lineTo(1f, 8f)
                lineTo(5f, 8f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                lineTo(6f, 16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(6f, 12f)
                verticalLineToRelative(-4f)
                lineTo(23f, 8f)
                verticalLineToRelative(13f)
                lineTo(1f, 21f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _TableTree = it}
