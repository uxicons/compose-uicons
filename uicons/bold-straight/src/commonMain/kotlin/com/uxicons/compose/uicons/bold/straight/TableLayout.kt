package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableLayout: ImageVector? = null

val Icons.Bs.TableLayout: ImageVector
    get() = _TableLayout ?: UXIcon(name = "TableLayout") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 5f)
                lineTo(20.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(3f, 7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 10f)
                lineTo(7f, 10f)
                verticalLineToRelative(9f)
                lineTo(3f, 19f)
                lineTo(3f, 10f)
                close()
                moveTo(10f, 19f)
                lineTo(10f, 10f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                lineTo(10f, 19f)
                close()
            }
        }.also { _TableLayout = it}
