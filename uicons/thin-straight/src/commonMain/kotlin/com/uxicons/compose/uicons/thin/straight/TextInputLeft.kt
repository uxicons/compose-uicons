package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextInputLeft: ImageVector? = null

val Icons.Ts.TextInputLeft: ImageVector
    get() = _TextInputLeft ?: UXIcon(name = "TextInputLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 23f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.82f, 0f, -1.54f, -0.4f, -2f, -1.01f)
                curveToRelative(-0.46f, 0.61f, -1.18f, 1.01f, -2f, 1.01f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(7f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(4f, 0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.82f, 0f, 1.54f, 0.4f, 2f, 1.01f)
                curveToRelative(0.46f, -0.61f, 1.18f, -1.01f, 2f, -1.01f)
                horizontalLineToRelative(1.5f)
                lineTo(11f, 1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(8f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(21.5f, 3f)
                lineTo(10f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                lineTo(10f, 20f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.5f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(4.5f, 21f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 17f)
                lineTo(17f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(12f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _TextInputLeft = it}
