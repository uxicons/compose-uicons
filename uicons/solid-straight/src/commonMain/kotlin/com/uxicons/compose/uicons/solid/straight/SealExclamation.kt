package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SealExclamation: ImageVector? = null

val Icons.Ss.SealExclamation: ImageVector
    get() = _SealExclamation ?: UXIcon(name = "SealExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 8.48f)
                lineTo(20.5f, 3.5f)
                horizontalLineToRelative(-4.98f)
                lineTo(12f, -0.02f)
                lineToRelative(-3.52f, 3.52f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.98f)
                lineTo(-0.02f, 12f)
                lineToRelative(3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(4.98f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(3.52f, -3.52f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(-4.98f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(-3.52f, -3.52f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 6f)
                horizontalLineToRelative(2f)
                lineTo(13f, 14f)
                close()
            }
        }.also { _SealExclamation = it}
