package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonCheck: ImageVector? = null

val Icons.Rr.OctagonCheck: ImageVector
    get() = _OctagonCheck ?: UXIcon(name = "OctagonCheck") {
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
                lineToRelative(3.52f, -3.52f)
                curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
                verticalLineToRelative(-4.97f)
                curveToRelative(0f, -1.6f, -0.62f, -3.11f, -1.76f, -4.24f)
                close()
                moveTo(22f, 14.48f)
                curveToRelative(0f, 1.07f, -0.42f, 2.07f, -1.17f, 2.83f)
                lineToRelative(-3.52f, 3.51f)
                curveToRelative(-0.76f, 0.76f, -1.76f, 1.17f, -2.83f, 1.17f)
                horizontalLineToRelative(-4.97f)
                curveToRelative(-1.07f, 0f, -2.07f, -0.42f, -2.83f, -1.17f)
                lineToRelative(-3.51f, -3.52f)
                curveToRelative(-0.76f, -0.76f, -1.17f, -1.76f, -1.17f, -2.83f)
                verticalLineToRelative(-4.97f)
                curveToRelative(0f, -1.07f, 0.42f, -2.07f, 1.17f, -2.83f)
                lineToRelative(3.52f, -3.51f)
                curveToRelative(0.76f, -0.76f, 1.76f, -1.17f, 2.83f, -1.17f)
                horizontalLineToRelative(4.97f)
                curveToRelative(1.07f, 0f, 2.07f, 0.42f, 2.83f, 1.17f)
                lineToRelative(3.51f, 3.52f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                verticalLineToRelative(4.97f)
                close()
                moveTo(18.33f, 8.42f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-5.23f, 5.23f)
                curveToRelative(-0.61f, 0.61f, -1.43f, 0.95f, -2.29f, 0.95f)
                reflectiveCurveToRelative(-1.68f, -0.34f, -2.29f, -0.95f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.47f, 0.47f, 1.29f, 0.47f, 1.76f, 0f)
                lineToRelative(5.23f, -5.23f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
            }
        }.also { _OctagonCheck = it}
