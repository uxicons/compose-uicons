package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Receipt: ImageVector? = null

val Icons.Ts.Receipt: ImageVector
    get() = _Receipt ?: UXIcon(name = "Receipt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.51f, -0.01f)
                lineTo(5.49f, -0.01f)
                curveTo(4.12f, -0.01f, 3f, 1.11f, 3f, 2.49f)
                verticalLineToRelative(21.5f)
                lineToRelative(3.67f, -2.53f)
                lineToRelative(2.67f, 1.83f)
                lineToRelative(2.67f, -1.83f)
                lineToRelative(2.67f, 1.83f)
                lineToRelative(2.66f, -1.83f)
                lineToRelative(3.67f, 2.52f)
                lineTo(21f, 2.49f)
                curveTo(21f, 1.11f, 19.88f, -0.01f, 18.51f, -0.01f)
                close()
                moveTo(20f, 22.09f)
                lineToRelative(-2.67f, -1.83f)
                lineToRelative(-2.66f, 1.83f)
                lineToRelative(-2.67f, -1.83f)
                lineToRelative(-2.67f, 1.83f)
                lineToRelative(-2.67f, -1.83f)
                lineToRelative(-2.67f, 1.84f)
                lineTo(4f, 2.49f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.49f, -1.5f)
                horizontalLineToRelative(13.02f)
                curveToRelative(0.82f, 0f, 1.49f, 0.67f, 1.49f, 1.5f)
                verticalLineToRelative(19.6f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(7f, 8f)
                verticalLineToRelative(-1f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(7f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Receipt = it}
