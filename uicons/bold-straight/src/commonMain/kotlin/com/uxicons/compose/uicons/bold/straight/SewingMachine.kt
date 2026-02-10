package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SewingMachine: ImageVector? = null

val Icons.Bs.SewingMachine: ImageVector
    get() = _SewingMachine ?: UXIcon(name = "SewingMachine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17.06f)
                lineTo(23f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 2f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(4f, 2.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                lineTo(3.5f, 16f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                lineTo(24f, 24f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.95f, -0.38f, -1.81f, -1f, -2.44f)
                close()
                moveTo(6f, 8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4f)
                lineTo(16f, 8f)
                lineTo(6f, 8f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 19f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _SewingMachine = it}
