package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableRows: ImageVector? = null

val Icons.Rs.TableRows: ImageVector
    get() = _TableRows ?: UXIcon(name = "TableRows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(6f)
                lineTo(7f, 11f)
                lineTo(7f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                lineTo(5f, 20f)
                lineTo(2f, 20f)
                lineTo(2f, 5f)
                close()
                moveTo(7f, 20f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(7f)
                lineTo(7f, 20f)
                close()
            }
        }.also { _TableRows = it}
