package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _People: ImageVector? = null

val Icons.Rs.People: ImageVector
    get() = _People ?: UXIcon(name = "People") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 2.5f)
                curveTo(2.5f, 1.12f, 3.62f, 0f, 5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(10f, 9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                lineTo(2f, 24f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                lineTo(0f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(7f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(19.38f, 0f, 18f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(1.42f, -11.37f)
                curveToRelative(0.19f, -1.5f, 1.47f, -2.63f, 2.98f, -2.63f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.51f, 0f, 2.79f, 1.13f, 2.98f, 2.63f)
                lineToRelative(1.42f, 11.37f)
                horizontalLineToRelative(-2.13f)
                close()
                moveTo(15.13f, 18f)
                horizontalLineToRelative(5.73f)
                lineToRelative(-1.14f, -9.12f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.38f, -0.99f, 0.88f)
                lineToRelative(-1.14f, 9.12f)
                close()
            }
        }.also { _People = it}
