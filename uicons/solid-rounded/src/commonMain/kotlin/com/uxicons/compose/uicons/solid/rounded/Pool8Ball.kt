package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pool8Ball: ImageVector? = null

val Icons.Sr.Pool8Ball: ImageVector
    get() = _Pool8Ball ?: UXIcon(name = "Pool8Ball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18.8f, 2.13f)
                curveToRelative(1.36f, 1.58f, 2.19f, 3.63f, 2.19f, 5.87f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 12.96f, 3f, 8f)
                curveToRelative(0f, -2.25f, 0.83f, -4.29f, 2.19f, -5.87f)
                curveTo(2.06f, 4.29f, 0f, 7.91f, 0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -4.09f, -2.06f, -7.71f, -5.2f, -9.87f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5f, 8f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                close()
                moveTo(9.69f, 6.89f)
                curveToRelative(-0.72f, 0.64f, -1.19f, 1.57f, -1.19f, 2.61f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.04f, -0.47f, -1.97f, -1.19f, -2.61f)
                curveToRelative(0.42f, -0.52f, 0.69f, -1.17f, 0.69f, -1.89f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.72f, 0.27f, 1.37f, 0.69f, 1.89f)
                close()
            }
        }.also { _Pool8Ball = it}
