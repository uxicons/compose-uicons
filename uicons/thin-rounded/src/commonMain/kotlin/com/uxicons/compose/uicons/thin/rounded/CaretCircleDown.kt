package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleDown: ImageVector? = null

val Icons.Tr.CaretCircleDown: ImageVector
    get() = _CaretCircleDown ?: UXIcon(name = "CaretCircleDown") {
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
                moveTo(17.09f, 9f)
                lineTo(6.91f, 9f)
                curveToRelative(-0.58f, 0f, -1.08f, 0.33f, -1.3f, 0.87f)
                curveToRelative(-0.22f, 0.54f, -0.11f, 1.15f, 0.3f, 1.56f)
                lineToRelative(5.09f, 5.15f)
                curveToRelative(0.27f, 0.27f, 0.62f, 0.42f, 1f, 0.42f)
                reflectiveCurveToRelative(0.73f, -0.15f, 1f, -0.42f)
                lineToRelative(5.09f, -5.15f)
                curveToRelative(0.41f, -0.41f, 0.52f, -1.02f, 0.3f, -1.56f)
                curveToRelative(-0.23f, -0.54f, -0.72f, -0.87f, -1.3f, -0.87f)
                close()
                moveTo(17.38f, 10.72f)
                lineToRelative(-5.09f, 5.15f)
                curveToRelative(-0.15f, 0.16f, -0.42f, 0.16f, -0.58f, 0f)
                lineToRelative(-5.09f, -5.15f)
                curveToRelative(-0.19f, -0.19f, -0.12f, -0.41f, -0.09f, -0.47f)
                curveToRelative(0.03f, -0.08f, 0.13f, -0.26f, 0.38f, -0.26f)
                horizontalLineToRelative(10.17f)
                curveToRelative(0.24f, 0f, 0.35f, 0.18f, 0.38f, 0.26f)
                curveToRelative(0.03f, 0.06f, 0.1f, 0.28f, -0.09f, 0.47f)
                close()
            }
        }.also { _CaretCircleDown = it}
