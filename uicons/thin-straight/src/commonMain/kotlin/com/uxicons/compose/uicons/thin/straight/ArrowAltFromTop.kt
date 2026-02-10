package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromTop: ImageVector? = null

val Icons.Ts.ArrowAltFromTop: ImageVector
    get() = _ArrowAltFromTop ?: UXIcon(name = "ArrowAltFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(1f)
                horizontalLineTo(11.5f)
                verticalLineTo(17f)
                horizontalLineTo(4.88f)
                lineToRelative(5.77f, 6.39f)
                curveToRelative(0.34f, 0.39f, 0.84f, 0.61f, 1.36f, 0.61f)
                reflectiveCurveToRelative(1.01f, -0.22f, 1.36f, -0.61f)
                lineToRelative(5.77f, -6.39f)
                horizontalLineToRelative(-6.62f)
                verticalLineTo(1f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(12.61f, 22.72f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.32f, 0.36f, -0.9f, 0.36f, -1.22f, -0.0f)
                lineToRelative(-4.26f, -4.72f)
                horizontalLineToRelative(9.75f)
                lineToRelative(-4.26f, 4.72f)
                close()
            }
        }.also { _ArrowAltFromTop = it}
