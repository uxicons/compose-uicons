package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortNumericDown: ImageVector? = null

val Icons.Ss.SortNumericDown: ImageVector
    get() = _SortNumericDown ?: UXIcon(name = "SortNumericDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.91f, 18.91f)
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
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(18f, 3.38f)
                verticalLineToRelative(7.62f)
                horizontalLineToRelative(2f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-3.22f, 3.3f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.28f, -1.32f)
                close()
                moveTo(22f, 16.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                verticalLineToRelative(-2f)
                curveToRelative(1.54f, 0f, 2.88f, -0.88f, 3.55f, -2.16f)
                curveToRelative(-0.33f, 0.1f, -0.69f, 0.16f, -1.05f, 0.16f)
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
            }
        }.also { _SortNumericDown = it}
