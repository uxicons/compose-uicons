package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notes: ImageVector? = null

val Icons.Ts.Notes: ImageVector
    get() = _Notes ?: UXIcon(name = "Notes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(14.98f)
                lineToRelative(6.02f, -6.02f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(4f, 20f)
                lineTo(4f, 2.5f)
                close()
                moveTo(22.57f, 15f)
                lineToRelative(-4.57f, 4.57f)
                verticalLineToRelative(-4.57f)
                horizontalLineToRelative(4.57f)
                close()
                moveTo(1f, 23f)
                horizontalLineToRelative(15f)
                lineToRelative(-1f, 1f)
                lineTo(0f, 24f)
                lineTo(0f, 7.22f)
                curveToRelative(0f, -0.89f, 0.39f, -1.68f, 1f, -2.22f)
                verticalLineToRelative(18f)
                close()
            }
        }.also { _Notes = it}
