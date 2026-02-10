package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QrScan: ImageVector? = null

val Icons.Ts.QrScan: ImageVector
    get() = _QrScan ?: UXIcon(name = "QrScan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 11f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                lineTo(0f, 12f)
                verticalLineToRelative(-1f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                lineTo(7f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1f)
                lineTo(1f, 2.5f)
                close()
                moveTo(1f, 21.5f)
                verticalLineToRelative(-4.5f)
                lineTo(0f, 17f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _QrScan = it}
