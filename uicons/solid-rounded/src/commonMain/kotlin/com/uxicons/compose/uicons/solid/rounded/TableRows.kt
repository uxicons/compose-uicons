package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableRows: ImageVector? = null

val Icons.Sr.TableRows: ImageVector
    get() = _TableRows ?: UXIcon(name = "TableRows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                lineTo(5f, 22f)
                close()
                moveTo(7f, 11f)
                lineTo(24f, 11f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 2f)
                lineTo(7f, 11f)
                close()
                moveTo(7f, 13f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4f)
                lineTo(7f, 13f)
                close()
            }
        }.also { _TableRows = it}
