package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextInputLeft: ImageVector? = null

val Icons.Rs.TextInputLeft: ImageVector
    get() = _TextInputLeft ?: UXIcon(name = "TextInputLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6f)
                verticalLineToRelative(15f)
                lineTo(11f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                lineTo(22f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(11f, 5f)
                lineTo(11f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5f, 19f)
                lineTo(2f, 19f)
                lineTo(2f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                lineTo(5f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                lineTo(5f, 21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17f, 17f)
                lineTo(17f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                lineTo(12f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 21f)
                lineTo(9f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.3f, -2f, 0.78f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                horizontalLineToRelative(-1.5f)
                lineTo(4.5f, 2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(7f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.77f, 0f, 1.47f, -0.3f, 2f, -0.78f)
                curveToRelative(0.53f, 0.48f, 1.23f, 0.78f, 2f, 0.78f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _TextInputLeft = it}
