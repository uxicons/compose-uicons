package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CourtSport: ImageVector? = null

val Icons.Ss.CourtSport: ImageVector
    get() = _CourtSport ?: UXIcon(name = "CourtSport") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(14f, 12f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5.14f)
                curveToRelative(1.72f, 0.45f, 3f, 2.0f, 3f, 3.86f)
                reflectiveCurveToRelative(-1.28f, 3.41f, -3f, 3.86f)
                verticalLineToRelative(5.14f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(11f, 15.86f)
                curveToRelative(-1.72f, -0.45f, -3f, -2.0f, -3f, -3.86f)
                reflectiveCurveToRelative(1.28f, -3.41f, 3f, -3.86f)
                lineTo(11f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5.14f)
                close()
            }
        }.also { _CourtSport = it}
