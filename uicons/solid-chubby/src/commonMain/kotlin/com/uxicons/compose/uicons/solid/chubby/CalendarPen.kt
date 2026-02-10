package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPen: ImageVector? = null

val Icons.Sc.CalendarPen: ImageVector
    get() = _CalendarPen ?: UXIcon(name = "CalendarPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.38f, 6.79f)
                curveToRelative(4.49f, 0f, 8.47f, 0.77f, 10.07f, 1.12f)
                curveToRelative(-0.33f, -2.21f, -0.8f, -3.62f, -0.82f, -3.69f)
                curveToRelative(-0.11f, -0.32f, -0.37f, -0.57f, -0.7f, -0.65f)
                curveToRelative(-0.05f, -0.01f, -0.46f, -0.12f, -1.14f, -0.25f)
                verticalLineToRelative(-0.82f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.34f)
                curveToRelative(-1.3f, -0.16f, -2.81f, -0.28f, -4.41f, -0.28f)
                reflectiveCurveToRelative(-3.11f, 0.12f, -4.41f, 0.28f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.82f)
                curveToRelative(-0.68f, 0.14f, -1.09f, 0.24f, -1.14f, 0.25f)
                curveToRelative(-0.33f, 0.08f, -0.59f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.03f, 0.09f, -0.49f, 1.5f, -0.81f, 3.67f)
                curveToRelative(1.55f, -0.34f, 5.54f, -1.11f, 10.06f, -1.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.61f, 20.43f)
                curveToRelative(0.08f, -1.74f, 0.79f, -3.37f, 2.02f, -4.6f)
                lineToRelative(4.86f, -4.72f)
                curveToRelative(0.89f, -0.89f, 2.17f, -1.4f, 3.5f, -1.4f)
                curveToRelative(0.09f, 0f, 0.19f, 0.0f, 0.28f, 0.01f)
                curveToRelative(-1.83f, -0.37f, -5.22f, -0.92f, -8.9f, -0.92f)
                curveToRelative(-5.44f, 0f, -10.28f, 1.22f, -10.3f, 1.22f)
                curveToRelative(-0.05f, 0.66f, -0.08f, 1.36f, -0.08f, 2.09f)
                curveToRelative(0f, 4.46f, 1.08f, 7.74f, 1.13f, 7.88f)
                curveToRelative(0.11f, 0.32f, 0.37f, 0.57f, 0.7f, 0.65f)
                curveToRelative(0.09f, 0.02f, 2.27f, 0.58f, 5.27f, 0.86f)
                curveToRelative(0.02f, 0.0f, 0.86f, 0.0f, 1.46f, 0.0f)
                lineToRelative(0.05f, -1.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.12f, 12.55f)
                curveToRelative(-1.14f, -1.14f, -3.12f, -1.12f, -4.24f, -0.01f)
                lineToRelative(-4.84f, 4.7f)
                curveToRelative(-0.87f, 0.88f, -1.39f, 2.04f, -1.44f, 3.27f)
                lineToRelative(-0.06f, 1.44f)
                curveToRelative(0.05f, 1.1f, 1.03f, 1.04f, 1.04f, 1.04f)
                lineToRelative(1.44f, -0.06f)
                curveToRelative(1.24f, -0.05f, 2.4f, -0.56f, 3.26f, -1.43f)
                lineToRelative(4.84f, -4.7f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.08f, 0f, -4.25f)
                close()
            }
        }.also { _CalendarPen = it}
