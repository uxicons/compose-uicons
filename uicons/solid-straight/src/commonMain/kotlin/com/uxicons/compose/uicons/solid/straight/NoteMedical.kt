package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteMedical: ImageVector? = null

val Icons.Ss.NoteMedical: ImageVector
    get() = _NoteMedical ?: UXIcon(name = "NoteMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 24f)
                lineToRelative(0f, -6f)
                lineToRelative(6f, 0f)
                lineToRelative(-6f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _NoteMedical = it}
