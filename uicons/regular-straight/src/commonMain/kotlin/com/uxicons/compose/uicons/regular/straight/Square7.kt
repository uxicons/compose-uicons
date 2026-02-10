package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square7: ImageVector? = null

val Icons.Rs.Square7: ImageVector
    get() = _Square7 ?: UXIcon(name = "Square7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineTo(21f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineTo(24f)
                close()
                moveTo(2f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(22f)
                close()
                moveTo(16f, 7.52f)
                verticalLineToRelative(-1.52f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.53f)
                lineToRelative(-4.54f, 9.1f)
                lineToRelative(1.79f, 0.89f)
                lineToRelative(5.22f, -10.46f)
                close()
            }
        }.also { _Square7 = it}
