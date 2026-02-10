package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Tc.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, -7.81f, -3.19f, -11f, -11f, -11f)
                curveToRelative(-7.29f, -0.09f, -11.16f, 3.08f, -11f, 11f)
                curveToRelative(0f, 7.81f, 3.19f, 11f, 11f, 11f)
                curveToRelative(7.26f, 0.1f, 11.17f, -3.08f, 11f, -11f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -6.98f, 2.65f, -9.82f, 9.38f, -9.98f)
                curveToRelative(3.35f, 0.08f, 4.62f, 1.38f, 4.62f, 4.73f)
                curveToRelative(0f, 3.08f, -1.21f, 4.5f, -4.04f, 4.75f)
                curveToRelative(-3.38f, 0.3f, -4.96f, 2.12f, -4.96f, 5.75f)
                curveToRelative(0f, 2.08f, 0.49f, 3.53f, 1.53f, 4.46f)
                curveToRelative(-4.64f, -0.87f, -6.53f, -3.82f, -6.53f, -9.71f)
                close()
                moveTo(12.66f, 21.98f)
                curveToRelative(-3.37f, -0.09f, -4.66f, -1.39f, -4.66f, -4.73f)
                curveToRelative(0f, -3.12f, 1.17f, -4.5f, 4.04f, -4.75f)
                curveToRelative(3.38f, -0.3f, 4.96f, -2.13f, 4.96f, -5.75f)
                curveToRelative(0f, -2.08f, -0.48f, -3.53f, -1.51f, -4.46f)
                curveToRelative(4.63f, 0.88f, 6.51f, 3.82f, 6.51f, 9.71f)
                curveToRelative(0f, 6.97f, -2.64f, 9.81f, -9.34f, 9.98f)
                close()
                moveTo(11.25f, 7f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                close()
                moveTo(12.75f, 17f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
            }
        }.also { _YinYang = it}
