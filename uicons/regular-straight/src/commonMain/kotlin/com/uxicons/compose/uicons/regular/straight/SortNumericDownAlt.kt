package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortNumericDownAlt: ImageVector? = null

val Icons.Rs.SortNumericDownAlt: ImageVector
    get() = _SortNumericDownAlt ?: UXIcon(name = "SortNumericDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.36f, 0f, 0.71f, -0.07f, 1.04f, -0.17f)
                curveToRelative(-0.67f, 1.29f, -1.99f, 2.17f, -3.54f, 2.17f)
                verticalLineToRelative(2f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(17f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(21f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.62f)
                lineToRelative(-1.28f, 1.32f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.21f, -3.3f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(10.5f, 17.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.41f, -0.58f)
                lineTo(0.09f, 18.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.5f, 3.5f)
                lineTo(5f, 0f)
                horizontalLineToRelative(2f)
                lineTo(7f, 21f)
                lineToRelative(3.5f, -3.5f)
                close()
            }
        }.also { _SortNumericDownAlt = it}
