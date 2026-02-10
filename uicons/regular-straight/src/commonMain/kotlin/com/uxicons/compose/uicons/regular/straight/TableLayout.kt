package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableLayout: ImageVector? = null

val Icons.Rs.TableLayout: ImageVector
    get() = _TableLayout ?: UXIcon(name = "TableLayout") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 4f)
                lineTo(21f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                lineTo(2f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 9f)
                lineTo(7f, 9f)
                verticalLineToRelative(11f)
                lineTo(2f, 20f)
                lineTo(2f, 9f)
                close()
                moveTo(9f, 20f)
                lineTo(9f, 9f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(11f)
                lineTo(9f, 20f)
                close()
            }
        }.also { _TableLayout = it}
