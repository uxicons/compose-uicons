package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableColumns: ImageVector? = null

val Icons.Ss.TableColumns: ImageVector
    get() = _TableColumns ?: UXIcon(name = "TableColumns") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(0f, 7f)
                close()
                moveTo(11f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(13f)
                lineTo(11f, 22f)
                lineTo(11f, 9f)
                close()
                moveTo(13f, 9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(11f)
                lineTo(24f, 9f)
                lineTo(13f, 9f)
                close()
            }
        }.also { _TableColumns = it}
