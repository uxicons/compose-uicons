package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Tr.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 17f)
                curveToRelative(-0.1f, 0f, -0.2f, -0.03f, -0.29f, -0.09f)
                curveToRelative(-0.23f, -0.16f, -0.28f, -0.47f, -0.12f, -0.7f)
                lineToRelative(5f, -7f)
                curveToRelative(0.16f, -0.22f, 0.47f, -0.28f, 0.7f, -0.12f)
                curveToRelative(0.23f, 0.16f, 0.28f, 0.47f, 0.12f, 0.7f)
                lineToRelative(-5f, 7f)
                curveToRelative(-0.1f, 0.14f, -0.25f, 0.21f, -0.41f, 0.21f)
                close()
                moveTo(19.84f, 20.5f)
                curveToRelative(2.13f, -2.13f, 3.16f, -4.54f, 3.16f, -7.38f)
                curveToRelative(0f, -4.55f, -5.0f, -9.48f, -7.98f, -12.01f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.75f, -1.48f, -4.29f, -1.48f, -6.04f, 0f)
                curveTo(6.0f, 3.64f, 1f, 8.56f, 1f, 13.12f)
                curveToRelative(0f, 2.86f, 0.98f, 5.17f, 3.08f, 7.28f)
                curveToRelative(2.26f, 2.26f, 5.22f, 3.61f, 7.92f, 3.61f)
                curveToRelative(2.75f, 0f, 5.61f, -1.28f, 7.84f, -3.5f)
                close()
                moveTo(14.37f, 1.87f)
                horizontalLineToRelative(0f)
                curveToRelative(2.29f, 1.95f, 7.63f, 6.94f, 7.63f, 11.25f)
                curveToRelative(0f, 2.56f, -0.94f, 4.75f, -2.87f, 6.67f)
                curveToRelative(-2.01f, 2.01f, -4.68f, 3.21f, -7.13f, 3.21f)
                curveToRelative(-2.44f, 0f, -5.14f, -1.24f, -7.21f, -3.31f)
                curveToRelative(-1.93f, -1.93f, -2.79f, -3.96f, -2.79f, -6.57f)
                curveTo(2f, 8.81f, 7.33f, 3.81f, 9.63f, 1.87f)
                curveToRelative(0.69f, -0.58f, 1.53f, -0.88f, 2.37f, -0.88f)
                reflectiveCurveToRelative(1.68f, 0.29f, 2.37f, 0.88f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(14f, 16f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _Humidity = it}
