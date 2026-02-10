package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonArrowUpFromLine: ImageVector? = null

val Icons.Bs.PersonArrowUpFromLine: ImageVector
    get() = _PersonArrowUpFromLine ?: UXIcon(name = "PersonArrowUpFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(2f, 21f)
                verticalLineToRelative(-4f)
                lineTo(0f, 17f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(7.5f, 6f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(15f)
                close()
                moveTo(3f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(5f, 21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(3f)
                lineTo(20f, 7f)
                horizontalLineToRelative(3.5f)
                lineToRelative(-4.24f, -4.63f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineToRelative(-4.24f, 4.63f)
                horizontalLineToRelative(3.63f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _PersonArrowUpFromLine = it}
