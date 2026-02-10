package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vault: ImageVector? = null

val Icons.Bs.Vault: ImageVector
    get() = _Vault ?: UXIcon(name = "Vault") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(24f, 5.5f)
                close()
                moveTo(3.5f, 5f)
                lineTo(20.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                lineTo(3f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                lineTo(3f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                lineTo(3f, 7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(8f, 12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(2.24f, 0f, 4.11f, 1.48f, 4.75f, 3.5f)
                horizontalLineToRelative(-3.75f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.75f)
                curveToRelative(-0.64f, 2.02f, -2.51f, 3.5f, -4.75f, 3.5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
            }
        }.also { _Vault = it}
