package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcPen: ImageVector? = null

val Icons.Bs.NfcPen: ImageVector
    get() = _NfcPen ?: UXIcon(name = "NfcPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.09f, 17f)
                lineTo(5f, 17f)
                lineTo(5f, 5f)
                horizontalLineToRelative(6.62f)
                lineToRelative(-3.62f, 3.62f)
                verticalLineToRelative(5.38f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(2.55f)
                lineTo(17f, 14.09f)
                lineToRelative(-2.91f, 2.91f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(19f, 12.11f)
                curveToRelative(0.85f, -0.77f, 1.93f, -1.14f, 3f, -1.09f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 22f)
                lineTo(11f, 22f)
                verticalLineToRelative(-3f)
                lineTo(3f, 19f)
                lineTo(3f, 3.5f)
                close()
            }
        }.also { _NfcPen = it}
