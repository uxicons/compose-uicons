package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AccessDenied: ImageVector? = null

val Icons.Bs.AccessDenied: ImageVector
    get() = _AccessDenied ?: UXIcon(name = "AccessDenied") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.47f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(3.76f)
                curveToRelative(-0.7f, 0.87f, -1.21f, 1.89f, -1.5f, 3f)
                horizontalLineToRelative(-2.26f)
                close()
                moveTo(8f, 20f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8.76f)
                curveToRelative(-0.7f, -0.87f, -1.21f, -1.89f, -1.5f, -3f)
                close()
                moveTo(10f, 3f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _AccessDenied = it}
