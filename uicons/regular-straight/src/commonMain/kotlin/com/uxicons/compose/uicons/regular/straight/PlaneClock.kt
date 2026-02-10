package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneClock: ImageVector? = null

val Icons.Rs.PlaneClock: ImageVector
    get() = _PlaneClock ?: UXIcon(name = "PlaneClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(13f, 17.58f)
                lineTo(14.47f, 19.01f)
                lineTo(13.08f, 20.44f)
                lineTo(11f, 18.42f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(2f)
                close()
                moveTo(21f, 9f)
                horizontalLineToRelative(-3.34f)
                lineToRelative(-4.21f, -7.44f)
                curveToRelative(-0.53f, -0.96f, -1.53f, -1.56f, -2.63f, -1.56f)
                horizontalLineToRelative(-3.72f)
                lineToRelative(2.9f, 9f)
                horizontalLineToRelative(-3.58f)
                lineToRelative(-2.3f, -2.3f)
                curveToRelative(-0.45f, -0.45f, -1.06f, -0.7f, -1.7f, -0.7f)
                curveToRelative(-0.87f, 0f, -1.64f, 0.45f, -2.08f, 1.2f)
                curveToRelative(-0.44f, 0.75f, -0.44f, 1.65f, -0.01f, 2.4f)
                lineToRelative(3.09f, 5.4f)
                horizontalLineToRelative(1.18f)
                curveToRelative(0.29f, -0.73f, 0.69f, -1.4f, 1.17f, -2f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(-2.51f, -4.4f)
                curveToRelative(-0.1f, -0.18f, -0.04f, -0.33f, 0.0f, -0.4f)
                reflectiveCurveToRelative(0.15f, -0.2f, 0.35f, -0.2f)
                curveToRelative(0.11f, 0f, 0.21f, 0.04f, 0.28f, 0.12f)
                lineToRelative(2.88f, 2.88f)
                horizontalLineToRelative(15.43f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.76f)
                curveToRelative(0.48f, 0.6f, 0.88f, 1.27f, 1.17f, 2f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9.83f, 2f)
                horizontalLineToRelative(0.98f)
                curveToRelative(0.37f, 0f, 0.7f, 0.2f, 0.89f, 0.54f)
                lineToRelative(3.66f, 6.46f)
                horizontalLineToRelative(-3.27f)
                lineToRelative(-2.25f, -7f)
                close()
            }
        }.also { _PlaneClock = it}
