package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleCheck: ImageVector? = null

val Icons.Rr.HouseCircleCheck: ImageVector
    get() = _HouseCircleCheck ?: UXIcon(name = "HouseCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.67f, 0.82f, -3.21f, 2.2f, -4.14f)
                lineTo(9.2f, 0.85f)
                curveToRelative(1.7f, -1.15f, 3.9f, -1.15f, 5.59f, 0f)
                lineToRelative(7.2f, 4.89f)
                curveToRelative(0.99f, 0.75f, 1.69f, 1.85f, 1.92f, 3.07f)
                curveToRelative(0.1f, 0.54f, -0.26f, 1.06f, -0.8f, 1.16f)
                curveToRelative(-0.54f, 0.1f, -1.06f, -0.26f, -1.16f, -0.8f)
                curveToRelative(-0.14f, -0.79f, -0.61f, -1.5f, -1.27f, -1.94f)
                lineToRelative(-7f, -4.72f)
                curveToRelative(-1.02f, -0.69f, -2.34f, -0.69f, -3.35f, 0f)
                lineTo(3.32f, 7.24f)
                curveToRelative(-0.83f, 0.56f, -1.32f, 1.49f, -1.32f, 2.49f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(18.81f, 15.76f)
                lineToRelative(-2.22f, 2.13f)
                curveToRelative(-0.14f, 0.14f, -0.38f, 0.14f, -0.52f, 0f)
                lineToRelative(-1.13f, -1.11f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.38f, -1.41f, 0.02f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.01f, 1.41f)
                lineToRelative(1.13f, 1.11f)
                curveToRelative(0.46f, 0.45f, 1.06f, 0.67f, 1.66f, 0.67f)
                reflectiveCurveToRelative(1.2f, -0.23f, 1.65f, -0.67f)
                lineToRelative(2.21f, -2.12f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                close()
            }
        }.also { _HouseCircleCheck = it}
