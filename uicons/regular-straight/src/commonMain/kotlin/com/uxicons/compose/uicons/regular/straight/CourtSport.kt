package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CourtSport: ImageVector? = null

val Icons.Rs.CourtSport: ImageVector
    get() = _CourtSport ?: UXIcon(name = "CourtSport") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(2f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(2f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-8f)
                lineTo(2f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.0f, -3f, 3.86f)
                reflectiveCurveToRelative(1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(3.14f)
                lineTo(3f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2.0f, 3f, -3.86f)
                reflectiveCurveToRelative(-1.28f, -3.41f, -3f, -3.86f)
                verticalLineToRelative(-3.14f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(22f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _CourtSport = it}
