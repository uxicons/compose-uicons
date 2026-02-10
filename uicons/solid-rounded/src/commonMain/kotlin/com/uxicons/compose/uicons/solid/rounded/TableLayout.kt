package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableLayout: ImageVector? = null

val Icons.Sr.TableLayout: ImageVector
    get() = _TableLayout ?: UXIcon(name = "TableLayout") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                lineTo(0f, 7f)
                close()
                moveTo(7f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(2f)
                lineTo(7f, 9f)
                close()
                moveTo(9f, 9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 9f)
                lineTo(9f, 9f)
                close()
            }
        }.also { _TableLayout = it}
