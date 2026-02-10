package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Ss.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 22f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                close()
                moveTo(24f, 8f)
                curveToRelative(0f, 2.77f, -2.19f, 6f, -5f, 6f)
                horizontalLineTo(17.96f)
                lineToRelative(-1.14f, 6f)
                horizontalLineTo(3.17f)
                lineTo(0.07f, 3.62f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 3.65f)
                lineToRelative(-0.08f, 0.4f)
                curveTo(22.46f, 4.31f, 24f, 5.73f, 24f, 8f)
                close()
                moveTo(22f, 8f)
                curveToRelative(0f, -0.47f, 0f, -1.83f, -2.52f, -1.99f)
                lineTo(18.34f, 12f)
                horizontalLineTo(19f)
                curveTo(20.55f, 12f, 22f, 9.75f, 22f, 8f)
                close()
            }
        }.also { _MugAlt = it}
