package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonChalkboard: ImageVector? = null

val Icons.Ts.PersonChalkboard: ImageVector
    get() = _PersonChalkboard ?: UXIcon(name = "PersonChalkboard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.88f, 0f, 4.5f, 0f)
                reflectiveCurveTo(2f, 1.12f, 2f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                lineTo(3f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                lineTo(0f, 8.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(15f, 6f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                lineTo(6f, 16f)
                verticalLineToRelative(-7f)
                close()
                moveTo(24f, 2.5f)
                lineTo(24f, 15f)
                lineTo(9f, 15f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(14f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(8.73f, 1f)
                curveToRelative(-0.12f, -0.36f, -0.29f, -0.69f, -0.49f, -1f)
                horizontalLineToRelative(13.26f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _PersonChalkboard = it}
