package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Bs.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 11.38f)
                lineToRelative(2.56f, 2.56f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-3.44f, -3.44f)
                verticalLineToRelative(-5.62f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.38f)
                close()
                moveTo(18f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.46f)
                curveToRelative(-0.95f, 0.3f, -1.96f, 0.46f, -3f, 0.46f)
                reflectiveCurveToRelative(-2.05f, -0.16f, -3f, -0.46f)
                verticalLineToRelative(2.46f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-2.43f, -1.83f, -4f, -4.73f, -4f, -8.0f)
                reflectiveCurveToRelative(1.57f, -6.17f, 4f, -8.0f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.46f)
                curveToRelative(0.95f, -0.3f, 1.96f, -0.46f, 3f, -0.46f)
                reflectiveCurveToRelative(2.05f, 0.16f, 3f, 0.46f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.0f)
                curveToRelative(2.43f, 1.83f, 4f, 4.73f, 4f, 8.0f)
                reflectiveCurveToRelative(-1.57f, 6.17f, -4f, 8.0f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                close()
            }
        }.also { _Watch = it}
