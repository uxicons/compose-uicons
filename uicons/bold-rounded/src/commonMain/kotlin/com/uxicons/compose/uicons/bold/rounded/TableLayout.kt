package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableLayout: ImageVector? = null

val Icons.Br.TableLayout: ImageVector
    get() = _TableLayout ?: UXIcon(name = "TableLayout") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 2f)
            lineTo(5.5f, 2f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(5.5f, 5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
            lineTo(3.05f, 7f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
            close()
            moveTo(3f, 16.5f)
            verticalLineToRelative(-6.5f)
            lineTo(7f, 10f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18.5f, 19f)
            lineTo(10f, 19f)
            lineTo(10f, 10f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _TableLayout = it }
