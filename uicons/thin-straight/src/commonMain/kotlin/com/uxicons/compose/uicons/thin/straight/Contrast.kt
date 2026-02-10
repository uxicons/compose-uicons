package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Contrast: ImageVector? = null

val Icons.Ts.Contrast: ImageVector
    get() = _Contrast ?: UXIcon(name = "Contrast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(21f, 11.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(0f, 12.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(3.16f, 20.13f)
                lineTo(3.87f, 20.84f)
                lineTo(5.99f, 18.72f)
                lineTo(5.28f, 18.01f)
                close()
                moveTo(18.01f, 5.28f)
                lineTo(18.72f, 5.99f)
                lineTo(20.84f, 3.87f)
                lineTo(20.13f, 3.16f)
                close()
                moveTo(18.01f, 18.72f)
                lineTo(20.13f, 20.84f)
                lineTo(20.84f, 20.13f)
                lineTo(18.72f, 18.01f)
                close()
                moveTo(5.99f, 5.28f)
                lineTo(3.87f, 3.16f)
                lineTo(3.16f, 3.87f)
                lineTo(5.28f, 5.99f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                close()
            }
        }.also { _Contrast = it}
