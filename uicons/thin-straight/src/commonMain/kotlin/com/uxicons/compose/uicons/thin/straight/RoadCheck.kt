package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadCheck: ImageVector? = null

val Icons.Ts.RoadCheck: ImageVector
    get() = _RoadCheck ?: UXIcon(name = "RoadCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.63f)
                curveToRelative(-0.35f, 0.26f, -0.69f, 0.54f, -1f, 0.85f)
                close()
                moveTo(11.02f, 23f)
                horizontalLineToRelative(-9.77f)
                lineToRelative(3.63f, -20.76f)
                curveToRelative(0.12f, -0.72f, 0.75f, -1.24f, 1.48f, -1.24f)
                horizontalLineToRelative(11.28f)
                curveToRelative(0.73f, 0f, 1.35f, 0.52f, 1.48f, 1.24f)
                lineToRelative(1.28f, 7.27f)
                curveToRelative(0.38f, 0.14f, 0.75f, 0.3f, 1.1f, 0.49f)
                lineToRelative(-1.4f, -7.93f)
                curveToRelative(-0.21f, -1.2f, -1.25f, -2.07f, -2.46f, -2.07f)
                horizontalLineToRelative(-11.28f)
                curveToRelative(-1.22f, 0f, -2.25f, 0.87f, -2.46f, 2.07f)
                lineToRelative(-3.84f, 21.93f)
                horizontalLineToRelative(11.96f)
                curveToRelative(-0.36f, -0.3f, -0.7f, -0.64f, -1.0f, -1f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(16.98f, 18.95f)
                curveToRelative(-0.08f, 0.08f, -0.14f, 0.09f, -0.24f, -0.01f)
                lineToRelative(-1.86f, -1.8f)
                lineToRelative(-0.69f, 0.72f)
                lineToRelative(1.85f, 1.79f)
                curveToRelative(0.22f, 0.22f, 0.51f, 0.34f, 0.82f, 0.34f)
                reflectiveCurveToRelative(0.6f, -0.12f, 0.82f, -0.34f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-3.46f, 3.4f)
                close()
                moveTo(12.5f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _RoadCheck = it}
