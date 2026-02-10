package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner4: ImageVector? = null

val Icons.Ss.Banner4: ImageVector
    get() = _Banner4 ?: UXIcon(name = "Banner4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 10f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(8f)
                lineTo(6f, 18f)
                verticalLineToRelative(-8f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                lineTo(0f, 6f)
                verticalLineToRelative(0.07f)
                lineToRelative(3.11f, 3.93f)
                lineToRelative(-3.11f, 3.93f)
                verticalLineToRelative(0.07f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-0.07f)
                reflectiveCurveToRelative(-3.11f, -3.93f, -3.11f, -3.93f)
                lineToRelative(3.11f, -3.93f)
                verticalLineToRelative(-0.07f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                reflectiveCurveToRelative(0f, 6f, 0f, 6f)
                close()
            }
        }.also { _Banner4 = it}
