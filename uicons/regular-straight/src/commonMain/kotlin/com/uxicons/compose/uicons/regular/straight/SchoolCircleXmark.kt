package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SchoolCircleXmark: ImageVector? = null

val Icons.Rs.SchoolCircleXmark: ImageVector
    get() = _SchoolCircleXmark ?: UXIcon(name = "SchoolCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(2.35f)
                curveToRelative(-0.57f, -0.71f, -1.24f, -1.32f, -2f, -1.83f)
                verticalLineToRelative(-0.52f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-5.59f, 5.59f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(7.52f)
                curveToRelative(0.51f, 0.76f, 1.12f, 1.43f, 1.83f, 2f)
                horizontalLineToRelative(-11.35f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6.59f)
                lineToRelative(1.41f, -1.41f)
                verticalLineToRelative(-4.59f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-3.75f, 2.34f)
                lineToRelative(1.16f, 1.16f)
                horizontalLineToRelative(6.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7.59f, 8f)
                horizontalLineToRelative(-4.59f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.59f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(18.54f, 14.04f)
                lineTo(17f, 15.59f)
                lineTo(15.46f, 14.04f)
                lineTo(14.04f, 15.46f)
                lineTo(15.59f, 17f)
                lineTo(14.04f, 18.54f)
                lineTo(15.46f, 19.96f)
                lineTo(17f, 18.41f)
                lineTo(18.54f, 19.96f)
                lineTo(19.96f, 18.54f)
                lineTo(18.41f, 17f)
                lineTo(19.96f, 15.46f)
                close()
            }
        }.also { _SchoolCircleXmark = it}
