package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeopleGroup: ImageVector? = null

val Icons.Ss.PeopleGroup: ImageVector
    get() = _PeopleGroup ?: UXIcon(name = "PeopleGroup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(19.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(7f, 2.5f)
                curveTo(7f, 1.12f, 5.88f, 0f, 4.5f, 0f)
                reflectiveCurveTo(2f, 1.12f, 2f, 2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(5f, 11f)
                curveToRelative(0f, -2.16f, 1.39f, -3.99f, 3.31f, -4.69f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.4f, -0.2f, -0.84f, -0.31f, -1.31f, -0.31f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                lineTo(2f, 17f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                lineToRelative(1f, -0.04f)
                verticalLineToRelative(-5.96f)
                close()
                moveTo(19f, 16.96f)
                lineToRelative(1f, 0.04f)
                verticalLineToRelative(5f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0f, -8f, 0f, -8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.47f, 0f, -0.91f, 0.12f, -1.31f, 0.31f)
                horizontalLineToRelative(0f)
                curveToRelative(1.92f, 0.7f, 3.31f, 2.52f, 3.31f, 4.69f)
                verticalLineToRelative(5.96f)
                close()
            }
        }.also { _PeopleGroup = it}
