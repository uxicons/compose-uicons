package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglesMixed: ImageVector? = null

val Icons.Rs.RectanglesMixed: ImageVector
    get() = _RectanglesMixed ?: UXIcon(name = "RectanglesMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(13f)
                lineTo(13f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                close()
                moveTo(11f, 9f)
                lineTo(2f, 9f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                close()
                moveTo(2f, 20f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-10f)
                lineTo(2f, 13f)
                verticalLineToRelative(7f)
                close()
                moveTo(4f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _RectanglesMixed = it}
