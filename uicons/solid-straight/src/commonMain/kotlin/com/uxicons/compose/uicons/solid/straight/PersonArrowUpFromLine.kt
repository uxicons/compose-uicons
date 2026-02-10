package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonArrowUpFromLine: ImageVector? = null

val Icons.Ss.PersonArrowUpFromLine: ImageVector
    get() = _PersonArrowUpFromLine ?: UXIcon(name = "PersonArrowUpFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 2.5f)
                curveTo(2.5f, 1.12f, 3.62f, 0f, 5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18f, 6.08f)
                verticalLineToRelative(12.92f)
                horizontalLineToRelative(2f)
                lineTo(20f, 6.08f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.54f, -3.54f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.54f, -2.54f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(2f, 22f)
                verticalLineToRelative(-5f)
                lineTo(0f, 17f)
                lineTo(0f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(7f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                lineTo(24f, 22f)
                close()
                moveTo(4f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _PersonArrowUpFromLine = it}
