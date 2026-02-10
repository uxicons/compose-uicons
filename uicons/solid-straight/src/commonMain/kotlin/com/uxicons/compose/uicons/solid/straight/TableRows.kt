package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableRows: ImageVector? = null

val Icons.Ss.TableRows: ImageVector
    get() = _TableRows ?: UXIcon(name = "TableRows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                lineTo(7f, 11f)
                lineTo(7f, 2f)
                close()
                moveTo(7f, 13f)
                verticalLineToRelative(9f)
                lineTo(24f, 22f)
                lineTo(24f, 13f)
                lineTo(7f, 13f)
                close()
                moveTo(5f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(5f, 22f)
                lineTo(5f, 2f)
                close()
            }
        }.also { _TableRows = it}
