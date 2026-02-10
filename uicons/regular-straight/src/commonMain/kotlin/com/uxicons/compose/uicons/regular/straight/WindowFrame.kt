package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Rs.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 22f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                close()
                moveTo(20f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-7f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(4f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-9f)
                close()
            }
        }.also { _WindowFrame = it}
