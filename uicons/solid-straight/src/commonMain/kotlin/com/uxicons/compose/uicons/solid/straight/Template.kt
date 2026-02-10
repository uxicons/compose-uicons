package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Template: ImageVector? = null

val Icons.Ss.Template: ImageVector
    get() = _Template ?: UXIcon(name = "Template") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(16f, 18f)
                lineTo(8f, 18f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
                moveTo(22f, 7f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(6f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 10f)
                lineTo(6f, 10f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(12f)
                lineTo(18f, 10f)
                close()
            }
        }.also { _Template = it}
