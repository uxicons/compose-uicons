package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountDownAlt: ImageVector? = null

val Icons.Ts.SortAmountDownAlt: ImageVector
    get() = _SortAmountDownAlt ?: UXIcon(name = "SortAmountDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.1f, 18.6f)
                lineToRelative(-4.1f, 4.1f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 22.71f)
                lineTo(0.9f, 18.6f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(-0.71f, -0.71f)
                close()
                moveTo(24f, 2f)
                verticalLineToRelative(1f)
                lineTo(10f, 3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(14f)
                close()
                moveTo(10f, 6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                lineTo(10f, 7f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(10f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _SortAmountDownAlt = it}
