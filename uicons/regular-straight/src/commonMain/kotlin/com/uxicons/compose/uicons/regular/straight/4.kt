package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rs4: ImageVector? = null

val Icons.Rs.Rs4: ImageVector
    get() = _Rs4 ?: UXIcon(name = "Rs4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Rs4 = it}
