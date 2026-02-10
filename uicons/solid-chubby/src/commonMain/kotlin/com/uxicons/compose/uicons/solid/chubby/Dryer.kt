package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dryer: ImageVector? = null

val Icons.Sc.Dryer: ImageVector
    get() = _Dryer ?: UXIcon(name = "Dryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 14f)
                curveToRelative(0f, 2.3f, -0.7f, 3f, -3f, 3f)
                curveToRelative(-1.92f, 0f, -2.71f, -0.5f, -2.93f, -2f)
                horizontalLineToRelative(0.93f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(0.21f, -1.5f, 1.01f, -2f, 2.93f, -2f)
                curveToRelative(2.3f, 0f, 3f, 0.7f, 3f, 3f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 6.1f, -1.08f, 9.21f, -1.12f, 9.34f)
                curveToRelative(-0.1f, 0.28f, -0.32f, 0.5f, -0.59f, 0.6f)
                curveToRelative(-0.12f, 0.04f, -2.89f, 1.06f, -7.28f, 1.06f)
                reflectiveCurveToRelative(-7.17f, -1.02f, -7.28f, -1.06f)
                curveToRelative(-0.28f, -0.1f, -0.49f, -0.32f, -0.59f, -0.6f)
                curveToRelative(-0.05f, -0.13f, -1.12f, -3.23f, -1.12f, -9.34f)
                reflectiveCurveToRelative(1.08f, -9.21f, 1.12f, -9.34f)
                curveToRelative(0.1f, -0.28f, 0.32f, -0.5f, 0.59f, -0.6f)
                curveToRelative(0.12f, -0.04f, 2.89f, -1.06f, 7.28f, -1.06f)
                reflectiveCurveToRelative(7.17f, 1.02f, 7.28f, 1.06f)
                curveToRelative(0.28f, 0.1f, 0.49f, 0.32f, 0.59f, 0.6f)
                curveToRelative(0.05f, 0.13f, 1.12f, 3.23f, 1.12f, 9.34f)
                close()
                moveTo(10f, 5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, -3.41f, -1.59f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.59f, -5f, 5f)
                reflectiveCurveToRelative(1.59f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.59f, 5f, -5f)
                close()
            }
        }.also { _Dryer = it}
