package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nfc: ImageVector? = null

val Icons.Rs.Nfc: ImageVector
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
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                close()
                moveTo(12.09f, 4f)
                horizontalLineToRelative(7.91f)
                lineTo(20f, 20f)
                lineTo(4f, 20f)
                lineTo(4f, 4f)
                horizontalLineToRelative(5.41f)
                lineToRelative(-3.41f, 3.41f)
                verticalLineToRelative(10.59f)
                horizontalLineToRelative(12f)
                lineTo(18f, 6f)
                horizontalLineToRelative(-5.09f)
                lineToRelative(-2.91f, 2.91f)
                verticalLineToRelative(5.09f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                lineTo(8f, 16f)
                verticalLineToRelative(-7.91f)
                lineToRelative(4.09f, -4.09f)
                close()
            }
        }.also { _Nfc = it}
