package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pool8Ball: ImageVector? = null

val Icons.Rc.Pool8Ball: ImageVector
    get() = _Pool8Ball ?: UXIcon(name = "Pool8Ball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(18f, 9f)
                curveToRelative(0f, 4.43f, -1.57f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -1.57f, -6f, -6f)
                curveToRelative(-0.12f, -4.52f, 1.5f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6.12f, 1.48f, 6f, 6f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                curveToRelative(0f, -2.67f, 0.41f, -4.65f, 1.34f, -6.07f)
                curveToRelative(-0.22f, 0.9f, -0.34f, 1.91f, -0.34f, 3.07f)
                curveToRelative(0f, 5.53f, 2.47f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -2.47f, 8f, -8f)
                curveToRelative(0f, -1.16f, -0.12f, -2.17f, -0.34f, -3.07f)
                curveToRelative(0.92f, 1.42f, 1.34f, 3.4f, 1.34f, 6.07f)
                curveToRelative(0f, 6.56f, -2.44f, 9f, -9f, 9f)
                close()
                moveTo(9f, 7f)
                curveToRelative(0f, 0.85f, 0.2f, 1.51f, 0.56f, 2f)
                curveToRelative(-0.37f, 0.49f, -0.56f, 1.15f, -0.56f, 2f)
                curveToRelative(0f, 1.99f, 1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                curveToRelative(0f, -0.85f, -0.2f, -1.51f, -0.56f, -2f)
                curveToRelative(0.37f, -0.49f, 0.56f, -1.15f, 0.56f, -2f)
                curveToRelative(0f, -1.99f, -1.01f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.01f, -3f, 3f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-0.88f, 0f, -1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                reflectiveCurveToRelative(-0.12f, 1f, -1f, 1f)
                close()
                moveTo(13f, 7f)
                curveToRelative(0f, 0.88f, -0.12f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                close()
            }
        }.also { _Pool8Ball = it}
