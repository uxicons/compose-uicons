package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nfc: ImageVector? = null

val Icons.Ts.Nfc: ImageVector
    get() = _Nfc ?: UXIcon(name = "Nfc") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(8f, 9.29f)
                verticalLineToRelative(6.71f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5.29f)
                lineToRelative(4.71f, -4.71f)
                horizontalLineToRelative(5.29f)
                verticalLineToRelative(14f)
                lineTo(5f, 19f)
                lineTo(5f, 8.71f)
                lineToRelative(4.71f, -4.71f)
                lineTo(4f, 4f)
                lineTo(4f, 20f)
                lineTo(20f, 20f)
                lineTo(20f, 4f)
                horizontalLineToRelative(-6.71f)
                lineToRelative(-5.29f, 5.29f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-2.29f, 2.29f)
                verticalLineToRelative(-2.29f)
                close()
            }
        }.also { _Nfc = it}
