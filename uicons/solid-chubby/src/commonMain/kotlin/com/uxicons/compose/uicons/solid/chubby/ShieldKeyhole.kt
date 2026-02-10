package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldKeyhole: ImageVector? = null

val Icons.Sc.ShieldKeyhole: ImageVector
    get() = _ShieldKeyhole ?: UXIcon(name = "ShieldKeyhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10f)
                curveToRelative(0f, 0.88f, -0.12f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                close()
                moveTo(20.91f, 18.53f)
                curveToRelative(-2.35f, 2.49f, -7.99f, 4.23f, -8.62f, 4.42f)
                curveToRelative(-0.19f, 0.06f, -0.39f, 0.06f, -0.58f, 0f)
                curveToRelative(-0.64f, -0.19f, -6.28f, -1.93f, -8.62f, -4.42f)
                curveToRelative(-2.13f, -2.26f, -0.57f, -12.44f, -0.04f, -15.04f)
                curveToRelative(0.06f, -0.28f, 0.23f, -0.52f, 0.47f, -0.66f)
                curveToRelative(0.01f, -0.06f, 3.57f, -1.93f, 8.56f, -1.83f)
                curveToRelative(5.18f, 0f, 8.25f, 1.76f, 8.38f, 1.83f)
                curveToRelative(0.24f, 0.14f, 0.42f, 0.38f, 0.47f, 0.66f)
                curveToRelative(0.53f, 2.6f, 2.09f, 12.77f, -0.04f, 15.04f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, -1.99f, -1.01f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.01f, -3f, 3f)
                curveToRelative(0f, 1.62f, 0.68f, 2.58f, 2f, 2.88f)
                verticalLineToRelative(2.12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.12f)
                curveToRelative(1.32f, -0.31f, 2f, -1.26f, 2f, -2.88f)
                close()
            }
        }.also { _ShieldKeyhole = it}
