package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoDuration: ImageVector? = null

val Icons.Ss.VideoDuration: ImageVector
    get() = _VideoDuration ?: UXIcon(name = "VideoDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19.08f, 20.44f)
                lineToRelative(-2.08f, -2.02f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.58f)
                lineToRelative(1.47f, 1.43f)
                lineToRelative(-1.39f, 1.44f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                curveToRelative(1.89f, 0f, 3.63f, 0.66f, 5f, 1.76f)
                lineTo(23f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10.07f)
                curveToRelative(-0.04f, -0.33f, -0.07f, -0.66f, -0.07f, -1f)
                close()
                moveTo(8f, 5f)
                lineToRelative(7f, 3.89f)
                lineToRelative(-7f, 3.89f)
                verticalLineToRelative(-7.78f)
                close()
            }
        }.also { _VideoDuration = it}
