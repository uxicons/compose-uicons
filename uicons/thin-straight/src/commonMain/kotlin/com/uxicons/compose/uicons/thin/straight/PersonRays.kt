package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonRays: ImageVector? = null

val Icons.Ts.PersonRays: ImageVector
    get() = _PersonRays ?: UXIcon(name = "PersonRays") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.35f, 17.95f)
                lineToRelative(0.71f, 0.71f)
                lineTo(0.75f, 23.95f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.3f, -5.3f)
                close()
                moveTo(23.95f, 0.75f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-5.3f, 5.3f)
                lineToRelative(0.71f, 0.71f)
                lineTo(23.95f, 0.75f)
                close()
                moveTo(17.95f, 18.65f)
                lineToRelative(5.3f, 5.3f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-5.3f, -5.3f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(0.05f, 0.75f)
                lineTo(5.35f, 6.05f)
                lineToRelative(0.71f, -0.71f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                close()
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(10.5f, 2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 8.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                lineTo(7.5f, 8.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(15.5f, 8.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.also { _PersonRays = it}
