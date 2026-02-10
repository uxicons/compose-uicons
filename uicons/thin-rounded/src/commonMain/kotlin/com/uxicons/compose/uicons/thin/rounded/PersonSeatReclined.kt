package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeatReclined: ImageVector? = null

val Icons.Tr.PersonSeatReclined: ImageVector
    get() = _PersonSeatReclined ?: UXIcon(name = "PersonSeatReclined") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.88f, 0f, 4.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-0.95f, 0f, -1.81f, -0.53f, -2.24f, -1.38f)
                lineToRelative(-2.4f, -4.79f)
                curveToRelative(-0.26f, -0.51f, -0.77f, -0.83f, -1.34f, -0.83f)
                horizontalLineToRelative(-6.71f)
                curveToRelative(-1.14f, 0f, -2.14f, -0.77f, -2.42f, -1.88f)
                lineToRelative(-1.92f, -7.5f)
                curveToRelative(-0.07f, -0.27f, 0.09f, -0.54f, 0.36f, -0.61f)
                curveToRelative(0.27f, -0.07f, 0.54f, 0.09f, 0.61f, 0.36f)
                lineToRelative(0.93f, 3.62f)
                horizontalLineToRelative(7.39f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7.14f)
                lineToRelative(0.74f, 2.87f)
                curveToRelative(0.17f, 0.66f, 0.77f, 1.13f, 1.45f, 1.13f)
                horizontalLineToRelative(6.71f)
                curveToRelative(0.95f, 0f, 1.81f, 0.53f, 2.24f, 1.38f)
                lineToRelative(2.4f, 4.79f)
                curveToRelative(0.26f, 0.51f, 0.77f, 0.83f, 1.34f, 0.83f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(15f, 19.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-6.14f)
                curveToRelative(-2.54f, 0f, -4.74f, -1.72f, -5.34f, -4.19f)
                lineTo(1.01f, 7.62f)
                curveToRelative(-0.07f, -0.27f, 0.1f, -0.54f, 0.37f, -0.6f)
                curveToRelative(0.27f, -0.07f, 0.54f, 0.1f, 0.6f, 0.37f)
                lineToRelative(2.0f, 8.19f)
                curveToRelative(0.49f, 2.02f, 2.29f, 3.43f, 4.37f, 3.43f)
                horizontalLineToRelative(6.14f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _PersonSeatReclined = it}
