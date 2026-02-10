package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountUpAlt: ImageVector? = null

val Icons.Ts.SortAmountUpAlt: ImageVector
    get() = _SortAmountUpAlt ?: UXIcon(name = "SortAmountUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.81f, 4.69f)
                lineTo(6.56f, 0.44f)
                curveToRelative(-0.29f, -0.29f, -0.68f, -0.44f, -1.06f, -0.44f)
                reflectiveCurveToRelative(-0.77f, 0.15f, -1.06f, 0.44f)
                lineTo(0.19f, 4.69f)
                lineToRelative(0.71f, 0.71f)
                lineTo(5f, 1.29f)
                lineTo(5f, 24.0f)
                horizontalLineToRelative(1f)
                lineTo(6f, 1.29f)
                lineToRelative(4.1f, 4.1f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(1f)
                lineTo(10f, 10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(14f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1f)
                lineTo(10f, 13f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 18f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                lineTo(10f, 17f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _SortAmountUpAlt = it}
