package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsAndVenusBurst: ImageVector? = null

val Icons.Sr.MarsAndVenusBurst: ImageVector
    get() = _MarsAndVenusBurst ?: UXIcon(name = "MarsAndVenusBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-3.83f, 3.83f)
                curveToRelative(-0.79f, -0.52f, -1.74f, -0.83f, -2.75f, -0.83f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.1f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                curveToRelative(0f, -1.02f, -0.31f, -1.96f, -0.83f, -2.75f)
                lineToRelative(3.83f, -3.83f)
                verticalLineToRelative(2.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(8.35f, 15.12f)
                lineToRelative(-4.9f, 1.88f)
                curveToRelative(-0.69f, 0.23f, -1.34f, -0.43f, -1.09f, -1.11f)
                lineToRelative(2f, -3.91f)
                lineTo(0.46f, 10.39f)
                curveToRelative(-0.6f, -0.26f, -0.62f, -1.1f, -0.03f, -1.39f)
                lineToRelative(4.0f, -1.84f)
                lineTo(1.04f, 2.09f)
                curveToRelative(-0.4f, -0.67f, 0.34f, -1.44f, 1.03f, -1.08f)
                lineTo(7.5f, 3.84f)
                lineToRelative(1.77f, -3.31f)
                curveToRelative(0.38f, -0.71f, 1.41f, -0.71f, 1.79f, 0f)
                lineToRelative(1.63f, 3.59f)
                curveToRelative(-3.24f, 0.61f, -5.69f, 3.46f, -5.69f, 6.87f)
                curveToRelative(0f, 1.54f, 0.51f, 2.97f, 1.35f, 4.12f)
                close()
            }
        }.also { _MarsAndVenusBurst = it}
