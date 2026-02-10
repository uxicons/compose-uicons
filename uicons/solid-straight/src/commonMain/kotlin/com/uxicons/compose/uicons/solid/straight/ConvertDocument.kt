package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertDocument: ImageVector? = null

val Icons.Ss.ConvertDocument: ImageVector
    get() = _ConvertDocument ?: UXIcon(name = "ConvertDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(15f)
                lineTo(7f, 23f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6.08f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.8f, -2.8f)
                curveToRelative(0.77f, -0.77f, 0.77f, -2.04f, 0f, -2.81f)
                lineToRelative(-2.8f, -2.8f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.8f, 1.79f)
                horizontalLineToRelative(-6.09f)
                lineTo(7.0f, 4f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(5f, 4f)
                curveToRelative(0f, -1.13f, 0.39f, -2.16f, 1.03f, -3f)
                horizontalLineToRelative(-3.03f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(5f)
                lineTo(5f, 4f)
                close()
                moveTo(19f, 1.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, -4.41f)
                close()
            }
        }.also { _ConvertDocument = it}
