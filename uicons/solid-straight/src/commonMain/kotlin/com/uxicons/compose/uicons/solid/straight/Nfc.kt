package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nfc: ImageVector? = null

val Icons.Ss.Nfc: ImageVector
    get() = _Nfc ?: UXIcon(name = "Nfc") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3f)
                horizontalLineToRelative(5.41f)
                lineToRelative(-3.41f, 3.41f)
                verticalLineToRelative(12.59f)
                horizontalLineToRelative(14f)
                lineTo(19f, 5f)
                horizontalLineToRelative(-6.09f)
                lineToRelative(-2.91f, 2.91f)
                verticalLineToRelative(6.09f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                lineTo(8f, 16f)
                lineTo(8f, 7.09f)
                lineTo(12.09f, 3f)
                horizontalLineToRelative(8.91f)
                lineTo(21f, 21f)
                close()
            }
        }.also { _Nfc = it}
