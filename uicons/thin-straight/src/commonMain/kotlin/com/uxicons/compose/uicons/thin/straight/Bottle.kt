package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Ts.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.43f, 9.18f)
                lineToRelative(-3.43f, -1.37f)
                lineTo(15f, 1f)
                horizontalLineToRelative(1f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 1f)
                horizontalLineToRelative(1f)
                lineTo(9f, 7.66f)
                lineToRelative(-3.43f, 1.37f)
                curveToRelative(-0.95f, 0.38f, -1.57f, 1.29f, -1.57f, 2.32f)
                verticalLineToRelative(12.65f)
                lineTo(20f, 24f)
                lineTo(20f, 11.5f)
                curveToRelative(0f, -1.03f, -0.62f, -1.94f, -1.57f, -2.32f)
                close()
                moveTo(19f, 23f)
                lineTo(5f, 23f)
                lineTo(5f, 11.35f)
                curveToRelative(0f, -0.62f, 0.37f, -1.16f, 0.94f, -1.39f)
                lineToRelative(4.06f, -1.62f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.48f)
                lineToRelative(4.06f, 1.62f)
                curveToRelative(0.57f, 0.23f, 0.94f, 0.78f, 0.94f, 1.39f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                lineTo(8f, 14f)
                verticalLineToRelative(5f)
                close()
                moveTo(9f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Bottle = it}
