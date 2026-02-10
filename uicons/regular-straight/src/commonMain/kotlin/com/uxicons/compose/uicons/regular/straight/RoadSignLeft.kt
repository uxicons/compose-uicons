package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadSignLeft: ImageVector? = null

val Icons.Rs.RoadSignLeft: ImageVector
    get() = _RoadSignLeft ?: UXIcon(name = "RoadSignLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10f)
                horizontalLineToRelative(-4.09f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.77f, 0.78f, -0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.3f, -2.29f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.5f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(23.05f, 9.7f)
                lineTo(14.3f, 0.95f)
                curveToRelative(-1.22f, -1.22f, -3.37f, -1.22f, -4.59f, 0f)
                lineTo(0.95f, 9.7f)
                curveToRelative(-0.61f, 0.61f, -0.95f, 1.43f, -0.95f, 2.3f)
                reflectiveCurveToRelative(0.34f, 1.68f, 0.95f, 2.29f)
                lineToRelative(8.76f, 8.76f)
                curveToRelative(0.63f, 0.63f, 1.46f, 0.95f, 2.29f, 0.95f)
                reflectiveCurveToRelative(1.66f, -0.32f, 2.3f, -0.95f)
                lineToRelative(8.76f, -8.76f)
                curveToRelative(0.61f, -0.61f, 0.95f, -1.43f, 0.95f, -2.3f)
                reflectiveCurveToRelative(-0.34f, -1.68f, -0.95f, -2.29f)
                close()
                moveTo(21.64f, 12.88f)
                lineToRelative(-8.76f, 8.76f)
                curveToRelative(-0.48f, 0.49f, -1.27f, 0.49f, -1.76f, 0f)
                lineTo(2.37f, 12.88f)
                curveToRelative(-0.23f, -0.23f, -0.36f, -0.55f, -0.36f, -0.88f)
                reflectiveCurveToRelative(0.13f, -0.65f, 0.36f, -0.88f)
                lineTo(11.12f, 2.36f)
                curveToRelative(0.23f, -0.23f, 0.55f, -0.36f, 0.88f, -0.36f)
                reflectiveCurveToRelative(0.65f, 0.13f, 0.88f, 0.36f)
                lineToRelative(8.76f, 8.76f)
                curveToRelative(0.23f, 0.23f, 0.36f, 0.55f, 0.36f, 0.88f)
                reflectiveCurveToRelative(-0.13f, 0.65f, -0.36f, 0.88f)
                close()
            }
        }.also { _RoadSignLeft = it}
