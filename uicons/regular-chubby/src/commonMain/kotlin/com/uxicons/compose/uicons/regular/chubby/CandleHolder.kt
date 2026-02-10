package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Rc.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.87f, 1.23f, -2.6f)
                curveToRelative(0.39f, -0.5f, 1.15f, -0.5f, 1.53f, 0f)
                curveToRelative(0.56f, 0.73f, 1.23f, 1.77f, 1.23f, 2.6f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(23f, 19f)
                curveToRelative(0f, 2.69f, -1.31f, 4f, -4f, 4f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.33f)
                curveToRelative(-0.13f, -1.33f, -0.33f, -3.65f, -0.33f, -6f)
                curveToRelative(0f, -3.53f, 0.44f, -6.52f, 0.46f, -6.65f)
                curveToRelative(0.06f, -0.4f, 0.35f, -0.72f, 0.74f, -0.82f)
                curveToRelative(0.08f, -0.02f, 2.1f, -0.53f, 3.8f, -0.53f)
                reflectiveCurveToRelative(3.72f, 0.51f, 3.8f, 0.53f)
                curveToRelative(0.39f, 0.1f, 0.68f, 0.42f, 0.74f, 0.82f)
                curveToRelative(0.02f, 0.12f, 0.46f, 3.11f, 0.46f, 6.65f)
                curveToRelative(0f, 2.35f, -0.19f, 4.67f, -0.33f, 6f)
                horizontalLineToRelative(6.33f)
                curveToRelative(1.59f, 0f, 2f, -0.41f, 2f, -2f)
                reflectiveCurveToRelative(-0.41f, -2f, -2f, -2f)
                curveToRelative(-0.7f, 0f, -1.2f, 0.1f, -1.49f, 0.31f)
                curveToRelative(-0.45f, 0.32f, -1.07f, 0.22f, -1.4f, -0.23f)
                curveToRelative(-0.32f, -0.45f, -0.22f, -1.07f, 0.23f, -1.4f)
                curveToRelative(0.65f, -0.46f, 1.51f, -0.69f, 2.65f, -0.69f)
                curveToRelative(2.69f, 0f, 4f, 1.31f, 4f, 4f)
                close()
                moveTo(5.34f, 21f)
                horizontalLineToRelative(5.32f)
                curveToRelative(0.13f, -1.24f, 0.34f, -3.63f, 0.34f, -6f)
                curveToRelative(0f, -2.42f, -0.22f, -4.61f, -0.35f, -5.68f)
                curveToRelative(-0.67f, -0.14f, -1.74f, -0.32f, -2.65f, -0.32f)
                reflectiveCurveToRelative(-1.98f, 0.18f, -2.65f, 0.32f)
                curveToRelative(-0.13f, 1.06f, -0.35f, 3.26f, -0.35f, 5.68f)
                curveToRelative(0f, 2.37f, 0.21f, 4.76f, 0.34f, 6f)
                close()
            }
        }.also { _CandleHolder = it}
