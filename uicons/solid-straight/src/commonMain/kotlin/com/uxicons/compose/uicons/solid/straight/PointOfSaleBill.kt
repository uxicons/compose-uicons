package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointOfSaleBill: ImageVector? = null

val Icons.Ss.PointOfSaleBill: ImageVector
    get() = _PointOfSaleBill ?: UXIcon(name = "PointOfSaleBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 7f)
                lineTo(3f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 13f)
                lineTo(3f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(12.08f, 5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(8.41f)
                curveToRelative(-1.77f, 1.06f, -3.03f, 2.88f, -3.33f, 5f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(12.59f)
                lineToRelative(-3.13f, -1.9f)
                lineToRelative(-2.87f, 1.81f)
                lineToRelative(-2f, -1.26f)
                verticalLineToRelative(-7.24f)
                curveToRelative(0f, -1.63f, -0.79f, -3.06f, -2f, -3.98f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _PointOfSaleBill = it}
