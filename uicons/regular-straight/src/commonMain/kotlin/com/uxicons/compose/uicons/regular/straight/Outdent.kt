package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Outdent: ImageVector? = null

val Icons.Rs.Outdent: ImageVector
    get() = _Outdent ?: UXIcon(name = "Outdent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.83f, 13.23f)
                curveToRelative(-0.44f, -0.4f, -0.44f, -1.09f, 0f, -1.49f)
                lineToRelative(4.17f, -3.74f)
                verticalLineToRelative(8.97f)
                lineTo(0.83f, 13.23f)
                close()
                moveTo(0f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                lineTo(0f, 4f)
                close()
                moveTo(0f, 21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                lineTo(8f, 9f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                lineTo(8f, 14f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Outdent = it}
