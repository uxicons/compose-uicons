package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerQuarter: ImageVector? = null

val Icons.Rc.ThermometerQuarter: ImageVector
    get() = _ThermometerQuarter ?: UXIcon(name = "ThermometerQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 10.04f)
                verticalLineToRelative(-4.54f)
                curveToRelative(0f, -3.07f, -1.43f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 1.43f, -4.5f, 4.5f)
                verticalLineToRelative(4.54f)
                curveToRelative(-2.23f, 1.42f, -2.5f, 4.04f, -2.5f, 5.96f)
                curveToRelative(0f, 4.84f, 2.16f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -2.16f, 7f, -7f)
                curveToRelative(0f, -1.91f, -0.27f, -4.54f, -2.5f, -5.96f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.74f, 0f, -5f, -1.26f, -5f, -5f)
                curveToRelative(0f, -3.12f, 0.98f, -4.01f, 1.93f, -4.47f)
                curveToRelative(0.35f, -0.17f, 0.57f, -0.52f, 0.57f, -0.9f)
                verticalLineToRelative(-5.13f)
                curveToRelative(0f, -1.94f, 0.56f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 0.56f, 2.5f, 2.5f)
                verticalLineToRelative(5.13f)
                curveToRelative(0f, 0.39f, 0.22f, 0.74f, 0.57f, 0.9f)
                curveToRelative(0.95f, 0.46f, 1.93f, 1.34f, 1.93f, 4.47f)
                curveToRelative(0f, 3.74f, -1.26f, 5f, -5f, 5f)
                close()
                moveTo(13f, 13.12f)
                verticalLineToRelative(-2.12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.12f)
                curveToRelative(-1.32f, 0.31f, -2f, 1.26f, -2f, 2.88f)
                curveToRelative(0f, 1.99f, 1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                curveToRelative(0f, -1.62f, -0.68f, -2.58f, -2f, -2.88f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.88f, 0f, -1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                reflectiveCurveToRelative(-0.12f, 1f, -1f, 1f)
                close()
            }
        }.also { _ThermometerQuarter = it}
