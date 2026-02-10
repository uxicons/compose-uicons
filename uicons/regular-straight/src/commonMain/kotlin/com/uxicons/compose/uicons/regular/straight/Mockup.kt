package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mockup: ImageVector? = null

val Icons.Rs.Mockup: ImageVector
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
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14f, 0f)
                lineTo(14f, 1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                lineTo(10f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 6.72f)
                lineToRelative(3f, 1f)
                lineTo(3f, 24f)
                lineTo(14.31f, 24f)
                lineToRelative(-0.68f, -2f)
                lineTo(5f, 22f)
                lineTo(5f, 6.28f)
                lineToRelative(-3f, -1f)
                lineTo(2f, 2f)
                horizontalLineToRelative(6.13f)
                curveToRelative(0.44f, 1.72f, 2.01f, 3f, 3.87f, 3f)
                reflectiveCurveToRelative(3.43f, -1.28f, 3.87f, -3f)
                horizontalLineToRelative(6.13f)
                verticalLineToRelative(3.28f)
                lineToRelative(-3f, 1f)
                verticalLineToRelative(7.75f)
                lineToRelative(2f, 0.68f)
                lineTo(21f, 7.72f)
                lineToRelative(3f, -1f)
                lineTo(24f, 0f)
                lineTo(14f, 0f)
                close()
            }
        }.also { _Mockup = it}
