package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltV: ImageVector? = null

val Icons.Rs.ArrowsAltV: ImageVector
    get() = _ArrowsAltV ?: UXIcon(name = "ArrowsAltV") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                horizontalLineToRelative(5.16f)
                lineTo(13.08f, 0.45f)
                curveToRelative(-0.53f, -0.59f, -1.46f, -0.59f, -1.99f, 0f)
                lineTo(6f, 6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12f)
                horizontalLineTo(6f)
                lineToRelative(5.08f, 5.55f)
                curveToRelative(0.53f, 0.59f, 1.46f, 0.59f, 1.99f, 0f)
                lineToRelative(5.08f, -5.55f)
                horizontalLineToRelative(-5.16f)
                verticalLineTo(6f)
                close()
            }
        }.also { _ArrowsAltV = it}
