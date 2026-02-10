package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonXmark: ImageVector? = null

val Icons.Sr.OctagonXmark: ImageVector
    get() = _OctagonXmark ?: UXIcon(name = "OctagonXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.24f, 5.27f)
                lineToRelative(-3.52f, -3.52f)
                curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
                horizontalLineToRelative(-4.97f)
                curveToRelative(-1.6f, 0f, -3.11f, 0.62f, -4.24f, 1.76f)
                lineToRelative(-3.52f, 3.52f)
                curveToRelative(-1.13f, 1.13f, -1.76f, 2.64f, -1.76f, 4.24f)
                verticalLineToRelative(4.97f)
                curveToRelative(0f, 1.6f, 0.62f, 3.11f, 1.76f, 4.24f)
                lineToRelative(3.52f, 3.52f)
                curveToRelative(1.13f, 1.13f, 2.64f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(4.97f)
                curveToRelative(1.6f, 0f, 3.11f, -0.62f, 4.24f, -1.76f)
                lineToRelative(3.52f, -3.51f)
                curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
                verticalLineToRelative(-4.97f)
                curveToRelative(0f, -1.6f, -0.62f, -3.11f, -1.76f, -4.24f)
                close()
                moveTo(16.44f, 15.06f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-3.04f, 3.04f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(-3.04f, -3.04f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(3.04f, -3.04f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(3.04f, 3.04f)
                close()
            }
        }.also { _OctagonXmark = it}
