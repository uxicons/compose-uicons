package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableColumns: ImageVector? = null

val Icons.Sr.TableColumns: ImageVector
    get() = _TableColumns ?: UXIcon(name = "TableColumns") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 9f)
                lineTo(11f, 9f)
                verticalLineToRelative(13f)
                close()
                moveTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                lineTo(24f, 7f)
                close()
                moveTo(13f, 9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 9f)
                lineTo(13f, 9f)
                close()
            }
        }.also { _TableColumns = it}
