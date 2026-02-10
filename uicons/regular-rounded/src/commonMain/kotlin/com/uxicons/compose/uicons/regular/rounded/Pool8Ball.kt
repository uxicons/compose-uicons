package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pool8Ball: ImageVector? = null

val Icons.Rr.Pool8Ball: ImageVector
    get() = _Pool8Ball ?: UXIcon(name = "Pool8Ball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(19f, 9f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -3.62f, 2.76f, -6.6f, 6.29f, -6.96f)
                curveToRelative(0.24f, -0.02f, 0.47f, -0.04f, 0.71f, -0.04f)
                reflectiveCurveToRelative(0.48f, 0.02f, 0.71f, 0.04f)
                curveToRelative(3.52f, 0.36f, 6.29f, 3.35f, 6.29f, 6.96f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -1.68f, 0.42f, -3.27f, 1.16f, -4.66f)
                curveToRelative(-0.1f, 0.54f, -0.16f, 1.09f, -0.16f, 1.66f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -0.57f, -0.06f, -1.12f, -0.16f, -1.66f)
                curveToRelative(0.74f, 1.39f, 1.16f, 2.98f, 1.16f, 4.66f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(9f, 6f)
                curveToRelative(0f, 0.72f, 0.27f, 1.37f, 0.69f, 1.89f)
                curveToRelative(-0.72f, 0.64f, -1.19f, 1.57f, -1.19f, 2.61f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.04f, -0.47f, -1.97f, -1.19f, -2.61f)
                curveToRelative(0.42f, -0.52f, 0.69f, -1.17f, 0.69f, -1.89f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Pool8Ball = it}
