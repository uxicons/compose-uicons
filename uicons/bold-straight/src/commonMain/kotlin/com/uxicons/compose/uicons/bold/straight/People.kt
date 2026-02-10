package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _People: ImageVector? = null

val Icons.Bs.People: ImageVector
    get() = _People ?: UXIcon(name = "People") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(1.49f, -11.93f)
                curveToRelative(0.22f, -1.75f, 1.71f, -3.07f, 3.47f, -3.07f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.76f, 0f, 3.25f, 1.32f, 3.47f, 3.07f)
                lineToRelative(1.49f, 11.93f)
                horizontalLineToRelative(-2.2f)
                close()
                moveTo(15.2f, 18f)
                horizontalLineToRelative(4.6f)
                lineToRelative(-1.07f, -8.56f)
                curveToRelative(-0.03f, -0.25f, -0.24f, -0.44f, -0.5f, -0.44f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.25f, 0f, -0.46f, 0.19f, -0.5f, 0.44f)
                lineToRelative(-1.07f, 8.56f)
                close()
                moveTo(5.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(6.88f, 0f, 5.5f, 0f)
                reflectiveCurveTo(3f, 1.12f, 3f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(11f, 9.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                lineTo(2f, 24f)
                verticalLineToRelative(-6f)
                lineTo(0f, 18f)
                lineTo(0f, 9.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(7.5f, 6f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(3f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _People = it}
