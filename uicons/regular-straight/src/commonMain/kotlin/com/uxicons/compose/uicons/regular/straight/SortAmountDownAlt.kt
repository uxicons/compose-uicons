package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountDownAlt: ImageVector? = null

val Icons.Rs.SortAmountDownAlt: ImageVector
    get() = _SortAmountDownAlt ?: UXIcon(name = "SortAmountDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                lineTo(24f, 2f)
                lineTo(10f, 2f)
                lineTo(10f, 0f)
                horizontalLineToRelative(14f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                lineTo(10f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                lineTo(10f, 10f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 17f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 21f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 21f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0.09f, 19.91f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.5f, 2.5f)
                close()
            }
        }.also { _SortAmountDownAlt = it}
