package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notes: ImageVector? = null

val Icons.Ss.Notes: ImageVector
    get() = _Notes ?: UXIcon(name = "Notes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.65f, 22f)
                lineToRelative(-2f, 2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-15.22f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(16.04f)
                horizontalLineToRelative(13.65f)
                close()
                moveTo(16f, 12f)
                horizontalLineToRelative(8f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-8f)
                close()
                moveTo(23.69f, 14f)
                horizontalLineToRelative(-5.69f)
                verticalLineToRelative(5.69f)
                lineToRelative(5.69f, -5.69f)
                close()
            }
        }.also { _Notes = it}
