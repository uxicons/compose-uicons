package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortNumericDown: ImageVector? = null

val Icons.Rs.SortNumericDown: ImageVector
    get() = _SortNumericDown ?: UXIcon(name = "SortNumericDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.72f, 4.7f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.22f, -3.3f)
                horizontalLineToRelative(1.42f)
                lineToRelative(0.08f, 1f)
                lineTo(20f, 11f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 3.38f)
                lineToRelative(-1.28f, 1.32f)
                close()
                moveTo(22f, 16.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                verticalLineToRelative(-2f)
                curveToRelative(1.54f, 0f, 2.87f, -0.89f, 3.54f, -2.17f)
                curveToRelative(-0.33f, 0.1f, -0.68f, 0.17f, -1.04f, 0.17f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18.5f, 18f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(7f, 21f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 21f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(0.09f, 18.91f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.5f, 3.5f)
                close()
            }
        }.also { _SortNumericDown = it}
