package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircleUp: ImageVector? = null

val Icons.Rr.SortCircleUp: ImageVector
    get() = _SortCircleUp ?: UXIcon(name = "SortCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.76f, 9.48f)
                curveToRelative(0.57f, 0.56f, 0.17f, 1.52f, -0.62f, 1.52f)
                lineTo(6.86f, 11f)
                curveToRelative(-0.8f, 0f, -1.19f, -0.97f, -0.62f, -1.52f)
                lineToRelative(4.61f, -4.5f)
                curveToRelative(0.64f, -0.64f, 1.66f, -0.64f, 2.3f, 0f)
                lineToRelative(4.61f, 4.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                close()
                moveTo(17.93f, 13.62f)
                curveToRelative(0.15f, 0.38f, 0.07f, 0.81f, -0.22f, 1.09f)
                lineToRelative(-4.18f, 4.16f)
                curveToRelative(-0.41f, 0.41f, -0.95f, 0.63f, -1.52f, 0.63f)
                reflectiveCurveToRelative(-1.12f, -0.23f, -1.52f, -0.63f)
                lineToRelative(-4.18f, -4.16f)
                curveToRelative(-0.29f, -0.29f, -0.37f, -0.72f, -0.22f, -1.09f)
                curveToRelative(0.15f, -0.37f, 0.52f, -0.62f, 0.93f, -0.62f)
                horizontalLineToRelative(10f)
                curveToRelative(0.41f, 0f, 0.77f, 0.24f, 0.93f, 0.62f)
                close()
                moveTo(14.58f, 15f)
                horizontalLineToRelative(-5.15f)
                lineToRelative(2.46f, 2.45f)
                curveToRelative(0.08f, 0.08f, 0.15f, 0.08f, 0.22f, 0.0f)
                lineToRelative(2.47f, -2.45f)
                close()
            }
        }.also { _SortCircleUp = it}
