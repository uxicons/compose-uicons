package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clipboard: ImageVector? = null

val Icons.Rs.Clipboard: ImageVector
    get() = _Clipboard ?: UXIcon(name = "Clipboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 2f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(18f)
                lineTo(21f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                lineTo(5f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.41f, 1.16f, 1.52f, 2f, 2.83f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, -0.84f, 2.83f, -2f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(17f)
                close()
            }
        }.also { _Clipboard = it}
