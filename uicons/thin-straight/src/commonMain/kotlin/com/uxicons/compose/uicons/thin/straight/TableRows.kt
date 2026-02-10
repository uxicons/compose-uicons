package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableRows: ImageVector? = null

val Icons.Ts.TableRows: ImageVector
    get() = _TableRows ?: UXIcon(name = "TableRows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 4.5f)
                verticalLineToRelative(6.5f)
                lineTo(6f, 11f)
                lineTo(6f, 3f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                lineTo(5f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 4.5f)
                close()
                moveTo(6f, 21f)
                lineTo(6f, 12f)
                lineTo(23f, 12f)
                verticalLineToRelative(9f)
                lineTo(6f, 21f)
                close()
            }
        }.also { _TableRows = it}
