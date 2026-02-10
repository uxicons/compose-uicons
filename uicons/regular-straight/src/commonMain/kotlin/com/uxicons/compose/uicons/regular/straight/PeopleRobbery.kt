package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeopleRobbery: ImageVector? = null

val Icons.Rs.PeopleRobbery: ImageVector
    get() = _PeopleRobbery ?: UXIcon(name = "PeopleRobbery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(4.88f, 0f, 3.5f, 0f)
                reflectiveCurveTo(1f, 1.12f, 1f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24f, 4.97f)
                lineToRelative(-3f, 2.53f)
                lineTo(21f, 24f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 7.5f)
                lineToRelative(-3f, -2.53f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 4.03f)
                lineToRelative(2.36f, 1.97f)
                horizontalLineToRelative(4.28f)
                lineToRelative(2.36f, -1.97f)
                lineTo(22.0f, 0f)
                horizontalLineToRelative(2f)
                lineTo(24.0f, 4.97f)
                close()
                moveTo(19f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(8.94f, 11f)
                horizontalLineToRelative(2.06f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(-2.06f, -2.21f)
                verticalLineToRelative(6.21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                lineTo(2f, 24f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                lineTo(0f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(0.97f, 0f, 1.82f, 0.47f, 2.37f, 1.18f)
                lineToRelative(3.57f, 3.82f)
                close()
                moveTo(4f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _PeopleRobbery = it}
