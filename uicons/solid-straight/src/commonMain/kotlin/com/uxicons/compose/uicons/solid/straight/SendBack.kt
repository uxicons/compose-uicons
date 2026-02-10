package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SendBack: ImageVector? = null

val Icons.Ss.SendBack: ImageVector
    get() = _SendBack ?: UXIcon(name = "SendBack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                lineTo(0f, 11f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(13f, 12.0f)
                curveToRelative(0.84f, -0.63f, 1.88f, -1.0f, 3f, -1.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11f, 16f)
                curveToRelative(0f, -1.12f, 0.37f, -2.16f, 1.0f, -3f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _SendBack = it}
