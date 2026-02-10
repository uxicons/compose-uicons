package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplaySlash: ImageVector? = null

val Icons.Bs.DisplaySlash: ImageVector
    get() = _DisplaySlash ?: UXIcon(name = "DisplaySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.12f, 18f)
                horizontalLineToRelative(3.88f)
                lineTo(24.0f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3.12f, 1f)
                lineTo(2.11f, -0.01f)
                lineTo(-0.01f, 2.11f)
                lineToRelative(21.9f, 21.9f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.89f, -3.89f)
                close()
                moveTo(21.0f, 4f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3.88f)
                lineTo(6.12f, 4f)
                horizontalLineToRelative(14.88f)
                close()
                moveTo(15.05f, 20f)
                lineToRelative(2.45f, 2.45f)
                verticalLineToRelative(0.55f)
                lineTo(6.5f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                lineTo(0f, 4.95f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(7.05f)
                horizontalLineToRelative(7.05f)
                lineToRelative(3.45f, 3.45f)
                verticalLineToRelative(1.55f)
                horizontalLineToRelative(1.55f)
                close()
            }
        }.also { _DisplaySlash = it}
