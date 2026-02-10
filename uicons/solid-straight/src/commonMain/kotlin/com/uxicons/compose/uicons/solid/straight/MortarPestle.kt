package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MortarPestle: ImageVector? = null

val Icons.Ss.MortarPestle: ImageVector
    get() = _MortarPestle ?: UXIcon(name = "MortarPestle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.28f, -0.31f, -0.73f, -0.65f, -1f)
                horizontalLineToRelative(13.3f)
                curveToRelative(-0.34f, 0.27f, -0.65f, 0.72f, -0.65f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(0f, 9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.98f, 1.12f, 5.82f, 3.08f, 8f)
                horizontalLineToRelative(17.84f)
                curveToRelative(1.96f, -2.18f, 3.08f, -5.02f, 3.08f, -8f)
                verticalLineToRelative(-1f)
                horizontalLineTo(0f)
                close()
                moveTo(23.27f, 0.73f)
                curveToRelative(-0.98f, -0.98f, -2.56f, -0.98f, -3.54f, 0f)
                lineToRelative(-5.18f, 6.27f)
                horizontalLineToRelative(5.41f)
                lineToRelative(3.31f, -2.73f)
                curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
                close()
            }
        }.also { _MortarPestle = it}
