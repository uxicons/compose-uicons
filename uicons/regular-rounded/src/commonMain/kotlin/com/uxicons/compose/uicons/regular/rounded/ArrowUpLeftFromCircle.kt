package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Rr.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3.41f)
                verticalLineToRelative(6.59f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3.41f, 2f)
                lineTo(15.71f, 14.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(2f, 3.41f)
                close()
                moveTo(14f, 4f)
                curveToRelative(-1.14f, 0f, -2.26f, 0.19f, -3.33f, 0.57f)
                curveToRelative(-0.52f, 0.18f, -0.79f, 0.76f, -0.61f, 1.28f)
                curveToRelative(0.14f, 0.41f, 0.53f, 0.67f, 0.94f, 0.67f)
                curveToRelative(0.11f, 0f, 0.22f, -0.02f, 0.33f, -0.06f)
                curveToRelative(0.85f, -0.3f, 1.75f, -0.46f, 2.67f, -0.46f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -0.92f, 0.15f, -1.81f, 0.46f, -2.67f)
                curveToRelative(0.18f, -0.52f, -0.09f, -1.09f, -0.61f, -1.28f)
                curveToRelative(-0.52f, -0.18f, -1.09f, 0.09f, -1.28f, 0.61f)
                curveToRelative(-0.38f, 1.07f, -0.57f, 2.19f, -0.57f, 3.33f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 4f, 14f, 4f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
