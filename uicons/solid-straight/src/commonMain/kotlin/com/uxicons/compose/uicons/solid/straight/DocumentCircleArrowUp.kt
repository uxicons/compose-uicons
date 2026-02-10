package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentCircleArrowUp: ImageVector? = null

val Icons.Ss.DocumentCircleArrowUp: ImageVector
    get() = _DocumentCircleArrowUp ?: UXIcon(name = "DocumentCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(2.69f, -2.69f)
                curveToRelative(0.42f, -0.42f, 1.09f, -0.42f, 1.51f, 0f)
                lineToRelative(2.69f, 2.69f)
                horizontalLineToRelative(-2.43f)
                close()
                moveTo(19.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(15f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(12.72f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                lineTo(13f, 0f)
                lineTo(13f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3.26f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.72f, 6f)
                close()
            }
        }.also { _DocumentCircleArrowUp = it}
