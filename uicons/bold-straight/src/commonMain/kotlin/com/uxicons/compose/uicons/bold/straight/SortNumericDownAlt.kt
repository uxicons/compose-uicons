package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortNumericDownAlt: ImageVector? = null

val Icons.Bs.SortNumericDownAlt: ImageVector
    get() = _SortNumericDownAlt ?: UXIcon(name = "SortNumericDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.79f, 14f)
                lineToRelative(-3.86f, 3.95f)
                lineToRelative(2.15f, 2.1f)
                lineToRelative(0.93f, -0.95f)
                verticalLineToRelative(4.9f)
                horizontalLineToRelative(3f)
                lineTo(22.0f, 14f)
                horizontalLineToRelative(-2.21f)
                close()
                moveTo(23f, 4f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.71f, -3.01f, 6.5f, -7f, 6.5f)
                verticalLineToRelative(-3f)
                curveToRelative(1.06f, 0f, 2.12f, -0.34f, 2.88f, -1.0f)
                curveToRelative(-2.15f, -0.06f, -3.88f, -1.83f, -3.88f, -4.0f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(19f, 5.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(13.02f, 18.52f)
                lineToRelative(-4.75f, 4.75f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineTo(-0.02f, 18.52f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.9f, 2.9f)
                lineTo(5.0f, 0f)
                horizontalLineToRelative(3f)
                lineTo(8.0f, 19.29f)
                lineToRelative(2.9f, -2.9f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _SortNumericDownAlt = it}
