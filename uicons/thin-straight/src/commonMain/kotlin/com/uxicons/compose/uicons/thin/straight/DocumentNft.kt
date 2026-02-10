package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentNft: ImageVector? = null

val Icons.Ts.DocumentNft: ImageVector
    get() = _DocumentNft ?: UXIcon(name = "DocumentNft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(18.21f, 24f)
                lineToRelative(5.79f, -5.79f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
                moveTo(18f, 22.79f)
                verticalLineToRelative(-4.79f)
                horizontalLineToRelative(4.79f)
                lineToRelative(-4.79f, 4.79f)
                close()
                moveTo(16f, 11f)
                lineTo(16f, 5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 4f)
                close()
                moveTo(7.5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-0.91f)
                lineToRelative(-2.59f, -4.78f)
                verticalLineToRelative(4.78f)
                horizontalLineToRelative(-1f)
                lineTo(4f, 4f)
                horizontalLineToRelative(0.93f)
                lineToRelative(2.57f, 4.74f)
                lineTo(7.5f, 4f)
                close()
            }
        }.also { _DocumentNft = it}
