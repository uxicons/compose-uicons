package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Outdent: ImageVector? = null

val Icons.Bs.Outdent: ImageVector
    get() = _Outdent ?: UXIcon(name = "Outdent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.92f, 12.77f)
                curveToRelative(-0.48f, -0.4f, -0.48f, -1.14f, 0f, -1.54f)
                lineToRelative(5.08f, -4.23f)
                verticalLineToRelative(10f)
                lineTo(0.92f, 12.77f)
                close()
                moveTo(0f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 3f)
                close()
                moveTo(0f, 21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 18f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                lineTo(8f, 8f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                lineTo(8f, 13f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Outdent = it}
