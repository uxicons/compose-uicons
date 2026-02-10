package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Rs.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineTo(11.77f)
                curveToRelative(-0.28f, 0.06f, -0.55f, 0.21f, -0.75f, 0.45f)
                lineToRelative(-5.02f, 5.55f)
                horizontalLineToRelative(5f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineToRelative(5f)
                lineTo(12.98f, 2.44f)
                curveToRelative(-0.21f, -0.23f, -0.47f, -0.39f, -0.75f, -0.45f)
                horizontalLineToRelative(8.77f)
                verticalLineTo(0f)
                close()
            }
        }.also { _ArrowAltToTop = it}
