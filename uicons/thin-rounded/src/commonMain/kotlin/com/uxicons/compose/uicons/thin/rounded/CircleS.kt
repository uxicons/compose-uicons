package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleS: ImageVector? = null

val Icons.Tr.CircleS: ImageVector
    get() = _CircleS ?: UXIcon(name = "CircleS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
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
                moveTo(17f, 15.06f)
                curveToRelative(0f, 1.62f, -1.35f, 2.94f, -3.0f, 2.94f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.58f, 0f, -2.71f, -0.93f, -2.95f, -2.42f)
                curveToRelative(-0.04f, -0.27f, 0.14f, -0.53f, 0.41f, -0.57f)
                curveToRelative(0.27f, -0.04f, 0.53f, 0.14f, 0.57f, 0.41f)
                curveToRelative(0.23f, 1.43f, 1.45f, 1.58f, 1.96f, 1.58f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0f, 2.0f, -0.87f, 2.0f, -1.94f)
                curveToRelative(0f, -0.88f, -0.62f, -1.66f, -1.5f, -1.88f)
                lineToRelative(-5.25f, -1.4f)
                curveToRelative(-1.32f, -0.33f, -2.25f, -1.5f, -2.25f, -2.85f)
                curveToRelative(0f, -1.62f, 1.35f, -2.94f, 3.0f, -2.94f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.58f, 0f, 2.71f, 0.93f, 2.95f, 2.42f)
                curveToRelative(0.04f, 0.27f, -0.14f, 0.53f, -0.41f, 0.57f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.14f, -0.57f, -0.41f)
                curveToRelative(-0.23f, -1.43f, -1.45f, -1.58f, -1.96f, -1.58f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.1f, 0f, -2.0f, 0.87f, -2.0f, 1.94f)
                curveToRelative(0f, 0.88f, 0.62f, 1.66f, 1.5f, 1.88f)
                lineToRelative(5.25f, 1.4f)
                curveToRelative(1.32f, 0.33f, 2.25f, 1.5f, 2.25f, 2.85f)
                close()
            }
        }.also { _CircleS = it}
