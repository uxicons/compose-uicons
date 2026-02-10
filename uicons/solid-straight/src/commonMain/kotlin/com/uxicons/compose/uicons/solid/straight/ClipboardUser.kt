package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardUser: ImageVector? = null

val Icons.Ss.ClipboardUser: ImageVector
    get() = _ClipboardUser ?: UXIcon(name = "ClipboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(6f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(3f, 2f)
                horizontalLineToRelative(5.17f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(5.17f)
                close()
                moveTo(9.5f, 10.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(17f, 17f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ClipboardUser = it}
