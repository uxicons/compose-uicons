package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadCheck: ImageVector? = null

val Icons.Sr.RoadCheck: ImageVector
    get() = _RoadCheck ?: UXIcon(name = "RoadCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21.68f, 17.71f)
                lineTo(18.98f, 20.33f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
                reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
                lineToRelative(-1.35f, -1.33f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.35f, 1.33f)
                curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
                lineToRelative(2.71f, -2.62f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -1.59f, 0.47f, -3.07f, 1.27f, -4.32f)
                curveToRelative(-0.17f, -0.18f, -0.27f, -0.42f, -0.27f, -0.68f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0.76f)
                curveToRelative(1.37f, -1.1f, 3.11f, -1.76f, 5.0f, -1.76f)
                curveToRelative(1.79f, 0f, 3.44f, 0.59f, 4.77f, 1.58f)
                lineToRelative(-1.31f, -7.45f)
                curveToRelative(-0.42f, -2.4f, -2.49f, -4.13f, -4.92f, -4.13f)
                horizontalLineToRelative(-9.09f)
                curveToRelative(-2.44f, 0f, -4.51f, 1.74f, -4.92f, 4.14f)
                lineToRelative(-2.45f, 14f)
                curveToRelative(-0.26f, 1.46f, 0.14f, 2.94f, 1.1f, 4.08f)
                curveToRelative(0.95f, 1.13f, 2.35f, 1.78f, 3.83f, 1.78f)
                horizontalLineToRelative(7.72f)
                curveToRelative(-1.66f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
                moveTo(11.0f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _RoadCheck = it}
