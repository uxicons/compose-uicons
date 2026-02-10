package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nfc: ImageVector? = null

val Icons.Bs.Nfc: ImageVector
    get() = _Nfc ?: UXIcon(name = "Nfc") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                close()
                moveTo(14.88f, 5f)
                horizontalLineToRelative(4.12f)
                verticalLineToRelative(14f)
                lineTo(5f, 19f)
                lineTo(5f, 5f)
                horizontalLineToRelative(6.62f)
                lineToRelative(-3.62f, 3.62f)
                verticalLineToRelative(7.38f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7.88f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(2.88f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.12f)
                lineToRelative(4.88f, -4.88f)
                close()
            }
        }.also { _Nfc = it}
