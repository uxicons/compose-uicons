package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeopleRobbery: ImageVector? = null

val Icons.Bs.PeopleRobbery: ImageVector
    get() = _PeopleRobbery ?: UXIcon(name = "PeopleRobbery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24f, 5.78f)
                lineToRelative(-3f, 2.84f)
                verticalLineToRelative(15.38f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                lineTo(13f, 8.62f)
                lineToRelative(-3f, -2.84f)
                lineTo(10f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13f, 4.49f)
                lineToRelative(1.6f, 1.51f)
                horizontalLineToRelative(4.81f)
                lineToRelative(1.6f, -1.51f)
                lineTo(21.0f, 0f)
                horizontalLineToRelative(3f)
                lineTo(24.0f, 5.78f)
                close()
                moveTo(18f, 15f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9.22f, 11f)
                horizontalLineToRelative(1.78f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.22f)
                lineToRelative(-0.78f, -0.97f)
                verticalLineToRelative(4.97f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                lineTo(2f, 24f)
                verticalLineToRelative(-6f)
                lineTo(0f, 18f)
                lineTo(0f, 9.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.03f, 0f, 1.94f, 0.45f, 2.58f, 1.16f)
                lineToRelative(3.14f, 3.84f)
                close()
                moveTo(3f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _PeopleRobbery = it}
