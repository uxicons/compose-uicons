package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadCheck: ImageVector? = null

val Icons.Rs.RoadCheck: ImageVector
    get() = _RoadCheck ?: UXIcon(name = "RoadCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.03f, 24f)
                horizontalLineToRelative(-12.06f)
                lineToRelative(3.77f, -21.52f)
                curveToRelative(0.25f, -1.44f, 1.5f, -2.48f, 2.96f, -2.48f)
                horizontalLineToRelative(10.64f)
                curveToRelative(1.46f, 0f, 2.7f, 1.04f, 2.96f, 2.48f)
                lineToRelative(1.32f, 7.57f)
                curveToRelative(-0.68f, -0.37f, -1.41f, -0.65f, -2.18f, -0.83f)
                lineToRelative(-1.11f, -6.39f)
                curveToRelative(-0.08f, -0.48f, -0.5f, -0.83f, -0.98f, -0.83f)
                horizontalLineToRelative(-10.64f)
                curveToRelative(-0.49f, 0f, -0.9f, 0.35f, -0.98f, 0.83f)
                lineToRelative(-3.35f, 19.17f)
                horizontalLineToRelative(7.95f)
                curveToRelative(0.47f, 0.75f, 1.06f, 1.43f, 1.74f, 2f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(22f, 17.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(16.88f, 17.84f)
                lineTo(15.45f, 16.45f)
                lineTo(14.05f, 17.89f)
                lineTo(15.74f, 19.52f)
                curveToRelative(0.31f, 0.32f, 0.73f, 0.47f, 1.14f, 0.47f)
                reflectiveCurveToRelative(0.82f, -0.15f, 1.13f, -0.46f)
                lineToRelative(2.94f, -2.86f)
                lineToRelative(-1.39f, -1.44f)
                lineToRelative(-2.68f, 2.6f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _RoadCheck = it}
