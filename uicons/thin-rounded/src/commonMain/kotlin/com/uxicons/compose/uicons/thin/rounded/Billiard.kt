package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Billiard: ImageVector? = null

val Icons.Tr.Billiard: ImageVector
    get() = _Billiard ?: UXIcon(name = "Billiard") {
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
                moveTo(12f, 4f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(14.8f, 9.69f)
                curveToRelative(0.26f, 0.43f, 0.27f, 0.96f, 0.03f, 1.4f)
                lineToRelative(-2.89f, 5.15f)
                curveToRelative(-0.09f, 0.16f, -0.26f, 0.26f, -0.44f, 0.26f)
                curveToRelative(-0.08f, 0f, -0.17f, -0.02f, -0.24f, -0.06f)
                curveToRelative(-0.24f, -0.14f, -0.33f, -0.44f, -0.19f, -0.68f)
                lineToRelative(2.89f, -5.14f)
                curveToRelative(0.1f, -0.18f, 0.02f, -0.35f, -0.01f, -0.41f)
                curveToRelative(-0.04f, -0.06f, -0.15f, -0.2f, -0.36f, -0.2f)
                horizontalLineToRelative(-3.58f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.58f)
                curveToRelative(0.51f, 0f, 0.96f, 0.26f, 1.22f, 0.69f)
                close()
            }
        }.also { _Billiard = it}
