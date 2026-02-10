package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSalary: ImageVector? = null

val Icons.Bs.UserSalary: ImageVector
    get() = _UserSalary ?: UXIcon(name = "UserSalary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 15f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 0.29f, 0.18f, 0.56f, 0.45f, 0.67f)
                lineToRelative(2.21f, 0.89f)
                curveToRelative(1.42f, 0.57f, 2.34f, 1.92f, 2.34f, 3.45f)
                curveToRelative(0f, 1.58f, -1.06f, 2.9f, -2.5f, 3.34f)
                verticalLineToRelative(1.16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.16f)
                curveToRelative(-1.44f, -0.43f, -2.5f, -1.76f, -2.5f, -3.34f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.29f, -0.18f, -0.56f, -0.45f, -0.67f)
                lineToRelative(-2.21f, -0.89f)
                curveToRelative(-1.42f, -0.57f, -2.34f, -1.92f, -2.34f, -3.45f)
                curveToRelative(0f, -1.58f, 1.06f, -2.9f, 2.5f, -3.34f)
                verticalLineToRelative(-1.16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.16f)
                curveToRelative(1.44f, 0.43f, 2.5f, 1.76f, 2.5f, 3.34f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(2f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                close()
                moveTo(17f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(7.69f, 0f, 11f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(14f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _UserSalary = it}
