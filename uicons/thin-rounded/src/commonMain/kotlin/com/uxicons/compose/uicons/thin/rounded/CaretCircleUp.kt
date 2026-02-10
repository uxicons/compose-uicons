package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleUp: ImageVector? = null

val Icons.Tr.CaretCircleUp: ImageVector
    get() = _CaretCircleUp ?: UXIcon(name = "CaretCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7.42f)
                curveToRelative(-0.53f, -0.54f, -1.47f, -0.54f, -2f, 0f)
                lineToRelative(-5.09f, 5.15f)
                curveToRelative(-0.41f, 0.41f, -0.52f, 1.02f, -0.3f, 1.56f)
                curveToRelative(0.22f, 0.54f, 0.72f, 0.87f, 1.3f, 0.87f)
                horizontalLineToRelative(10.17f)
                curveToRelative(0.58f, 0f, 1.07f, -0.33f, 1.3f, -0.87f)
                curveToRelative(0.22f, -0.54f, 0.11f, -1.15f, -0.3f, -1.56f)
                lineToRelative(-5.09f, -5.15f)
                close()
                moveTo(17.46f, 13.74f)
                curveToRelative(-0.03f, 0.08f, -0.13f, 0.26f, -0.38f, 0.26f)
                lineTo(6.91f, 14.0f)
                curveToRelative(-0.24f, 0f, -0.34f, -0.18f, -0.38f, -0.26f)
                curveToRelative(-0.03f, -0.06f, -0.1f, -0.28f, 0.09f, -0.47f)
                lineToRelative(5.09f, -5.15f)
                curveToRelative(0.08f, -0.08f, 0.18f, -0.12f, 0.29f, -0.12f)
                reflectiveCurveToRelative(0.21f, 0.04f, 0.29f, 0.12f)
                lineToRelative(5.09f, 5.15f)
                curveToRelative(0.18f, 0.19f, 0.11f, 0.41f, 0.09f, 0.47f)
                close()
            }
        }.also { _CaretCircleUp = it}
