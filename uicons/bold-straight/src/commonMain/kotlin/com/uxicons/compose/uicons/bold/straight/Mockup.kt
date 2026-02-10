package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mockup: ImageVector? = null

val Icons.Bs.Mockup: ImageVector
    get() = _Mockup ?: UXIcon(name = "Mockup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 14f)
                lineToRelative(10f, 3.42f)
                lineToRelative(-4.47f, 2.11f)
                lineToRelative(-2.11f, 4.47f)
                lineToRelative(-3.42f, -10f)
                close()
                moveTo(11f, 8f)
                lineTo(7f, 8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(7f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(17f, 12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(14.15f, 0f)
                lineToRelative(-0.19f, 1.29f)
                curveToRelative(-0.14f, 0.98f, -0.99f, 1.71f, -1.97f, 1.71f)
                reflectiveCurveToRelative(-1.82f, -0.74f, -1.96f, -1.71f)
                lineToRelative(-0.19f, -1.29f)
                lineTo(0f, 0f)
                lineTo(0f, 7.43f)
                lineToRelative(2f, 1f)
                verticalLineToRelative(15.57f)
                lineTo(14.31f, 24f)
                reflectiveCurveToRelative(-1.08f, -3f, -1.08f, -3f)
                lineTo(5f, 21f)
                reflectiveCurveToRelative(0f, -14.43f, 0f, -14.43f)
                lineToRelative(-2f, -1f)
                lineTo(3f, 3f)
                lineTo(7.43f, 3f)
                curveToRelative(0.78f, 1.78f, 2.56f, 3f, 4.57f, 3f)
                reflectiveCurveToRelative(3.79f, -1.22f, 4.57f, -3f)
                horizontalLineToRelative(4.43f)
                verticalLineToRelative(2.57f)
                lineToRelative(-2f, 1f)
                verticalLineToRelative(7.41f)
                reflectiveCurveToRelative(3f, 1.05f, 3f, 1.05f)
                verticalLineToRelative(-6.61f)
                reflectiveCurveToRelative(2f, -1f, 2f, -1f)
                lineTo(24f, 0f)
                lineTo(14.15f, 0f)
                close()
            }
        }.also { _Mockup = it}
