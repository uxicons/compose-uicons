package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CourtSport: ImageVector? = null

val Icons.Ts.CourtSport: ImageVector
    get() = _CourtSport ?: UXIcon(name = "CourtSport") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                lineTo(1f, 15f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11.5f, 20f)
                lineTo(2.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-8f)
                lineTo(1f, 8f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4.05f)
                curveToRelative(-1.97f, 0.25f, -3.5f, 1.92f, -3.5f, 3.95f)
                reflectiveCurveToRelative(1.53f, 3.7f, 3.5f, 3.95f)
                verticalLineToRelative(4.05f)
                close()
                moveTo(9f, 12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
                moveTo(23f, 8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-4.05f)
                curveToRelative(1.97f, -0.25f, 3.5f, -1.92f, 3.5f, -3.95f)
                reflectiveCurveToRelative(-1.53f, -3.7f, -3.5f, -3.95f)
                verticalLineToRelative(-4.05f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _CourtSport = it}
