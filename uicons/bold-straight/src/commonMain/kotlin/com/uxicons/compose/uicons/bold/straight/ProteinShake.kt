package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProteinShake: ImageVector? = null

val Icons.Bs.ProteinShake: ImageVector
    get() = _ProteinShake ?: UXIcon(name = "ProteinShake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.42f, 2f)
                horizontalLineToRelative(-5.42f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.42f)
                curveToRelative(-1.29f, 0f, -2.44f, 0.83f, -2.85f, 2.05f)
                lineToRelative(-0.73f, 2.21f)
                verticalLineToRelative(1.74f)
                lineToRelative(1.1f, 16f)
                horizontalLineToRelative(13.8f)
                lineToRelative(1.1f, -15.9f)
                lineToRelative(0.0f, -1.85f)
                lineToRelative(-0.73f, -2.21f)
                curveToRelative(-0.41f, -1.23f, -1.55f, -2.05f, -2.85f, -2.05f)
                close()
                moveTo(7.9f, 21f)
                lineTo(7.76f, 19f)
                horizontalLineToRelative(2.24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.44f)
                lineToRelative(-0.14f, -2f)
                horizontalLineToRelative(2.58f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.79f)
                lineToRelative(-0.21f, -3f)
                horizontalLineToRelative(9.99f)
                lineToRelative(-0.9f, 13f)
                close()
            }
        }.also { _ProteinShake = it}
