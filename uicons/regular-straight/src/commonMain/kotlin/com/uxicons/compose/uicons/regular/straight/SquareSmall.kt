package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareSmall: ImageVector? = null

val Icons.Rs.SquareSmall: ImageVector
    get() = _SquareSmall ?: UXIcon(name = "SquareSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                lineTo(5f, 19f)
                lineTo(5f, 8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(10f)
                lineTo(17f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(8f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _SquareSmall = it}
