package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHeadset: ImageVector? = null

val Icons.Rc.UserHeadset: ImageVector
    get() = _UserHeadset ?: UXIcon(name = "UserHeadset") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 10f)
                curveToRelative(0f, 0.5f, 0.04f, 0.93f, 0.12f, 1.29f)
                curveToRelative(0.12f, 0.54f, -0.23f, 1.07f, -0.77f, 1.19f)
                curveToRelative(-0.53f, 0.12f, -1.07f, -0.22f, -1.19f, -0.77f)
                curveToRelative(-0.11f, -0.5f, -0.16f, -1.06f, -0.16f, -1.71f)
                curveToRelative(0f, -3.41f, 1.59f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.59f, 5f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.3f, -0.7f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 0.7f, -3f, 3f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-6.31f, 0f, -9f, 2.69f, -9f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -5.17f, 1.83f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 1.83f, 7f, 7f)
                curveToRelative(0f, 2.3f, -0.7f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.43f, -0.57f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.57f, -2f, 2f)
                reflectiveCurveToRelative(0.57f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(3.41f, 0f, 5f, -1.59f, 5f, -5f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                close()
                moveTo(12f, 17.0f)
                curveToRelative(-2.74f, 0f, -6.52f, 0.49f, -7.66f, 4.74f)
                curveToRelative(-0.14f, 0.53f, 0.17f, 1.08f, 0.71f, 1.23f)
                curveToRelative(0.53f, 0.15f, 1.08f, -0.17f, 1.23f, -0.71f)
                curveToRelative(0.45f, -1.69f, 1.46f, -3.26f, 5.73f, -3.26f)
                reflectiveCurveToRelative(5.28f, 1.57f, 5.73f, 3.26f)
                curveToRelative(0.14f, 0.54f, 0.71f, 0.85f, 1.23f, 0.71f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.71f, -1.23f)
                curveToRelative(-1.14f, -4.25f, -4.92f, -4.74f, -7.66f, -4.74f)
                close()
            }
        }.also { _UserHeadset = it}
