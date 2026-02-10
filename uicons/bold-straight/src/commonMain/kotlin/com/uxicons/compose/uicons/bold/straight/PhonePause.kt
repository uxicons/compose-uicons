package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePause: ImageVector? = null

val Icons.Bs.PhonePause: ImageVector
    get() = _PhonePause ?: UXIcon(name = "PhonePause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.94f, 23.94f)
                curveTo(8.79f, 23.94f, 0f, 15.15f, 0f, 8f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.77f, 3.68f)
                lineTo(5.41f, 0.03f)
                lineToRelative(6.64f, 6.64f)
                lineTo(9.09f, 9.64f)
                arcTo(10.69f, 10.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.3f, 14.86f)
                lineToRelative(2.97f, -2.97f)
                lineToRelative(6.64f, 6.64f)
                lineToRelative(-3.65f, 3.65f)
                arcTo(6.06f, 6.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.94f, 23.94f)
                close()
                moveTo(5.41f, 4.28f)
                lineTo(3.89f, 5.8f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8f)
                curveToRelative(0f, 5.88f, 7.95f, 12.94f, 12.94f, 12.94f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.2f, -0.89f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(-0.91f, -0.35f)
                arcTo(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.91f, 9.86f)
                lineToRelative(-0.37f, -0.92f)
                lineTo(7.81f, 6.67f)
                close()
                moveTo(23f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(18f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _PhonePause = it}
