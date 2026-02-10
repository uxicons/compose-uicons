package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folders: ImageVector? = null

val Icons.Rs.Folders: ImageVector
    get() = _Folders ?: UXIcon(name = "Folders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineToRelative(-5.76f)
                lineTo(11.24f, 1f)
                lineTo(7f, 1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                lineTo(24f, 19f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(3.76f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(6.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(6f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(6f, 17f)
                lineTo(6f, 9f)
                lineTo(22f, 9f)
                verticalLineToRelative(8f)
                lineTo(6f, 17f)
                close()
                moveTo(2f, 21f)
                lineTo(20f, 21f)
                verticalLineToRelative(2f)
                lineTo(0f, 23f)
                lineTo(0f, 8f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(15.82f)
                close()
            }
        }.also { _Folders = it}
